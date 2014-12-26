import java.util.*;

class Reseller {
    List<Phone> phones = new ArrayList<Phone>();
        
    void stock(String name) {
        phones.add(Factory.make(name));
    }
}