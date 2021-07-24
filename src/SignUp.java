import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SignUp extends Main implements AccountCredentials {
    Scanner input;
    int numOfUser = 0;
    String username, pass;
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
    public void Credentails(int id,String name, String Username, String password, boolean admin) {
         try {
             FileWriter fileWriter  = new FileWriter("credentials.txt", true);
             FileWriter fileWriter1  = new FileWriter("credential.txt", true);
             fileWriter.write("Employee id: "+ id+"\n");
             fileWriter.write("Employee Name: " + name+"\n");
             fileWriter.write("Admin Employee : " + admin+"\n");
             fileWriter1.write(Username+","+password+","+admin+"\n");
              numOfUser+=1;
             fileWriter.close();
             fileWriter1.close();
             System.out.printf("You are successfully signed up.");
             SignupOrLogin();
         }
         catch (Exception e){
             System.out.printf("Error occurred.");
             e.printStackTrace();
         }
        }

        public void usernamePass(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your username.");
        username = scanner.next();
        System.out.printf("Enter password.");
        pass = scanner.next();
    }
    public void login(){
        //flag for finding user
        boolean found = false;
        //variables to iterate the file
        String email= "";
        String passkey= "";
        String admin = "";

        try{
            //read file
            input = new Scanner(new File("credential.txt"));
            //email and password input from user
            usernamePass();
            //defining how to saperate one user from another in the file
            input.useDelimiter("[,\n]");
            //looping through all credentials until find the match
            while (input.hasNext() && !found){
                email = input.next();
                passkey = input.next();
                admin = input.next();
                //condition for matching the credential of user
                if(email.trim().equals(username.trim()) && passkey.trim().equals(pass.trim())) {
                    found = true;
                    //checking if the user is admin or not
                    if(admin.trim().equals("true")){
                        System.out.printf("This is admin");
                    }else{
                        System.out.printf("This is not admin!");
                    userChoice();
                    }
                    System.out.printf("Hurrah");
                }
            }
            input.close();

//            String c;
//            while(numOfUser != 0){
//                System.out.printf(numOfUser+"\n");
//                numOfUser-=1;
//            }
//
//            //reading credentials file to login
//            while ((c=bufferedReader.readLine())!=null){
//                System.out.printf(c+"\n");
//                if(c.contains(username)){
//                    System.out.printf("match fount");
//                }
//                else {
//                    System.out.printf("match not found.");
//                }
//            }
        }catch (Exception e){
            System.out.printf("No such user. Try again with current credentials.\n");
            SignupOrLogin();
        }
    }

}

