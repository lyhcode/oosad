class Phone {
    String name;
    int price;
    
    Screen screen;
    Processor processor;
    Memory memory;
    Camera camera;
    
    void show() {
        
        System.out.println(name + " 售價：" + price + "元");
        
        if (screen != null) {
            System.out.println("螢幕：" + screen.inch);
            System.out.println("螢幕解析度：" + screen.width + " x " + screen.height);
        }
        else {
            System.out.println("沒有螢幕！");
        }
        
        if (processor != null) {
            System.out.println("處理器：" + processor.core + "核心 " + processor.speed + "GHz");
        }
        else {
            System.out.println("沒有處理器！");
        }
        
        if (memory != null) {
            System.out.println("記憶體：" + memory.size + "GB");
        }
        else {
            System.out.println("沒有記憶體！");
        }
        
        if (camera != null) {
            System.out.println("照相機：" + camera.len.pixel + "萬畫素");
        }
        else {
            System.out.println("沒有照相機！");
        }
    }
}