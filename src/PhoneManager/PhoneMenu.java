package PhoneManager;

import java.util.Scanner;

public class PhoneMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.print("      <- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI ->" + "\n" +
                "Chọn  chức năng theo số (để tiếp tục)" + "\n" +
                "1. Thêm mới điện thoại" + "\n" +
                "2. Xóa điện thoại" + "\n" +
                "3. Xem danh sách điện thoại" + "\n" +
                "4. Tìm kiếm" + "\n" +
                "5. Thoát" + "\n" +
                "Chọn chức năng: ");
    }

    public static String getInput() {
        return scanner.nextLine();
    }
}
