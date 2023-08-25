
public class polyMorphism {
    public static void main(String[] args) {
//        MethodoverLoadingExp newone = new MethodoverLoadingExp();
//        System.out.println(newone.sum(1,2));
//        System.out.println(newone.sum((float)1.5 ,(float)2.5));
//        System.out.println(newone.sum(1,2,3));

            Deer d = new Deer();
            d.eat();

    }


}
class MethodoverLoadingExp{

    int sum(int a , int b){
        return a +b;
    }
    float sum (float a, float b){
        return a +b;
    }

    int sum (int a , int b , int c){
        return a + b + c;

    }
}

class MthodOveridingAnimal {
    void eat(){
        System.out.println("eat everything");
    }
}
class Deer extends MthodOveridingAnimal {
    @Override
    void eat() {
        System.out.println("eats grass");
    }
}