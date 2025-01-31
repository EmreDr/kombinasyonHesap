import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        int a = 1;
        int b = 1;
        int c = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayınızı giriniz: ");
        n = input.nextInt();
        System.out.println("2. sayınızı giriniz: ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        for (int j = 1; j <= r; j++) {
            b = b * j;
        }
        for (int h = 1; h <= (n-r); h++) {
            c = c * h;
        }

        System.out.print("1. sayınızın 2. sayınıza olan kombinasyonu : ");
        System.out.println(a/(b*c));

    }
}
