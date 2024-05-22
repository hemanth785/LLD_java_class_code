package Library_management;

public class Address_and_Person {
  public class Address {
      private String streetAddress;
      private String city;
      private String state;
      private int zipCode;
      private String country;
  }

  public class Person {
      private String name;
      private Address address;
      private String email;
      private String phone;
  }
}
