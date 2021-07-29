import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Budget implements CarMaterial {

    private int carid = 0;
    private String car_company;
    private String car_name;
    private String car_number;
    private String car_description;
    private boolean av_available;
    private int Rate_per_mile;
    private String car_type = "Budget";
    boolean trunk = false;
    boolean automatic = false;

    @Override
    public void AddcreateFile(int carid,String Car_company_name, String car_name, String car_type, String car_description,String car_number, boolean AC_Availability,boolean trunk, boolean automatic, int rate_per_mile) {
        try {
            FileWriter fileWriter  = new FileWriter("budgetCars.txt", true);
            fileWriter.write("id :"+carid+"\n");
            fileWriter.write("Name :"+car_name+"\n");
            fileWriter.write("Company Name :"+Car_company_name+"\n");
            fileWriter.write("Car type :"+car_type+"\n");
            fileWriter.write("Car Description :"+car_description+"\n");
            fileWriter.write("AC available :"+AC_Availability+"\n");
            fileWriter.write("Trunk availability :"+trunk+"\n");
            fileWriter.write("Automatic :"+automatic+"\n");
            fileWriter.write("Car Mile rate :"+rate_per_mile+"\n");
            fileWriter.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    @Override
    public void addCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Car company name: ");
        car_company = scanner.next();

        System.out.printf("Enter Car name: ");
        car_name = scanner.next();

        System.out.printf("Enter Car Number.");
        car_number = scanner.next();

//        System.out.printf("Enter Car driver ID.");
//        car_driver_id = scanner.nextInt();
//        budget.setCar_driver_id(car_driver_id);

        System.out.printf("Enter car description.");
        car_description = scanner.next();

        System.out.printf("Enter Car rate per mile.\nNote: Only Numbers are allowed.");
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
            addCar();
        }
        String submit = scanner.next();
        System.out.printf("Write submit to add car to file.");
        if(submit.equals("submit")){
            carid++;
            AddcreateFile(carid, car_company, car_name,car_type,car_description,car_number, av_available,trunk,automatic,Rate_per_mile);
        }
        else{
            System.out.printf("Wrong Entry. Try again.");
            addCar();
        }

    }

    @Override
    public void editCar() {

    }

    @Override
    public void deleteCar() {

    }

    @Override
    public void searchCar() {

    }

    @Override
    public void saveCar() {

    }
}
