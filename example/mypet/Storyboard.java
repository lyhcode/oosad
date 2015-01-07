public class Storyboard
{
    public static void main(String[] args) {
        
        //「Jack」開了一家寵物店「Happy Pets」
        
        Shopkeeper jack = new Shopkeeper();
        jack.name = "Jack";
        
        Store store = new Store();
        store.name = "Happy Pets";
        store.shopkeeper = jack;
        
        //寵物店買進一對貓咪，一公一母，公貓 1.8 公斤，母貓 1.2 公斤。
        
        Cat cat1 = new Cat();
        cat1.age = 4;
        cat1.name = "小黃";
        cat1.weight = 1.8;
        store.pets.add(cat1);
        
        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.name = "小花";
        cat2.weight = 1.2;
        store.pets.add(cat2);
        
        //寵物店又買進一隻小狗，體重 3.5 公斤。
        
        Dog dog1 = new Dog();
        dog1.age = 2;
        dog1.name = "小黑";
        dog1.weight = 3.5;
        store.pets.add(dog1);
        
        //兩年後，這對貓咪生下一隻小貓，出生體重 0.9 公斤。
        
        Cat cat3 = new Cat();
        cat3.age = 1;
        cat3.name = "小小花";
        cat3.weight = 0.9;
        store.pets.add(cat3);
        
        //「Mary」是一個喜歡養寵物的人，已經養了一隻狗，體重 5.2 公斤。
        
        Customer mary = new Customer();
        mary.name = "Mary";
        
        Dog dog2 = new Dog();
        dog2.age = 6;
        dog2.name = "小滷";
        dog2.weight = 5.2;
        mary.pets.add(dog2);
        
        //有天「Mary」來「Jack」的店裡，「Jack」向「Mary」介紹店裡的所有寵物。
        
        store.show(mary);
        
        //「Jack」餵食店裏的每隻寵物。
        
        for (Pet pet : store.pets) {
            pet.eat();
        }
        
        //「Mary」決定買一隻小貓回家。
        
        store.sell(mary, cat3);
        
        //「Mary」餵食家裡的兩隻寵物。
        
        for (Pet pet : mary.pets) {
            pet.eat();
        }
        
        //「Mary」開心地跟所有寵物一起玩耍。
        
        mary.play();
    }
}
