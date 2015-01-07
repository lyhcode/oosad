import java.util.*;

class Store {
    String name;
    Shopkeeper shopkeeper;
    
    List<Pet> pets = new ArrayList<Pet>();
    
    void show(Customer customer) {
        System.out.println(customer.name + "歡迎光臨，我是店長" + shopkeeper.name);
        System.out.println("我們店內的寵物有～");

        for (Pet pet : pets) {
            pet.show();
        }
    }
    
    void sell(Customer customer, Pet pet) {
        customer.pets.add(pet);
        pets.remove(pet);
    }
}