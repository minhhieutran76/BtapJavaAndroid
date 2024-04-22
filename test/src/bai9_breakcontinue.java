import java.util.Scanner;

public class bai9_breakcontinue {
    public static void main(String[] args) {
        /*int tong = 0;
        for(int i=0; i<=5; i++){
            if(i!=3){
                tong += i;
            }else{
                continue;
            }
        }
        System.out.println("Tổng khi bỏ qua số 3 là: " +tong);*/

        /*//bai12
        System.out.print("Nhập số nguyên n = ");
        int n = new Scanner(System.in).nextInt();
        int kq = 1;
        for(int i = n; i >=1; i--){
            kq *= i;
        }
        System.out.println("Kết quả "+n +"! = "+ kq);*/

        /*//bai13
        System.out.print("Nhập a = ");
        int a = new Scanner(System.in).nextInt();
        if(a%2==0){
            int tong = 0;
            for(int i=0;i<=a;i+=2){
                tong +=i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến a là: "+tong);
        }else{
            System.out.println("Tôi không tính tổng số lẻ");
        }*/

        /*//bai14
        System.out.print("Nhập n = ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        for(int i=1;i<=n;i+=2){
            if(i!=3){
                tong += i;
            }else{
                continue;
            }
        }
        System.out.println("Tổng khi bỏ qua 3 là: "+tong);*/

        /*//bai15
        int tong = 0;
        for(int i=10; i<=50; i++){
            if(i%3==0){
                tong +=i;
            }
        }
        System.out.println("Tổng các số chia hết cho 3 từ 10 đến 50 là: "+tong);*/

        /*//bai16
        int tong = 0;
        int tich = 1;
        for(int i=1; i<=3; i++){
            tich *= i;
            tong += tich;
        }
        System.out.println("Tổng là: "+tong);*/

        /*//bai17
        System.out.print("Các số hoàn hảo từ 1 - 1000 là: ");
        for (int n = 1; n <= 1000; n++) {
            int tong = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    tong +=i;
                }
            }
            if (tong == n) {
                System.out.print(n+" ");
            }
        }*/
        //bai18
        System.out.print("Nhập số nguyên a: ");
        int a = new Scanner(System.in).nextInt();
        int dem = 0;
        while(a<=0){
            System.out.println("Nhập sai! Nhập lại.");
             a = new Scanner(System.in).nextInt();
        };
        for(int i=1; i<=a; i++){
            if(a%i==0){
                dem++;
            }
        }
        if(dem==2){
            System.out.println("Số "+a+" là số nguyên tố");
        }else{
            System.out.println("Số "+a+" không là số nguyên tố");
        }
    }
}
