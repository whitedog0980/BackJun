import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input;
            try {
                input = sc.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            String[] i = input.split(" ");
            int x = Integer.parseInt(i[0]);
            int y = Integer.parseInt(i[1]);
            System.out.println(Integer.toString(x + y));
        }
        sc.close();
    }
}
