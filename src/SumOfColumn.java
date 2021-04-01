import java.util.Scanner;

public class SumOfColumn {
    public static int[][] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i< size; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return array;
    }
    public static void printArr(int[][] arr) {
        for (int i =0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = creatArr();
        printArr(arr);
        System.out.println("Nhập số cột muốn tính tổng: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < arr[0].length) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][x];
            }
            System.out.println(sum);
        } else {
            System.out.println("Not now");
        }
    }
}
