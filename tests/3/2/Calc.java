public class Calc {
    public static void main(String[] args) {
        int[] array = {1, 0, 3, 4, 10};
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * i;
        }
        for (int element: result) {
            System.out.println(element);
        }
    }
}
