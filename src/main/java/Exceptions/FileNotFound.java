package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

    public static void main(String[] args)
    {

        try
        {
            FileReader file = new FileReader("E://file.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: El archivo no existe");
        }
    }

}
