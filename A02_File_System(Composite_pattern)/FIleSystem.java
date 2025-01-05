import java.util.ArrayList;
import java.util.List;

public class FIleSystem {
  // Component
  interface FileSystemComponent {
    void display();
  }

  // Leaf
  class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
  }

  // Composite
  class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
  }

  // Client
  public class CompositePatternExample {
    public static void main(String[] args) {
        // Create leaf nodes
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Create composite nodes
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Build the tree structure
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Display the structure
        rootFolder.display();
    }
  }

}
