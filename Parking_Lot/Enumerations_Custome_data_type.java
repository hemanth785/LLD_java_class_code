// Enumeration
enum PaymentStatus {
  COMPLETED, 
  FAILED, 
  PENDING, 
  UNPAID, 
  REFUNDED
}

enum AccountStatus {
  ACTIVE, 
  CLOSED, 
  CANCELED, 
  BLACKLISTED, 
  NONE
}

// Custom Person data type class
public class Person {
  private String name;
  private String address;
  private String phone;
  private String email;
}

// Custom Address data type class
public class Address {
  private int zipCode;
  private String address;
  private String city;
  private String state;
  private String country;
}