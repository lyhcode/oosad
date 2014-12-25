class Screen {
    double inch;
    int width;
    int height;
    
    double dpi() {
        return Math.sqrt(width*width+height*height)/inch;
    }
    
    boolean isRetina() {
        return dpi() >= 300;
    }
}