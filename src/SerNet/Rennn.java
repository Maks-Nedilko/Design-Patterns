package SerNet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Rennn {

    public static void main(String[] args) {

        System.out.println(strCounter("M:\\doc\\first.txt"));

    }

    public static int strCounter(String fileName) {

        int counter = 0;

        try (Reader reader = new FileReader(fileName);) {

            char[] array = new char[10_000];
            reader.read(array);

            String s = new String(array);

            String[] strings = s.split(System.lineSeparator());

            counter = strings.length;

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return -1;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error read file");
            return -1;
        }

        return counter;
    }

}
