package design_patterns.prototype;

class Location {
    public String street;
    public String houseNo;
    public String city;

    public Location(String street, String houseNo, String city) {
        this.street = street;
        this.houseNo = houseNo;
        this.city = city;
    }

    // Use method overload so that clone object.
    public Location(Location other) {
        this(other.street, other.houseNo, other.city);
    }

    @Override
    public String toString() {
        return "Location [street=" + street + ", houseNo=" + houseNo + ", city=" + city + "]";
    }

}


class Employee implements Cloneable {
    public String name;
    public Location location;

    public Employee(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Employee(Employee other) {
        name = other.name;
        location = new Location(other.location);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", location=" + location + "]";
    }
}

public class CopyConsturctorDemo {
    public static void main(String[] args) {
        Employee theinlwin = new Employee("Thein lwin", new Location("Bann Siri Mingala Jam", "Soi 32", "Chiang Mai"));
        Employee jovian = new Employee(theinlwin); // shallow copy
        jovian.name="Jovian";

        System.out.println(theinlwin);
        System.err.println(jovian);
    }
}
