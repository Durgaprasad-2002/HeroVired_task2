import java.util.Scanner;

class AddingPrevious {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i > 0)
                arr[i] = arr[i] + arr[i - 1];
            System.out.print(arr[i] + " ");
        }
    }
}