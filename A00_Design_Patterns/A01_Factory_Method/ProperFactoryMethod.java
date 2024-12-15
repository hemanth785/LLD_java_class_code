package A00_Design_Patterns.A01_Factory_Method;

public class ProperFactoryMethod {
  public static void main(String[] args) {
    // client needs to call Factory class for planning delivary, 
    // factory method takes care of creating objects for correct Transports
    Logistics roadLogistics = new RoadLogistics();
    roadLogistics.planDelivary();;

    Logistics seaLogistics = new SeaLogistics();
    seaLogistics.planDelivary();;
  }
}

/* ----- Product classes----- */

// Abstract product
interface Transport {
  abstract void deliver();
}

//Concrete Products
class Truck implements Transport{
  public void deliver(){
    System.out.println("Deliver good via Truck");
  }
}

class Ship implements Transport{
  public void deliver(){
    System.out.println("Deliver good via Ship");
  }
}


/* ----- Factory(Creator) classes----- */

// Abstract creator
abstract class Logistics {
  //Factory method
  abstract Transport createTransport();

  //Business logic
  public void planDelivary(){
    Transport transport = createTransport();
    transport.deliver();
  }
}

//Actual factory classes
class RoadLogistics extends Logistics {
  public Transport createTransport(){
    return new Truck();
  }
}

class SeaLogistics extends Logistics {
  public Transport createTransport(){
    return new Ship();
  }
}



/*
 * Note: In this case, support we need to add new type of logistics (Air transport), 
 * then we can it by without modifying the existing code
 * 
 * 1. Creating new Product class
 * 2. Creating new Factory class (and this new factory class can be used by client )
 * 
 */

 // New product class
class Aeroplane implements Transport{
  public void deliver(){
    System.out.println("Deliver good via Aeroplane");
  }
}

// New Factory class
class AirLogistics extends Logistics {
  public Transport createTransport(){
    return new Aeroplane();
  }
}