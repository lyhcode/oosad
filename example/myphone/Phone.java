class Phone {
    String name;
    int price;
    
    Screen screen;
    Processor processor;
    Memory memory;
    Camera camera;
    
    void show() {
        if (screen != null) {
            System.out.println("螢幕：" + screen.inch);
            System.out.println("螢幕解析度：" + screen.width + " x " + screen.height);
        }
        else {
            System.out.println("沒有螢幕！");
        }
    }
}