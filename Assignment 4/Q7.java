import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (
                PrintWriter p = new PrintWriter(new FileOutputStream(new File("Heba.txt")));
        ) {
            for (int i=0;i<100;i++) {
                p.print((int)(Math.random()*100) + " ");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File error");

        }

        System.out.println("Done!");
    }
}