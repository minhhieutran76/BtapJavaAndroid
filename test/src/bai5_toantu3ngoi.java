import java.util.Scanner;

public class bai5_toantu3ngoi {
    public static void main(String[] args) {
        System.out.print("Nhập điểm trung bình: ");
        double k = new Scanner(System.in).nextDouble();
        String kt = (k>=8)?"Giỏi" : ((k<8 && k>=6.5)?"Khá" : ((k<6.5 && k>5)?"Trung bình": "Yếu"));
        System.out.println(kt);
    }
}
