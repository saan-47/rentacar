import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Budget implements CarMaterial {


    Scanner scanner;
    @Override
    public void AddcreateFile(int carid,String Car_company_name, String car_name, String car_type, String car_description,
                              String car_number, boolean AC_Availability,boolean trunk, boolean automatic,
                              int rate_per_mile) {
        try {
            FileWriter fileWriter  = new FileWriter("budgetCars.txt", true);
            fileWriter.write(carid+","+Car_company_name+","+car_name+","+car_type+","
                    +car_description+","+car_number+","+AC_Availability+","+trunk+","+automatic+","+rate_per_mile+"\n");
            fileWriter.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    @Override
    public void addCar(){
        int carid = 0;
        String car_company;
        String car_name;
        String car_number;
        String car_description;
        int Rate_per_mile;
        boolean av_available = false;
        String car_type = "Budget";
        boolean trunk = false;
        boolean automatic = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Car company name: ");
        car_company = scanner.next();

        System.out.print("Enter Car name: ");
        car_name = scanner.next();

        System.out.print("Enter Car Number.");
        car_number = scanner.next();

//        System.out.printf("Enter Car driver ID.");
//        car_driver_id = scanner.nextInt();
//        budget.setCar_driver_id(car_driver_id);

        System.out.print("Enter car description.");
        car_description = scanner.next();

        System.out.print("Enter Car rate per mile.\nNote: Only Numbers are allowed.");
        Rate_per_mile = scanner.nextInt();

        System.out.print("Enter yes if the car is air conditioning else enter no");
        String ac = scanner.next();
        if(ac.equals("yes")){
            av_available = true;
        }
        else if(ac.equals("no")){
            av_available = false;
        }
        else {
            System.out.print("Wrong Entry. Try again!");
            addCar();
        }
        System.out.print("Write submit to add car to file.");
        String submit = scanner.next();
        if(submit.equals("submit")){
            carid++;
            AddcreateFile(carid, car_company, car_name,car_type,car_description,car_number,
                    av_available,trunk,automatic,Rate_per_mile);
        }
        else{
            System.out.printf("Wrong Entry. Try again.");
            addCar();
        }
    }
    @Override
    public void editCar() {

        boolean found = false;
        String carId = " ";
        String car_company=" ";
        String car_name=" ";
        String car_type = " ";
        String car_description=" ";
        String car_number=" ";
        boolean av_available;
        boolean trunk;
        boolean automatic;
        String Mile_rate=" ";
        //String car_number = "";
        try{
            File file = new File("budgetCars.txt");
            scanner = new Scanner(file);
            scanner.useDelimiter("[,\n]");
            while(scanner.hasNext() && !found){
                carId = scanner.next();
                car_company = scanner.next();
                car_name = scanner.next();
                car_type = scanner.next();
                car_description = scanner.next();
                car_number = scanner.next();
                av_available = scanner.hasNext();
                Mile_rate = scanner.next();
                trunk = scanner.hasNext();
                automatic = scanner.hasNext();
                System.out.printf("Cars\n"+carId.trim()+"Company: "+car_company.trim()+"\n Name: "+car_name.trim()+"\n Number: "+car_number.trim()+"\n Description: "+car_description.trim()+
                        "\n AC: "+av_available+"\n Rate per mile: "+Mile_rate.trim()+"\n Category: "+car_type.trim()+"\n Trunk: "+trunk
                +"\n Automatic: "+automatic+"\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


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
