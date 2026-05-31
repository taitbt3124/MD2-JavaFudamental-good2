package module_14.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        System.out.println("Nh?p danh s�ch c�c chu?i (Nh?p 'exit' ?? k?t th�c):");

        while (true) {
            System.out.print("Nh?p chu?i: ");
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

        System.out.println("\n--- TH?NG K� K?T QU? ---");
        System.out.println("S? l??ng chu?i h?p l?: " + validNumbers.size());
        System.out.println("S? l??ng chu?i kh�ng h?p l?: " + invalidCount);
        System.out.println("Danh s�ch c�c s? nguy�n chuy?n ??i th�nh c�ng: " + validNumbers);

        scanner.close();
    }
}
