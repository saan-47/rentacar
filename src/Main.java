import java.io.FileReader;
import java.util.Scanner;

public class Main {

    static Budget budget;
    static Budget budget1;
    static Budget budget2;

    static Stardard stardard;
    static Stardard stardard1;
    static Stardard stardard2;
    public void userChoice(){
        budget = new Budget("Mehran","2014","600","20km","4",1200,false);
        budget1 = new Budget("Wagon R","2012","500","18km","4",1400,true);
        budget2 = new Budget("Hi Roof","2008","500","25km","4",1000,false);

        stardard = new Stardard("Corolla", "2011","900", "15km","4",2000,true,false);
        stardard1 = new Stardard("Corolla gli", "2013","1300", "12km","4",2200,true,false);
        stardard2 = new Stardard("Honda civic", "2019","2300", "12km","4",2800,true,true);

        System.out.printf("welcome to Rental Car project.");
        System.out.printf("Select Category.\n What type of car you are looking for?");
        System.out.printf("\n1. Budget\n2. Standard\n3. Luxury\n4. SUV\n");

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number to select the category.");
        int selectCar = input.nextInt();
        switch (selectCar){
            case 1:
                System.out.printf("You Choose Budget cars!");
                budget.cars();
                System.out.printf("\nEnter a number to select the car.");
                int car = input.nextInt();
                switch (car){
                    case 1:
                        budget.specs();
                        break;
                    case 2:
                        budget1.specs();
                        break;
                    case 3:
                        budget2.specs();
                        break;
                    default:
                        System.out.printf("Select one of the above options.");
                        return;
                }
                break;
            case 2:
                System.out.printf("\nEnter a number to select the car.");
                stardard.cars();
                int car1 = input.nextInt();
                switch (car1){
                    case 1:
                        stardard.specs();
                        break;
                    case 2:
                        stardard1.specs();
                        break;
                    case 3:
                        stardard2.specs();
                        break;
                    default:
                        System.out.printf("\nWrong Entry.");
                }
                break;
            default:
                System.out.printf("\nWrong Entry!!\n");
                //calls the function again so the user can enter a correct entry.
                userChoice();
                break;

        }
    }
    public void credentials(){
        int id = 0;
        String name = null;
        String Username = null;
        String password = null;
        boolean admin = false;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your first name: ");
        name = input.next();

        System.out.printf("Enter your Username: ");
        Username = input.next();
        System.out.printf("Enter your Password: ");
        password = input.next();
        System.out.printf("Is this account for Admin Enter yes or no: ");
        String admin1 = input.next();
        if(admin1.equals("yes")){
            admin = true;
        }
        else if(admin1.equals("no")) {
            admin = false;
        }
        else {
            System.out.printf("Enter yes or no any other input is not valid.");
            credentials();
        }
        SignUp signUp = new SignUp();
        id = id + 1;
        signUp.Credentails(id,name,Username,password,admin);
    }

    public void loginCredentials() {
        String Username = null;
        String password = null;
        boolean admin = false;
        Scanner input = new Scanner(System.in);
        try{
            FileReader fileReader = new FileReader("credential.txt");
        }catch (Exception x){

        }

    }

    //asking user to signup or login to the account
    public void SignupOrLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter login if you have account. Enter signup if do not already have account.");
        //asking user to define if he/she wants to login o signup
        String login = scanner.next();
        //if login then match the credentials
        if(login.equals("login")){
            SignUp signUp = new SignUp();
            signUp.login();
        }
        //create a new account
        else if (login.equals("signup")) {
            credentials();
        }
        //wrong input software will ask again the credentials
        else {
            SignupOrLogin();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.SignupOrLogin();
        //main.userChoice();

    }
}
