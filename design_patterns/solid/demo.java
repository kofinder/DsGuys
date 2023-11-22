
package design_patterns.solid;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * SRP
 */
class Journal {

    private final List<String> entiries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entiries.add("" + (++count) + ":" + text);
    }

    public void removeEntry(int idx) {
        entiries.remove(idx);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entiries);
    }
}


/**
 * InnerSRP
 */
class Persistance {
    void save(Journal journal) {
    } 
    
    void load(Journal journal, String filename) {
    }

    void load(Journal journal, URL url) {
    }
}


/**
 * SRP
 */
public class demo {

    public static void main(String[] args) {
        System.err.println("OMG");
    }
}