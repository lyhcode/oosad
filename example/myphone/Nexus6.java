class Nexus6 extends Phone {
    Nexus6() {
        name = "Google Nexus 6";
        price = 20000;
        
        screen = new Screen();
        screen.inch = 5.96;
        screen.width = 2560;
        screen.height = 1440;

        processor = new Processor();
        processor.core = 4;
        processor.speed = 2.7;
        
        memory = new Memory();
        memory.size = 32;
        
        camera = new Camera();
        camera.len = new Len();
        camera.len.pixel = 1300;
    }
}