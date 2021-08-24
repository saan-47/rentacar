import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Budget implements CarMaterial {
    boolean found = false;
    public int carId = 0;
    public String car_company=" ";
    public String car_name=" ";
    public String car_type = " ";
    public String car_description=" ";
    public String car_number=" ";
    public String av_available;
    public String trunk;
    public String automatic;
    public String Mile_rate=" ";

    //car credential which we are searching
    String carEditName;
    String carEditNumber;

    Scanner scanner;
    @Override
    public void AddcreateFile(int carid,String Car_company_name, String car_name, String car_type, String car_description,
                              String car_number, String AC_Availability,String trunk, String automatic,
                              String rate_per_mile) {
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
        Mile_rate = scanner.next();

        System.out.print("Enter yes if the car is air conditioning else enter no");
        String ac = scanner.next();
        if(ac.equals("yes")){
            av_available = "true";
        }
        else if(ac.equals("no")){
            av_available = "false";
        }
        else {
            System.out.print("Wrong Entry. Try again!");
            addCar();
        }
        System.out.print("Write submit to add car to file.");
        String submit = scanner.next();
        if(submit.equals("submit")){
            carId++;
            AddcreateFile(carId, car_company, car_name,car_type,car_description,car_number,
                    av_available,trunk,automatic,Mile_rate);
        }
        else{
            System.out.printf("Wrong Entry. Try again.");
            addCar();
        }
    }
    @Override
    public void editCar() {

        try{
            File file = new File("budgetCars.txt");
            scanner = new Scanner(file);
            scanner.useDelimiter("[,\n]");
            while(scanner.hasNext()){
                carId = scanner.nextInt();
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
            carName();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateCar(String filname, String editname, String editnumber, int newCarid,String new_Car_company_name,
                          String new_car_name, String new_car_type, String new_car_description,
                          String new_car_number, String new_AC_Availability,String new_trunk, String new_automatic,
                          String new_rate_per_mile){

        String tempFile = "tmp.txt";
        File oldFile = new File(filname);
        File newFile = new File(tempFile);
        int carID = 0;
        String cCompanyName = " ";
        String cCarName = " ";
        String cCarType = " ";
        String cCarDescription = " ";
        String cCarNumber = " ";
        String cCarAcAvailable = " ";
        String cCarMile = " ";
        String cCarTrunk = " ";
        String cCarAutomatic = " ";

        try {
            //File file = new File("budgetCars.txt");
            FileWriter fileWriter = new FileWriter(tempFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            scanner = new Scanner(new File(filname));
            scanner.useDelimiter("[,\n]");

            while (scanner.hasNext()) {
                carID = scanner.nextInt();
                cCompanyName = scanner.next();
                cCarName = scanner.next();
                cCarType = scanner.next();
                cCarDescription = scanner.next();
                cCarNumber = scanner.next();
                cCarAcAvailable = scanner.next();
                cCarMile = scanner.next();
                cCarTrunk = scanner.next();
                cCarAutomatic = scanner.next();
                if (cCarName.trim().equals(editname.trim()) && cCarNumber.trim().equals(editnumber.trim())) {
                    System.out.printf("Hello!");

                    printWriter.println(newCarid + "," + new_Car_company_name.trim() + "," + new_car_name.trim() + ","
                            + new_car_type.trim() + "," + new_car_description.trim() + ","
                            + new_car_number.trim() + "," + new_AC_Availability.trim()
                            + "," + new_rate_per_mile.trim() + "," + new_trunk.trim() + "," + new_automatic.trim() + "\n");
                } else {
                    printWriter.println(carID+","+cCompanyName.trim()+","+cCarName.trim()+","+cCarNumber.trim()+","+cCarDescription.trim()+
                        ","+cCarAcAvailable+","+cCarMile.trim()+","+cCarType.trim()+","+cCarTrunk+","+cCarAutomatic+"\n");
                    System.out.printf("Wrong");
                }
                }
            scanner.close();
            printWriter.flush();
            printWriter.close();
            oldFile.delete();
            File dump = new File(filname);
            newFile.renameTo(dump);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void carName() {
        scanner = new Scanner(System.in);
        String record = "budget.txt";
        System.out.printf("Which Car do you want to edit? Enter the Car Name and number.");
        System.out.println("\nName");
        carEditName = scanner.next();
        System.out.print("Number: ");
        carEditNumber = scanner.next();

        //new carData
        System.out.println("Enter Car_ID: ");
        carId = scanner.nextInt();

        System.out.println("Enter Car_Company_Name: ");
        car_company = scanner.next();

        System.out.println("Enter Car_Name: ");
        car_name = scanner.next();

        System.out.println("Enter Car_type: ");
        car_type = scanner.next();

        System.out.println("Enter Car_description: ");
        car_description = scanner.next();

        System.out.println("Enter Car_number: ");
        car_number = scanner.next();

        System.out.println("Enter Enter yes or no if the car has the AC or not:: ");
        av_available = scanner.next();

        System.out.println("Enter rate per mile for this car: ");
        Mile_rate = scanner.next();

        System.out.println("Enter yes or no if the car has the truck or not: ");
        trunk = scanner.next();

        System.out.println("Enter yes or no if the car is automatic: ");
        automatic = scanner.next();

        updateCar(record, carEditName, carEditNumber, carId, car_company,car_name,car_type,car_description,
                car_number,av_available,trunk,automatic,rate_per_mile);
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
