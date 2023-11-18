package design_patterns.prototype;



class Address implements Cloneable {
    public String street;
    public String houseNo;

    public Address(String street, String houseNo) {
        this.street = street;
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Address {")
        .append("street =" + street)
        .append(",houseNo =" + houseNo)
        .append("}").toString();
    }

    @Override
    protected Object clone() {
        return new Address(street, houseNo);
    }
}


class Person implements Cloneable {
    public String name;
    public Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
  

    @Override
    public String toString() {
        return new StringBuilder().append("Person {")
        .append("name =" + name)
        .append(",address =" + address)
        .append("}").toString();
    }

    @Override
    protected Object clone() {
        return new Person(name, (Address) address.clone());
    }
}
 
public class CloneAbleDemo {
    public static void main(String[] args) {
        Person theinlwin = new Person("Theinliwn", new Address("Yangon", "No.32"));

        Person jovian = (Person) theinlwin.clone(); // shallow copy
        jovian.name = "Jovian";
        jovian.address.houseNo = "No.40";
       

        System.out.println(theinlwin);
        System.out.println(jovian);
    }
}
