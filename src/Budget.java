import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
        String carId = " ";
        String car_company=" ";
        String car_name=" ";
        String car_type = " ";
        String car_description=" ";
        String car_number=" ";
        String av_available;
        String trunk;
        String automatic;
        String Mile_rate=" ";
        //String car_number = "";
        try{
            File file = new File("budgetCars.txt");
            scanner = new Scanner(file);
            scanner.useDelimiter("[,\n]");
            while(scanner.hasNext()){
                carId = scanner.next();
                car_company = scanner.next();
                car_name = scanner.next();
                car_type = scanner.next();
                car_description = scanner.next();
                car_number = scanner.next();
                av_available = scanner.next();
                Mile_rate = scanner.next();
                trunk = scanner.next();
                automatic = scanner.next();
//                System.out.printf("Cars"+carId.trim()+"\nCompany: "+car_company.trim()+"\n Name: "+car_name.trim()+"\n Number: "+car_number.trim()+"\n Description: "+car_description.trim()+
//                        "\n AC: "+av_available+"\n Rate per mile: "+Mile_rate.trim()+"\n Category: "+car_type.trim()+"\n Trunk: "+trunk
///                +"\n Automatic: "+automatic+"\n");
                System.out.printf("Car_Name: "+car_name+" Car_Number: "+car_number+"\n");
            }
            scanner.close();
            updateCar();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void updateCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Which Car do you want to edit? Enter the Car Name and number.");
        System.out.println("\nName");
        String carEditName = scanner.next();
        System.out.print("Number: ");
        String carEditNumber = scanner.next();
        boolean found = false;
        String carId = " ";
        String car_company=" ";
        String car_name=" ";
        String car_type = " ";
        String car_description=" ";
        String car_number=" ";
        String av_available;
        String trunk;
        String automatic;
        String Mile_rate=" ";
        String tempfile = "temp.txt";
        File tmpfile = new File(tempfile);

        try{
            File file = new File("budgetCars.txt");
            FileWriter fileWriter = new FileWriter(tempfile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            scanner = new Scanner(file);
            scanner.useDelimiter("[,\n]");
            while(scanner.hasNext() && !found){
                carId = scanner.next();
                car_company = scanner.next();
                car_name = scanner.next();
                car_type = scanner.next();
                car_description = scanner.next();
                car_number = scanner.next();
                av_available = scanner.next();
                Mile_rate = scanner.next();
                trunk = scanner.next();
                automatic = scanner.next();

                if(car_name.trim().equals(carEditName.trim()) && car_number.trim().equals(carEditNumber.trim())){
                    System.out.println("Enter Car_ID: ");
                    String new_carId = scanner.next();
                    System.out.println("Enter Car_Company_Name: ");
                    String new_car_company = scanner.next();
                    System.out.println("Enter Car_Name: ");
                    String new_car_name = scanner.next();
                    System.out.println("Enter Car_type: ");
                    String new_car_type = scanner.next();

                    System.out.println("Enter Car_description: ");

                    String new_car_description = scanner.next();
                    System.out.println("Enter Car_number: ");
                    String new_car_number = scanner.next();
                    System.out.println("Enter Enter yes or no if the car has the AC or not:: ");

                    String new_av_available = scanner.next();
                    System.out.println("Enter rate per mile for this car: ");

                    String new_Mile_rate = scanner.next();
                    System.out.println("Enter yes or no if the car has the truck or not: ");

                    String new_trunk = scanner.next();
                    System.out.println("Enter yes or no if the car is automatic: ");

                    String new_automatic = scanner.next();

                    printWriter.println(new_carId.trim()+","+new_car_company.trim()+","+new_car_name.trim()+","+new_car_type.trim()+","+new_car_description.trim()+","+new_car_number.trim()+","+new_av_available.trim()
                    +","+new_Mile_rate.trim()+","+new_trunk.trim()+","+new_automatic.trim()+"\n");
                    printWriter.flush();
                    printWriter.close();
                    file.delete();
                    File dump = new File("budget.txt");
                    tmpfile.renameTo(dump);
                }
                else{
                    printWriter.println(carId.trim()+","+car_company.trim()+","+car_name.trim()+","+car_number.trim()+","+car_description.trim()+
                        ","+av_available+","+Mile_rate.trim()+","+car_type.trim()+","+trunk
                +","+automatic+"\n");
                }
            }
            scanner.close();


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
