public class Calc {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double x = 3;
        double y = 4;
        double p = (a + b + x + y) / 2;
        double f = Math.pow(Math.sin(x - (p / a)), 2) + ((y * y  + x * y + x * x) / (a * a + b * b)) * Math.cos(x - p / a);
        System.out.println(f);
    }
}
