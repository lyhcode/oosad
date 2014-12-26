class Factory {
    static Phone make(String name) {
    
            if (name.equals("nexus6")) {
                return new Nexus6();
            }
            
            if (name.equals("iphone6")) {
                return new IPhone6();
            }
            
            return new Phone();
    }
}