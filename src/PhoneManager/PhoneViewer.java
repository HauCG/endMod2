package PhoneManager;

import java.util.List;

public class PhoneViewer {
    public static void viewPhones() {
        List<String> phones = new PhoneOperations().readPhones();
        System.out.println("Danh sách điện thoại:");
        for (String phone : phones) {
            System.out.println(phone);
        }
    }
}
