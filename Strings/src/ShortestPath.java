public class ShortestPath {
    public static void main(String[] args) {
       String path = "WNEENESENNN";
        System.out.println(shortest(path));
    }

    public static float shortest(String path) {
        int X =0;
        int Y = 0;

        for(int i = 0; i< path.length(); i++){
            int dpr = path.charAt(i);
            if(dpr == 'N'){
                Y++;
            }else if(dpr =='S'){
                Y--;
            } else if (dpr == 'W') {
                X--;
            } else if (dpr == 'E') {
                X++;
            }
        }
        int X2 = X*X;
        int Y2 = Y*Y;

        return (float)Math.sqrt(X2 + Y2);
    }
}
