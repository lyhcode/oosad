import java.util.Date;
import java.util.Set;

class Pet {
    String name;
    Date birthDate;
    PetType type;
    Owner owner;
    Set<Visit> visits;
}