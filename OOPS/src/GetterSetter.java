public class GetterSetter {
    public static void main(String[] args) {
      Pen p1 = new Pen();
      p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

    }

}
class Pen{
    private String color;
    private int Tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.Tip;
    }

    void setColor(String newcolor){
        this.color = newcolor;
    }

    void setTip(int newTip){
        this.Tip = newTip;
    }



}
