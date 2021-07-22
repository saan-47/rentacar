import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class SignUp implements AccountCredentials {

    public void createFile() {
        File file = new File("credential.txt");

        try{
            if(file.createNewFile()){
                System.out.printf("File Created "+ file.getName());
            }
            else {
                System.out.printf("File already exist.");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void Credentails(String name, String email, String password, boolean admin) {
         try {
             FileWriter fileWriter  = new FileWriter("credentials.txt");
             fileWriter.write("Employee Name: " + name+"\n");
             fileWriter.write("Employee email: " + email+"\n");
             fileWriter.write("Employee password: " + password+"\n");
             fileWriter.write("Admin Employee : " + admin);
             fileWriter.close();
             System.out.printf("You are successfully signed up.");
         }
         catch (Exception e){
             System.out.printf("Error occurred.");
             e.printStackTrace();
         }
        }
    }

