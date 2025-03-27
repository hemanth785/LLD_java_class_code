package A00_Design_Patterns.A01_Factory_Method;

public class A_SimpleFactory {
  public static void main(String[] args) {
    TransportFactory factory = new TransportFactory();

    Transport transport = factory.getTransport("road");
    transport.deliver();
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
    System.out.println("Deliver goods via Truck");
  }
}

class Ship implements Transport{
  public void deliver(){
    System.out.println("Deliver goods via Ship");
  }
}



/* ----- Factory(Creator) classes----- */

// Simple Factory class
class TransportFactory {
  public Transport getTransport(String transportType){
    Transport transport;
    
    switch (transportType) {
      case "road":
        transport = new Truck();
        break;

      case "sea":
        transport = new Ship();
        break;
    
      default:
        transport = new Truck();
        break;
    }

    return transport;
  }
}

/* 
 * This looks fine as of now, But if we need to add new type of logistics, lets say 'Air transport', 
 * Then we have to modify the code of Transport factory.
 * -> That again voilates open closed principle
 */






