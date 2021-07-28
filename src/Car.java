import java.util.Scanner;

public class Car{

    private int carid = 0;
    private String car_company;
    private String car_name;
    private int car_number;
    private String car_description;
    private boolean av_available;
    private int Rate_per_mile;
    private String car_type;
    boolean trunk = false;
    boolean automatic = false;
    Budget budget;
    //private int car_driver_id;
    //private int car_customer_id;

    Scanner scanner;

    public void addCar(){
        budget = new Budget();
        System.out.printf("What type of car you wanna add?" +
                "\n1. Budget" +
                "\n2. Standard" +
                "\n3. Luxury" +
                "\n4. SUV");
        scanner = new Scanner(System.in);
        int category = scanner.nextInt();
        if (category == 1){
            car_type = "budget";
        }else if(category ==2 ){
            car_type = "Standard";
        }else if(category ==3 ){
            car_type = "Luxury";
        }else if(category ==4 ){
            car_type = "SUV";
        }else{
            System.out.printf("Wrong entry. Try again!");
            addCar();
        }

        System.out.printf("Enter Car company name: ");
        car_company = scanner.next();

        System.out.printf("Enter Car name: ");
        car_name = scanner.next();


        System.out.printf("Enter Car Number.");
        car_number = scanner.nextInt();


//        System.out.printf("Enter Car driver ID.");
//        car_driver_id = scanner.nextInt();
//        budget.setCar_driver_id(car_driver_id);

        System.out.printf("Enter car description.");
        car_description = scanner.next();

        System.out.printf("Enter Car rate per mile.");
        Rate_per_mile = scanner.nextInt();

        System.out.printf("Enter yes if the car is air conditioning else enter no");
        String ac = scanner.next();
        if(ac.equals("yes")){
            av_available = true;
        }
        else if(ac.equals("no")){
            av_available = false;
        }
        else {
            System.out.printf("Wrong Entry. Try again!");
            return;
        }
        carid++;
        if(category == 1){
            budget.AddcreateFile(carid,car_name,car_type,car_description,av_available, trunk, automatic, Rate_per_mile );
        }


    }

    public void editCar(){
    }

    public void deleteCar(){
    }

    public void updateCar(){
    }

    public void saveCar(){
    }

    public void searchCar(){
    }
}
