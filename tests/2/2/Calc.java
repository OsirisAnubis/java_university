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
        if (x <= 0) {
            y = 1 + 2 * x * x;
        } else if ((0 < x) && (x < 0.5)) {
            y = 1; 
        } else {
            y = 1 + Math.pow(x - 0.5, 4);
        }
        return y;
    }    
}
