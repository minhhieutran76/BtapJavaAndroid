import java.util.Scanner;

public class btapbai11 {
    public static void main(String[] args) {
        System.out.print("Nhập a = ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("Nhập b = ");
        double b = new Scanner(System.in).nextDouble();
        System.out.print("Mời nhập vào phép tính: ");
        String c = new Scanner(System.in).nextLine();
        switch (c){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
        }
    }

    public static void cong(double a, double b) {
        double kq = a+b;
        System.out.println("Ket qua la: "+kq);
    }

    public static void tru(double a, double b) {
        double kq = a-b;
        System.out.println("Ket qua la: "+kq);
    }

    public static void nhan(double a, double b) {
        double kq = a*b;
        System.out.println("Ket qua la: "+kq);
    }

    public static void chia(double a, double b) {
        double kq = a/b;
        System.out.println("Ket qua la: "+kq);
    }
}
