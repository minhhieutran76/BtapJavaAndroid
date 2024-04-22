import java.util.Scanner;

public class bai3_scanner {
    public static void main(String[] args) {
        /*//Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println(s);

        //Nhập số nguyên
        System.out.print("Nhập số nguyên: ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.println(s1);

        //Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String s2 = new Scanner(System.in).nextLine();
        System.out.println(s2);*/

        /*System.out.print("Nhập r = ");
        double r = new Scanner(System.in).nextDouble();
        double cv = 2*Math.PI*r;
        double dt = Math.PI*Math.pow(r,2);
        System.out.println("Chu vi hình tròn là: "+ cv);
        System.out.println("Diện tích hình tròn là: "+ dt);*/

        System.out.print("Nhập a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Chu vi hcn là: " + (a+b)*2);
        System.out.println("Diện tích hcn là: " + a*b);
    }
}
