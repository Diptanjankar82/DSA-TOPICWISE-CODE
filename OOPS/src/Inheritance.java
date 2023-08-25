public class  Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }
}
 class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}

 class Fish extends Animal{
    //extends keyword used to inheritance base class to derived class/child class
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
}