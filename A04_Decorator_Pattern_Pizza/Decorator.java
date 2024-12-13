package A04_Decorator_Pattern_Pizza;


public class Decorator {
  public static void main(String[] args) {
    BasePizza regularPizza = new RegularPizza();
    System.out.println("Cost of regular pizza: "+ regularPizza.cost());

    //Add extra cheese to regular pizza
    BasePizza regularPizzaWithExtraCheese = new ExtraCheeseDecorator(regularPizza);
    System.out.println("Cost of regular pizza with extra cheese: "+ regularPizzaWithExtraCheese.cost());

    //Add Mushrooms to regular pizza with extra cheese
    BasePizza regregularPizzaWithExtraCheeseAndMushrooms = new MushroomDecorator(regularPizzaWithExtraCheese);
    System.out.println("Cost of regular pizza with extra cheese and mushoorms: "+ regregularPizzaWithExtraCheeseAndMushrooms.cost());
  }
}


//This is the base class
abstract class BasePizza{
  abstract int cost();
}

//implementation classes
class RegularPizza extends BasePizza {
  public int cost(){
    return 40;
  }
}

class Margherita extends BasePizza {
  public int cost(){
    return 60;
  }
}

/* --- decorator classes ---*/

// 1. Abstract decorator
abstract class ToppingsDecorator extends BasePizza {
  BasePizza basePizza;
}

// 2. Decoration implementations

class ExtraCheeseDecorator extends ToppingsDecorator {
  //constructor
  ExtraCheeseDecorator(BasePizza basePizza){
    this.basePizza = basePizza;
  }

  public int cost(){
    return basePizza.cost() + 10;
  }
}

class MushroomDecorator extends ToppingsDecorator {
  //constructor
  MushroomDecorator(BasePizza basePizza){
    this.basePizza = basePizza;
  }

  public int cost(){
    return basePizza.cost() + 15;
  }
}


