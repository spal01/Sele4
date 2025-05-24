package Sele4.Sele4;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Runtime.getRuntime().exec("notepad.exe");
        Runtime.getRuntime().exec("D:\\Selenium\\RunGrid.ps1");
    }
}
