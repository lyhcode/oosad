class Animal {
    
    String name;
    int age;
    double weight;
    
    void eat() {
        System.out.println(name + "正在進食...");
        System.out.println(name + "現在的體重是" + weight + "公斤...");
    }
    
    public void show() {
        System.out.println(name + "，" + age + "歲，" + weight + "公斤");
    }
}