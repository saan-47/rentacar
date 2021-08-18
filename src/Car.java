import java.util.Scanner;

public class Car{


    Budget budget;
    Stardard stardard;
    LuxuryCars luxuryCars;

    int category;
    //private int car_driver_id;
    //private int car_customer_id;

    Scanner scanner;
    public void addCar(){
        budget = new Budget();
        stardard = new Stardard();
        luxuryCars = new LuxuryCars();
        System.out.printf("What type of car you wanna add?" +
                "\n1. Budget" +
                "\n2. Standard" +
                "\n3. Luxury" +
                "\n4. SUV\n");
        scanner = new Scanner(System.in);
        category = scanner.nextInt();
        switch (category){
            case 1:
                budget.addCar();
                //car_type = "budget";
                break;
            case 2:
                System.out.printf("Babes!\n");
                stardard.addCar();
                break;
            case 3:
                System.out.printf("Babes!\n");
                luxuryCars.addCar();
                break;
            default:
                System.out.printf("Wrong entry. Try again!");
                addCar();
        }
    }

    public void editCar(){
        budget = new Budget();
        stardard = new Stardard();
        System.out.printf("What type of car you wanna add?" +
                "\n1. Budget" +
                "\n2. Standard" +
                "\n3. Luxury" +
                "\n4. SUV\n");
        scanner = new Scanner(System.in);
        category = scanner.nextInt();
        switch (category){
            case 1:
                budget.editCar();
                //car_type = "budget";
                break;
            case 2:
                System.out.printf("Babes!\n");
                stardard.editCar();
                break;
            default:
                System.out.printf("Wrong entry. Try again!");
                addCar();
        }
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
