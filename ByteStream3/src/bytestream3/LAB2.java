package bytestream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {
    static FileOutputStream output;

    public static void main(String[] args) {
        try {
            output = new FileOutputStream("data.dat");
            String s = "Hellow World!";
            byte[] b = s.getBytes();
            output.write(b);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while ((value=input.read()) != -1) {
                System.out.println(value);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }





