import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Loc", "Thong", "Phong"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của học sinh: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của sinh viên "+ input_name + " trong danh sách là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy sinh viên " + input_name + " trong danh sách");
        }
    }
}

