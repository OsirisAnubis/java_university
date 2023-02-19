public class Calc {
    public static void main(String[] args) {
        int n = 10;
        double x = 2;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(Math.sin(x), i) / UsefulMethods.factorial(i);
        }
        System.out.println("Result: " + sum);   
    }
}
class UsefulMethods {
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
