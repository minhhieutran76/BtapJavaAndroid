import java.util.Scanner;

public class bai11_ham {
    public static void main(String[] args) {
        System.out.print("Nhập a = ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("Nhập b = ");
        double b = new Scanner(System.in).nextDouble();
        System.out.print("Nhập c = ");
        double c = new Scanner(System.in).nextDouble();
        String kq = gpt (a, b, c);
        System.out.println(kq);
    }

    /*public static void xinchao(String gioitinh){
        if(gioitinh.equals("female"))
            System.out.println("t là nữ");
        else if(gioitinh.equals("male"))
            System.out.println("t là nam");
        else
            System.out.println("nothing");
    }*/

    public static String gpt(double a, double b, double c){
        if(a==0){
            if(b==0 && c==0)
                return "Phương trình vô số nghiệm";
            else if(b==0 && c!=0)
                return "Phương trình vô nghiệm";
            else
                return "Phương trình có 1 nghiệm duy nhất là: " + (-c/b);
        }else{
            double delta = b*b - 4*a*c;
            if(delta<0)
                return "Phương trình vô nghiệm";
            else if(delta==0)
                return "Phương trình có nghiệm kép là: "+(-b/2*a);
            else
                return "Phương trình có 2 nghiệm pb: x1 = "+((-b+Math.sqrt(delta))/2*a)+", x2 = "+((-b-Math.sqrt(delta))/2*a);
        }
    }


}
