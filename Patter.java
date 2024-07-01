import java.util.Scanner;

public class Patter {
    public static void main(String[] args) {
        int n, num = 1;
        String blank = " ";
        System.out.println("Enter no of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i < 2 * n; i += 2) {
            System.out.println(blank.repeat(2 * n - i - 1) + (Integer.toString(num)).repeat(i));
            num++;

        }
    }

}
