import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        double tygia = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD : ");
        usd = sc.nextDouble();
        double vnd = usd * tygia;
        System.out.println("Gia tri VND : " + vnd);
    }
}