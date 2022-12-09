package CourseScheduler.models.people;

import java.util.UUID;

class Address {
  public Address(String street, String city, String state, int zip) {
    m_street = street;
    m_city = city;
    m_state = state;
    m_zip = zip;
  }

  public String getStreet() {
    return m_street;
  }

  public void setStreet(String street) {
    m_street = street;
  }

  public String getCity() {
    return m_city;
  }

  public void setCity(String city) {
    m_city = city;
  }

  public String getState() {
    return m_state;
  }

  public void setState(String state) {
    m_state = state;
  }

  public int getZip() {
    return m_zip;
  }

  public void setZip(int zip) {
    m_zip = zip;
  }

  private String m_street;
  private String m_city;
  private String m_state;
  private int m_zip;
}

abstract public class Person {
  public Person(UUID id, String firstName, String middleName, String lastName, String email, String number,
      Address address) {
    m_id = id;
    m_firstName = firstName;
    m_middleName = middleName;
    m_lastName = lastName;
    m_email = email;
    m_number = number;
    m_address = address;
  }

  public UUID getId() {
    return m_id;
  }

  public void setId(UUID id) {
    m_id = id;
  }

  public String getFirstName() {
    return m_firstName;
  }

  public void setFirstName(String firstName) {
    m_firstName = firstName;
  }

  public String getMiddleName() {
    return m_middleName;
  }

  public void setMiddleName(String middleName) {
    m_middleName = middleName;
  }

  public String getLastName() {
    return m_lastName;
  }

  public void setLastName(String lastName) {
    m_lastName = lastName;
  }

  public String getEmail() {
    return m_email;
  }

  public void setEmail(String email) {
    m_email = email;
  }

  public String getNumber() {
    return m_number;
  }

  public void setNumber(String number) {
    m_number = number;
  }

  public Address getAddress() {
    return m_address;
  }

  // todo implement clonable
  public void setAddress(Address address) {
    m_address = address;
  }

  private UUID m_id;
  private String m_firstName;
  private String m_middleName;
  private String m_lastName;
  private String m_email;
  private String m_number;
  private Address m_address;
}