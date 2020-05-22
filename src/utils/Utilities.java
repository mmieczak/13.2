package utils;

import java.util.Scanner;

public class Utilities {
    public static String runSortAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your sort parameter (ram / cpu/ name):");
        return scanner.nextLine();
    }

}
