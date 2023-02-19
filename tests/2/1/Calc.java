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
        if (x < 0.2) {
            y = -Math.cos(5 * Math.PI) * (x - 0.2);
        } else if ((0.2 <= x) && (x < 0.4)) {
            y = 1 - 2 * Math.cos(5 * Math.PI) * (x - 0.2); 
        } else {
            y = 3;
        }
        return y;
    }    
}
