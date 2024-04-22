import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee>  employees = new ArrayList<Employee>();

        for(int i = 0;i<10;i++){
            Employee employee = new Employee(i,"Employee "+i,20+i, "Department "+i, "Code "+i,(1000*i));
            employees.add(employee);
        }

        int s = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Chức năng ứng dụng:");
            System.out.println("1. Danh sách nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            s = scanner.nextInt();

            switch (s) {
                case 1:
                    for (int i = 1; i < employees.size(); i++) {
                        System.out.println("ID nhân viên: " + (employees.get(i).getId()));
                        System.out.println("Tên: " + employees.get(i).getName());
                        System.out.println("Tuổi: " + employees.get(i).getAge());
                        System.out.println("Mã: " + employees.get(i).getCode());
                        System.out.println("Bộ phận: " + employees.get(i).getDepartment());
                        System.out.println("Mức lương: " + employees.get(i).getSalaryRate() + "\n");
                    }
                    break;
                case 2:
                    System.out.print("ID nhân viên: ");
                    int id = scanner.nextInt();

                    System.out.print("Tên: ");
                    String name = scanner.next();

                    System.out.print("Tuổi: ");
                    int age = scanner.nextInt();

                    System.out.print("Bộ phận: ");
                    String department = scanner.next();

                    System.out.print("Mã: ");
                    String code = scanner.next();

                    System.out.print("Mức lương: ");
                    double salaryRate = scanner.nextDouble();

                    Employee employee = new Employee(id, name, age, department, code, salaryRate);
                    employees.add(employee);

                    System.out.println("Một nhân viên mới đã được thêm.");
                    break;

                case 3:
                    System.out.print("Nhập ID nhân viên cần xóa: ");
                    int ID = scanner.nextInt();

                    boolean found = true;
                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).getId() == ID) {
                            employees.remove(i);
                            found = false;
                            System.out.println("Xóa nhân viên thành công.");
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Nhân viên có " + ID + " không tìm thấy.");
                    }
                    System.out.println();

                    break;
            }
        }while (s != 4) ;
    }
}
