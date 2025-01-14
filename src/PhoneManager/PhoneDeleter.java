package PhoneManager;


import java.util.ArrayList;
import java.util.List;

public class PhoneDeleter {
    private static final String FILE_PATH = "data/mobiles.csv";

    public static void deletePhone() {
        System.out.print("Nhập ID điện thoại cần xóa: ");
        int idToDelete = Integer.parseInt(PhoneMenu.getInput());
        List<String> phones = new PhoneOperations().readPhones();
        boolean found = false;

        List<String> updatedPhones = new ArrayList<>();
        for (String line : phones) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            if (id == idToDelete) {
                found = true;
                System.out.println("Đã xóa điện thoại!");
                continue;
            }
            updatedPhones.add(line);
        }

        if (!found) {
            System.out.println("Không tìm thấy điện thoại với ID: " + idToDelete);
        } else {
            new PhoneOperations().writePhones(updatedPhones);
        }
    }
}
