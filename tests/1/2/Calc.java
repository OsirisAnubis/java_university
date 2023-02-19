public class Calc {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double x = 3;
        double y = 4;
        double f = (Math.pow(Math.abs(x * x - y * y), 1 / 5)) / (x * Math.sqrt(a * y) + y * Math.sqrt(b * x));
        System.out.println(f);
    }
}
