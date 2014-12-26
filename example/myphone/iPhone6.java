class IPhone6 extends Phone {
    IPhone6() {
        name = "Apple iPhone 6";
        price = 25000;
        
        screen = new Screen();
        screen.inch = 4.7;
        screen.width = 1334;
        screen.height = 750;

        processor = new Processor();
        processor.core = 4;
        processor.speed = 1.4;
        
        memory = new Memory();
        memory.size = 64;
        
        camera = new Camera();
        camera.len = new Len();
        camera.len.pixel = 800;
    }
}