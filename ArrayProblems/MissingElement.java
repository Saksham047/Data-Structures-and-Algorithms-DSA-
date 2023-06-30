public class MissingElement {
    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1; // Expected size of the array
        int totalSum = (n * (n + 1)) / 2; // Sum of all numbers from 1 to N

        int arrSum = 0; // Sum of elements in the given array
        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int missingElement = findMissingElement(arr);
        System.out.println("Missing element: " + missingElement);
    }
}
