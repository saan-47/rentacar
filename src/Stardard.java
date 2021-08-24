import java.io.FileWriter;
import java.util.Scanner;

public class Stardard extends Main implements CarMaterial {

    private int carid = 0;
    private String car_company;
    private String car_name;
    private String car_number;
    private String car_description;
    private String av_available;
    private String Rate_per_mile;
    private String car_type = "Standard";
    String trunk = " ";
    String automatic = " ";

    @Override
    public void AddcreateFile(int carid,String Car_company_name, String car_name, String car_type,
                              String car_description,String Car_number, String AC_Availability, String trunk,
                              String automatic, String rate_per_mile) {
        try {
            FileWriter fileWriter  = new FileWriter("StandardCars.txt", true);
            fileWriter.write(carid+","+car_name+","+Car_company_name+","+car_type+","+car_description+","+AC_Availability+","+trunk+","+automatic+","+rate_per_mile+"\n");
            fileWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Do you want to add car? Enter y for yes and n for no.");
        String ans = scanner.next();
        if(ans.equals("y")) {
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
            Rate_per_mile = scanner.next();

            System.out.printf("Enter yes if the car is air conditioning else enter no");
            String ac = scanner.next();
            if (ac.equals("yes")) {
                av_available = "true";
            } else if (ac.equals("no")) {
                av_available = "false";
            } else {
                System.out.printf("Wrong Entry. Try again!");
                addCar();
            }
            System.out.printf("Write submit to add car to file.");
            String submit = scanner.next();
            if (submit.equals("submit")) {
                carid++;
                AddcreateFile(carid, car_company, car_name, car_type, car_description, car_number, av_available, trunk, automatic, Rate_per_mile);
            } else {
                System.out.printf("Wrong Entry. Try again.");
                addCar();
            }
        }
        else if(ans.equals("n")){
            adminPanel();
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
