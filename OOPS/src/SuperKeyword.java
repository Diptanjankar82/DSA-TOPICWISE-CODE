public class SuperKeyword {
    public static void main(String[] args) {
       horse h = new horse();
    }
}
class animal{
    animal(){
        System.out.println("animal constructor called..........");
    }
}
class horse extends animal {
    horse(){
        super();
        System.out.println("horse constroctor called...........");
    }
}
