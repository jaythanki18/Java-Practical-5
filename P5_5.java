package Pra5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P5_5 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[15];
        System.out.println("This program is made by 21CE143 Jay Thanki");
        System.out.println("Enter 15 numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        File f = new File("Even.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter writer = new FileWriter(f);
        BufferedWriter buWriter = new BufferedWriter(writer);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                buWriter.write(numbers[i]+"\n");
        }
        System.out.println("Data in "+f.getName()+" : ");
        FileReader reader = new FileReader(f);
        BufferedReader buReader = new BufferedReader(reader);
        String b;
        while ((b = buReader.readLine()) != null) {
            System.out.print(b);
        }
        buReader.close();
        buWriter.close();
        sc.close();
    }
}