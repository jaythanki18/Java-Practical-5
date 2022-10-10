package Pra5;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P5_4 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //Here is the example of one of the Byte Stream Class : BufferedInputStream
        System.out.println("This program is made by 21CE143 Jay Thanki ");
        FileInputStream fInputStream=new FileInputStream("P5_4.txt");
        BufferedInputStream bin=new BufferedInputStream(fInputStream);
        int i;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fInputStream.close();
    }
}
