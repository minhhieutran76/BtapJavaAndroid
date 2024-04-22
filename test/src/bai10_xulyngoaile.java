public class bai10_xulyngoaile {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try { //code có khả năng lỗi
            int c=a/b;
            System.out.println("c = "+c);
        }
        catch(Exception e) { // catch: Exception dùng để bắt tất cả các lỗi
            System.out.println("Có lỗi rồi");
            e.printStackTrace(); //Hiển thị lỗi sai
        }
        System.out.println("Đoạn code phía sau");
    }
}
