import java.util.Scanner;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max_val = Math.max(a, (Math.max(b, c)));
        int min_val = Math.min(a, (Math.min(b, c)));
        int mid_val = a + b + c - max_val - min_val;
        System.out.println(min_val +" " + mid_val + " " + max_val);
    }
}