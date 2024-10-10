package PhoneManager;

import java.util.Scanner;

public class PhoneAdder {
    public static void addPhone() {
        System.out.print("Tên điện thoại: ");
        String name = PhoneMenu.getInput();
        System.out.print("Giá bán: ");
        double price = Double.parseDouble(PhoneMenu.getInput());
        System.out.print("Số lượng: ");
        int quantity = Integer.parseInt(PhoneMenu.getInput());
        System.out.print("Nhà sản xuất: ");
        String manufacturer = PhoneMenu.getInput();
        System.out.print("Loại điện thoại (1: Chính hãng, 2: Xách tay): ");
        int type = Integer.parseInt(PhoneMenu.getInput());
        // auto tạo mới id cho iển thaoij
        int id = new PhoneOperations().getNextId();
        String phoneData;



        switch (type) {
            case 1:
                System.out.print("Thời gian bảo hành (Ngày): ");
                int warrantyTime = Integer.parseInt(PhoneMenu.getInput());

                System.out.print("Phạm vi bảo hành (Toan quoc/Quoc te): ");
                String warrantyRange = PhoneMenu.getInput();

                phoneData = String.format("%d,%s,%.2f,%d,%s,%d,%s",
                        id, name, price, quantity, manufacturer, warrantyTime, warrantyRange);
                break;

            case 2:
                System.out.print("Quốc gia xách tay: ");
                String country = PhoneMenu.getInput();

                System.out.print("Trạng thái (Da sua chua/Chua sua chua): ");
                String condition = PhoneMenu.getInput();

                phoneData = String.format("%d,%s,%.2f,%d,%s,%s,%s",
                        id, name, price, quantity, manufacturer, country, condition);
                break;
            default:
                System.out.println("Loại điện thoại không hợp lệ. Vui lòng chọn lại.");
                return;
        }

        new PhoneOperations().writeToFile(phoneData);
        System.out.println("Thêm thành công.");
    }
}

// yêu cầu nhập đúng kiểuđữ liệu, ko duoc bo trong du lieu
// dung  cac yeu cau sau :
// gia ban, so luong phai duong phai duong
// thoi gian bao hanh phai duong va <== 730 ngay
//"Phạm vi bảo hành (Toan quoc hoac Quoc te): "
// trang thai Da sua chua hoac Chua sua chua):
// thì moi duoc them vào