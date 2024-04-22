import java.util.Scanner;

public class bai7_while {
    public static void main(String[] args) {
        System.out.print("Nhập 1 số nguyên từ 1 - 99: ");
        int a = new Scanner(System.in).nextInt();
        while (a<1 || a>99) {
            System.out.println("Nhập sai! Mời nhập lại.");
            System.out.print("Nhập 1 số nguyên từ 1 - 99: ");
            a = new Scanner(System.in).nextInt();
        }
        System.out.println("Bạn đã nhập xong a = "+a);
    }
}
