package packt.contact.model;

public class Contact implements Comparable{

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    public Contact(String firstName, String lastName, String phoneNumber, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return this.lastName + " " + this.phoneNumber + " " + address;
    }

    public int compareTo(Object other) {
        Contact otherContact = (Contact)other;
        return this.lastName.compareTo(otherContact.lastName);
    }
}
