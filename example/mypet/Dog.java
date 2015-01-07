class Dog extends Animal implements Pet {
    
    public void eat() {
        
        weight += 0.2;
        
        super.eat();
    }
    
    public void play() {
        System.out.println("汪～嗚～");
    }
}