//NIM : 13020240084
//NAMA : ZULFAJRIN
//HARI : JUMAT
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;
import javax.swing.JOptionPane;

public class Bacakar {

    public static void main(String[] args) throws IOException {

        char cc; 
        int bil;

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("hello\n");
        System.out.print("baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);

        System.out.print("baca 1 bilangan : ");
        bil = Integer.parseInt(datAIn.readLine());

        System.out.print(cc + "\n" + bil + "\n");
        System.out.print("bye \n");

        // Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Scanner: ");
        int s = scan.nextInt();
        System.out.println(s);

        // Console
        Console console = System.console();
        if (console != null) {
            String cs = console.readLine("Input Console: ");
            System.out.println(cs);
        }

        // JOptionPane
        String jp = JOptionPane.showInputDialog("Input JOptionPane:");
        int jpv = Integer.parseInt(jp);
        System.out.println(jpv);
    }
}