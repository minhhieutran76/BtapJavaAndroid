import java.util.Scanner;

public class bai8_dowhile {
    public static void main(String[] args) {
        int a=1;
        int tong = 0;
        do{
            tong += a ;
            a++;
        }while(a<=5);
        System.out.print("Tổng các số từ 1 - 5 là: "+tong);
    }
}
