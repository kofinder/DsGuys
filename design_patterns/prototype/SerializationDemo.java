package design_patterns.prototype;

import java.io.Serializable;

class Beverage implements Serializable {
    public String name;
    public String packageType;

    public Beverage(String name, String packageType) {
        this.name = name;
        this.packageType = packageType;
    }

    @Override
    public String toString() {
        return "Beverage [name=" + name + ", packageType=" + packageType + "]";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Beverage beverage = new Beverage("Cocacola 330ml", "can");
        // use apache common
        Beverage beverage2 = SerializationUtils.roundtrip(beverage);
        beverage2.packageType = "bottle";
        System.out.println(beverage);
        System.out.println(beverage2);
    }
}
