import java.util.Scanner;

public class bai6_swithcase {
    public static void main(String[] args) {
        /*System.out.print("Nhập 1 số nguyên: ");
        int s = new Scanner(System.in).nextInt();
        int div = s%2;
        switch (div) {
            case 0:
                System.out.println(s + " là số chẵn");
                break;
            case 1:
                System.out.println(s + " là số lẻ");
                break;
        }*/

        System.out.println("Mời bấm số để chọn:");
        System.out.println("1. tìm theo tên");
        System.out.println("2. tìm theo tác giả");
        System.out.println("3. tìm theo nhà xuất bản");
        System.out.println("4. tìm theo tiêu đề");
        int a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím bấm "+a +" không hợp lệ");
                break;
        }
    }
}
