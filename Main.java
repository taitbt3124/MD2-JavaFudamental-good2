import java.util.ArrayList;
import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.stdin);
        ArrayList<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        System.out.println("Nhập danh sách các chuỗi (Nhập 'exit' để kết thúc):");

        while (true) {
            System.out.print("Nhập chuỗi: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                validNumbers.add(number);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("\n--- THỐNG KÊ KẾT QUẢ ---");
        System.out.println("Số lượng chuỗi hợp lệ: " + validNumbers.size());
        System.out.println("Số lượng chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách các số nguyên chuyển đổi thành công: " + validNumbers);

        scanner.close();
    }
}
