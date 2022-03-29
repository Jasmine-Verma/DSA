public class Reversearray {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 8, 10, 56, 86 };
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Reverse order: ");

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
    }
}