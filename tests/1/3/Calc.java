public class Calc {
    public static void main(String[] args) {
        double x = 3;
        double y;
        if (x <= -1) {
            y = 0;
        } else if ((-1 < x) && (x < 0)) {
            y = 1 + x;
        } else {
            y = Math.cos(Math.PI * (x / 2));
        }
        System.out.println(y);
    }
}
