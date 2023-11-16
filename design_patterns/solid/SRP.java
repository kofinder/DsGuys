
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
    public void save(Journal journal) {
        // TODO
    } 
    
    public void load(Journal journal, String filename) {
        // TODO
    }

    public void load(Journal journal, URL url) {
        // TODO
    }
}


/**
 * SRP
 */
public class SRP {

    public static void main(String[] args) {
        
    }
}