class Animal {
    //What animal knows??
    String sound;
    String color;
    int babies = 3;
    String name;
    int abc;
    
    //What Animal Does??
    public void makeNoise(){
        int abc = 12;
        System.out.println("Animal is making its noise");
    }
    
    public void eat(){
        System.out.println(abc);
        System.out.println("Animal is eating");
    }
    
    public static void main(String[] args){
        Animal dog = new Animal();
        dog.sound = "bhu bhu";
        dog.color = "blue";
        dog.name = "Tommy";
        //dog.babies = 5;
        System.out.println(dog.babies);
    }
}
