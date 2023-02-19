public class Calc {
    public static void main(String[] args) {
        double sum = 0;
        double a = 1;
        double b = 10;
        double h = 0.001;
        double x = a;
        while (x <= b) {
            sum += Func.get(x) * h;
            x += h;
        }
        System.out.println("Sum: " + sum);
    }
}
class Func {
    public static double get(double x) {
        double y;
        if (x < -1) {
            y = 6 * Math.pow(Math.abs(x), 1 / 3) - 5;
        } else if ((-1 <= x) && (x <= 1)) {
            y = x * x; 
        } else {
            y = 6 * Math.pow(x, 1 / 3) - 5;
        }
        return y;
    }    
}
