import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        if (args.length !=1)
        {
            System.out.println("Brak argumentu albo za dużo");
            return;
        }
        ArrayList<String> lines = new ArrayList<>();
        try
        {
            Scanner input = new Scanner(new File(args[0]));
            while(input.hasNextLine())
            {
                lines.add(input.nextLine());
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Plik nie jest znaleziony");
            return;
        }
        System.out.println("Przed");
        for(String elem:lines)
        {
            System.out.println(elem);
        }
        lines.sort(null);
        System.out.println("porządek naturalny");
        for(String elem:lines)
        {
            System.out.println(elem);
        }
        lines.sort((a,b) -> a.length() - b.length());
        System.out.println("porządek od najkrótszej do najdluzszego");
        for(String elem:lines)
        {
            System.out.println(elem);
        }
        String[] linie = lines.toArray(new String[lines.size()]);
        Arrays.sort(linie);
        System.out.println("porządek naturalny - tablica");
        for(String elem:linie)
        {
            System.out.println(elem);
        }
        System.out.println("porządek od najkrótszej do najdluzszego - tablica");
        Arrays.sort(linie, (a,b) -> a.length() - b.length());
        for(String elem:linie)
        {
            System.out.println(elem);
        }

    }
}
