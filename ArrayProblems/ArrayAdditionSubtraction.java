public class ArrayAdditionSubtraction {
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }

    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[] additionResult = addArrays(arr1, arr2);
        int[] subtractionResult = subtractArrays(arr1, arr2);

        System.out.println("Addition Result:");
        for (int num : additionResult) {
            System.out.print(num + " ");
        }

        System.out.println("\nSubtraction Result:");
        for (int num : subtractionResult) {
            System.out.print(num + " ");
        }
    }
}

