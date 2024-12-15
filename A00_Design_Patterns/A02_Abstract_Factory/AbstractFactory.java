package A00_Design_Patterns.A02_Abstract_Factory;

public class AbstractFactory {
  public static void main(String[] args) {
    LightThemeFactory lightThemeFactory = new LightThemeFactory();
    lightThemeFactory.renderUI();
  }
  
}

/* Products */

// 1. Product interfaces
abstract class Button {
  abstract void render();
}

abstract class Checkbox {
  abstract void render();
}

// 1. Concrete products
class LightButton extends Button {
  void render(){
    System.out.println("Render light-themed Button");
  }
}
class DarkButton extends Button {
  void render(){
    System.out.println("Render dark-themed Button");
  }
}

class LightCheckbox extends Checkbox {
  void render(){
    System.out.println("Render light-themed Checkbox");
  }
}
class DarkCheckbox extends Checkbox {
  void render(){
    System.out.println("Render dark-themed Checkbox");
  }
}


/* ------- Factory classes-------- */

// 1. Abstract factory interface
interface UIFactory {
  abstract Button createButton();
  abstract Checkbox createCheckbox();
}

// 2. Abstract factory implementations
class LightThemeFactory implements UIFactory {
  //factory methods
  public Button createButton(){
    return new LightButton();
  }
  public Checkbox createCheckbox(){
    return new LightCheckbox();
  }

  //business logic
  public void renderUI(){
    Button button = createButton();
    Checkbox checkbox = createCheckbox();

    button.render();
    checkbox.render();;
  }
}

class DarkThemeFactory implements UIFactory {
  //factory methods
  public Button createButton(){
    return new DarkButton();
  }
  public Checkbox createCheckbox(){
    return new DarkCheckbox();
  }

  //business logic
  public void renderUI(){
    Button button = createButton();
    Checkbox checkbox = createCheckbox();

    button.render();
    checkbox.render();;
  }
}
