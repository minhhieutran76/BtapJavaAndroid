import java.util.Scanner;

public class bai4_ifelse {
    public static void main(String[] args) {
        /*System.out.print("Nhập điểm 1: ");
        double diem1 = new Scanner(System.in).nextDouble();
        System.out.print("Nhập điểm 2: ");
        double diem2 = new Scanner(System.in).nextDouble();
        System.out.print("Nhập điểm 3: ");
        double diem3 = new Scanner(System.in).nextDouble();
        double dtb = (diem1 + diem2 + diem3) / 3;
        if (dtb <= 10 && dtb >=8) {
            System.out.println("Giỏi");
        }else if (dtb < 8 && dtb >=6.5){
            System.out.println("Khá");
        }else if (dtb < 6.5 && dtb >=5){
            System.out.println("Khá");
        }else{
            System.out.println("Yếu");
        }
    }*/
        /*//Bai4
        System.out.print("Nhập vào tổng 2 số: ");
        int tong = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào hiệu 2 số: ");
        int hieu = new Scanner(System.in).nextInt();
        int x = (tong + hieu) / 2;
        int y = (tong - hieu) / 2;
        System.out.println("Giá trị x cần tìm là: " + x);
        System.out.println("Giá trị y cần tìm là: " + y);*/

        /*//Bai5
        System.out.print("Nhập vào chiều cao (m): ");
        double chieucao = new Scanner(System.in).nextDouble();
        System.out.print("Nhập vào cân nặng (kg): ");
        double cannang = new Scanner(System.in).nextDouble();
        double bmi = cannang / Math.pow(chieucao, 2);
        if (bmi >= 16 && bmi < 18.5) {
            System.out.println("Thân hình hơi gầy");
        }else if (bmi >= 15 && bmi < 16) {
            System.out.println("Thân hình gầy");
        }else{
            System.out.println("Thân hình quá gầy");
        }*/

        /*//Bai6
        System.out.print("Nhập năm: ");
        int nam = new Scanner(System.in).nextInt();
        if((nam%4==0 && nam%100!=0)||(nam%400==0)){
            System.out.println("Năm "+ nam +" là năm nhuận");
        }else{
            System.out.println("Năm "+ nam +" không phải là năm nhuận");
        }*/

        /*//Bai7
        System.out.print("Nhập tháng: ");
        int thang = new Scanner(System.in).nextInt();
        if((thang == 1) || (thang == 3) || (thang == 5) || (thang == 7) || (thang == 8)
                || (thang == 10 ) || (thang == 12 )){
            System.out.println("Tháng "+ thang +" có 31 ngày");
        }else if((thang == 4) || (thang == 6) || (thang == 9) || (thang == 11)){
            System.out.println("Tháng "+ thang +" có 30 ngày");
        }else {
            System.out.print("Nhập năm: ");
            int nam = new Scanner(System.in).nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println("Tháng "+ thang +" có 29 ngày");
            } else {
                System.out.println("Tháng " + thang + " có 28 ngày");
            }
        }*/

        //Bai8
        System.out.print("Nhập a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập c = ");
        int c = new Scanner(System.in).nextInt();
        int delta = (int) (Math.pow(b,2) - (4*a*c));
        if(delta <0 ){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta ==0 ){
            double x1 = (double) (-b/2*a);
            double x2 = (double) (-b/2*a);
            System.out.println("Phương trình có 2 nghiệm kép x1 = x2 = "+ x1);
        }else{
            double x3 = (-b + Math.sqrt(delta))/(2*a);
            double x4 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm: x1 = "+x3 +", x2 = "+x4);
        }
    }
}
