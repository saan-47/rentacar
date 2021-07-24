import java.io.FileReader;
import java.util.Scanner;

public class Main {

    static Car car;
    static Passenger passenger;
    static Register register;
    static Driver driver;
    static CarRouts carRouts;

    static Budget budget;
    static Budget budget1;
    static Budget budget2;

    static Stardard stardard;
    static Stardard stardard1;
    static Stardard stardard2;
    Scanner input = new Scanner(System.in);
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
        String email = null;
        String password = null;
        String address = null;
        boolean admin = false;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your first name: ");
        name = input.next();

        System.out.printf("Enter your Email: ");
        email = input.next();
        System.out.printf("Enter your Password: ");
        password = input.next();
        System.out.printf("Enter your address: ");
        address = input.next();
        System.out.printf("Is this account for Admin Enter yes or no: ");
        String admin1 = input.next();
        System.out.printf("Enter your phone number JUST INTEGERS.");
        long mobileNum = input.nextLong();
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
        signUp.Credentails(id,name,email,password,address,admin, mobileNum);
    }
// Admin will select the Car operation from here
    public void selectCarOperation(){
        car = new Car();
        System.out.printf("\nWhat do you want to do?\n" +
                "Enter a number to select operation." +
                "\n1. Add Car\n2. Edit car\n3. Delete Car\n4. Update Car\n5. Save Car\n7. Search a Car\n" +
                "Enter 0 if you want to end the Operation and start over.");
        int selectOperation = input.nextInt();
        switch (selectOperation){
            case 1:
                car.addCar();
                break;
            case 2:
                car.editCar();
                break;
            case 3:
                car.deleteCar();
                break;
            case 4:
                car.updateCar();
                break;
            case 5:
                car.saveCar();
                break;
            case 6:
                car.searchCar();
                break;
            case 0:
                break;
            default:
                selectCarOperation();
        }
    }

    // Admin will select the Car operation from here
    public void selectPassengerOperation(){
        passenger = new Passenger();
        System.out.printf("\nWhat do you want to do?\n" +
                "Enter a number to select operation." +
                "\n1. Add Car\n2. Edit car\n3. Delete Car\n4. Update Car\n5. Save Car\n7. Search a Car\n" +
                "Enter 0 if you want to end the Operation and start over.");
        int selectOperation = input.nextInt();
        switch (selectOperation){
            case 1:
                passenger.addPassenger();
                break;
            case 2:
                passenger.editPassenger();
                break;
            case 3:
                passenger.deletPassenger();
                break;
            case 4:
                passenger.updatePassenger();
                break;
            case 5:
                passenger.savePassenger();
                break;
            case 6:
                passenger.searchPassenger();
                break;
            case 0:
                break;
            default:
                selectPassengerOperation();
        }
    }

    // Admin will select the Registration operation from here
    public void selectRegisterOperation(){
        register = new Register();
        System.out.printf("\nWhat do you want to do?\n" +
                "Enter a number to select operation." +
                "\n1. Add Car\n2. Edit car\n3. Delete Car\n4. Update Car\n5. Save Car\n7. Search a Car\n" +
                "Enter 0 if you want to end the Operation and start over.");
        int selectOperation = input.nextInt();
        switch (selectOperation){
            case 1:
                register.addBooking();
                break;
            case 2:
                register.editBooking();
                break;
            case 3:
                register.deleteBooking();
                break;
            case 4:
                register.updateBooking();
                break;
            case 5:
                register.saveBooking();
                break;
            case 6:
                register.searchBooking();
                break;
            case 0:
                break;
            default:
                selectRegisterOperation();
        }
    }
// Admin will select the Driver operation from here
    public void selectDriverOperation(){
        driver = new Driver();
        System.out.printf("\nWhat do you want to do?\n" +
                "Enter a number to select operation." +
                "\n1. Add Car\n2. Edit car\n3. Delete Car\n4. Update Car\n5. Save Car\n7. Search a Car\n" +
                "Enter 0 if you want to end the Operation and start over.");
        int selectOperation = input.nextInt();
        switch (selectOperation){
            case 1:
                driver.addDriver();
                break;
            case 2:
                driver.editDriver();
                break;
            case 3:
                driver.deleteDriver();
                break;
            case 4:
                driver.updateDriver();
                break;
            case 5:
                driver.saveDriver();
                break;
            case 6:
                driver.searchDriver();
                break;
            case 0:
                break;
            default:
                selectDriverOperation();

        }
    }

    // Admin will select the Car Route operation from here
    public void selectCarRouteOperation(){
        carRouts = new CarRouts();
        System.out.printf("\nWhat do you want to do?\n" +
                "Enter a number to select operation." +
                "\n1. Add Car\n2. Edit car\n3. Delete Car\n4. Update Car\n5. Save Car\n7. Search a Car\n" +
                "Enter 0 if you want to end the Operation and start over.");
        int selectOperation = input.nextInt();
        switch (selectOperation){
            case 1:
                carRouts.addCarRoute();
                break;
            case 2:
                carRouts.editCarRoute();
                break;
            case 3:
                carRouts.deleteCarRoute();
                break;
            case 4:
                 carRouts.updateCarRoute();
                break;
            case 5:
                carRouts.saveCarRoute();
                break;
            case 6:
                carRouts.searchCarRoute();
                break;
            case 0:
                break;
            default:
                selectCarRouteOperation();
        }
    }

    //  admin will select the category of operation from here
    public void adminPanel(){
        System.out.printf("Enter a number given above to select a category" +
                "\n1. Cars\n2. Passenger\n3. Registrations\n4. Drivers\n5. Car Routs\n6. Accounts\n");
        int select = input.nextInt();

        switch (select){
            case 1:
                selectCarOperation();
                break;
            case 2:
                selectPassengerOperation();
                break;
            case 3:
                selectRegisterOperation();
                break;
            case 4:
                selectDriverOperation();
                break;
            case 5:
                selectCarRouteOperation();
                break;
            case 6:
                AllEmployeeAccounts allEmployeeAccounts = new AllEmployeeAccounts();
                allEmployeeAccounts.showAllAccounts();
                break;
            default:
                System.out.printf("Wrong Entry. Try again.");
                selectCarOperation();

        }
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
