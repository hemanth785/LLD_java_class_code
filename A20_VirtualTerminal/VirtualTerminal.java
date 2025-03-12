package A20_VirtualTerminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Support basic commands ls, mkdir, cd, vim and pwd
public class VirtualTerminal {
  public static void main(String[] args) {
    Terminal terminal = new Terminal();
    terminal.pwd();

    terminal.mkdir("home");
    terminal.cd("home");
    terminal.pwd();

    terminal.mkdir("documents");
    terminal.cd("documents");
    terminal.pwd();

    terminal.cd("..");
    terminal.pwd();

    terminal.cd("documents");
    terminal.pwd();

    terminal.cd("test");
  }
}

class Terminal {
  Directory rootDirectory;
  Directory currentDirectory;
  String currentPath;

  Terminal(){
    rootDirectory = new Directory("/");
    rootDirectory.parent = rootDirectory;

    currentDirectory = rootDirectory;
    currentPath = "/";
  }

  public void pwd(){
    System.out.println("pwd: "+currentPath);
  }

  public void mkdir(String directoryName){
    currentDirectory.add(new Directory(directoryName, currentDirectory));
  }

  public void ls(){
    List<FileSystemComponent> directoryItems = currentDirectory.getDiretoryComponents();
    System.out.print("ls: ");
    for(FileSystemComponent item : directoryItems){
      System.out.print(item.getName() +", ");
    }
    System.out.println("");
  }

  public void cd(String directoryName){
    if(directoryName.equals("..")){
      //1. move to parent directory
      currentDirectory = currentDirectory.parent;
      if(!currentPath.equals("/")){
        List<String> pathItems = new ArrayList<String>(Arrays.asList(currentPath.split("/")));
        pathItems.remove(pathItems.size()-1);
        if(pathItems.size() == 1){
          currentPath = "/";
        } else {
          currentPath = String.join("/", pathItems);
        }
        
      }
      

    } else {
      //1. move to next directory
      List<FileSystemComponent> directoryItems = currentDirectory.getDiretoryComponents();
      for(FileSystemComponent item : directoryItems){
        if(item instanceof Directory){

          if(directoryName.equals(item.getName())){
            currentDirectory = (Directory)item;
            currentPath = currentPath.equals("/") ? currentPath+directoryName : currentPath+"/"+directoryName;
            return;
          }
        }
      }
      System.out.println("No such directory: "+directoryName);
    }
  }

}





interface FileSystemComponent {
  String getName();
}

// Leaf
class File implements FileSystemComponent {
  private String name;

  public File(String name) {
      this.name = name;
  }
  
  public String getName(){
    return name;
  }
}

// Composite
class Directory implements FileSystemComponent {
  private String name;
  private List<FileSystemComponent> components = new ArrayList<>();
  public Directory parent;

  public Directory(String name) {
    this.name = name;
  }

  public Directory(String name, Directory parent) {
      this.name = name;
      this.parent = parent; // this is required to move backwards, such as "cd .."
  }

  public void add(FileSystemComponent component) {
      components.add(component);
  }

  public void remove(FileSystemComponent component) {
      components.remove(component);
  }

  public List<FileSystemComponent> getDiretoryComponents(){
    return components;
  }

  public String getName(){
    return name;
  }

}
