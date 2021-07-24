import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class AllEmployeeAccounts {
    Scanner x;
    public void showAllAccounts(){
        try{
            FileReader file = new FileReader(new File("credentrails.txt"));
            BufferedReader bufferedReader = new BufferedReader(file);
            String data;
            while((data=bufferedReader.readLine())!=null){
                System.out.println(data+"\n");
            }
        }
        catch (Exception e){
            System.out.printf("Error");
        }

    }
}
