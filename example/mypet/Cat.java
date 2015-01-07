class Cat extends Animal implements Pet {
    
    public void eat() {        
        weight += 0.1;
        
        super.eat();
    }
    
    public void play() {
        System.out.println("喵～嗚～");
    }
}