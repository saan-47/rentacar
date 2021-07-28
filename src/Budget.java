import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Budget extends Car implements CarMaterial {


    @Override
    public void AddcreateFile(int carid, String car_name, String car_type, String car_description, boolean AC_Availability,boolean trunk, boolean automatic, int rate_per_mile) {
        try {
            FileWriter fileWriter  = new FileWriter("budgetCars.txt", true);
            fileWriter.write("id :"+carid+"\n");
            fileWriter.write("Name :"+car_name+"\n");
            fileWriter.write("Car type :"+car_type+"\n");
            fileWriter.write("Car Description :"+car_description+"\n");
            fileWriter.write("AC available :"+AC_Availability+"\n");
            fileWriter.write("Car Mile rate :"+rate_per_mile+"\n");
            fileWriter.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }



    @Override
    public void addCar() {
        System.out.printf("Enter Car company name: ");
        //car_company = scanner.next();
        setCar_company(scanner.next());

        System.out.printf("Enter Car name: ");
        //car_name = scanner.next();
        setCar_name(scanner.next());

        System.out.printf("Enter Car Number.");
        //car_number = scanner.nextInt();
        setCar_number(scanner.nextInt());


//        System.out.printf("Enter Car driver ID.");
//        car_driver_id = scanner.nextInt();
//        budget.setCar_driver_id(car_driver_id);

        System.out.printf("Enter car description.");

        //car_description = scanner.next();

        System.out.printf("Enter Car rate per mile.");
        //Rate_per_mile = scanner.nextInt();
        setRate_per_mile(scanner.nextInt());

        System.out.printf("Enter yes if the car is air conditioning else enter no");
        String ac = scanner.next();
        if(ac.equals("yes")){
            //av_available = true;
            setAv_available(true);
        }
        else if(ac.equals("no")){
            //av_available = false;
            setAv_available(false);
        }
        else {
            System.out.printf("Wrong Entry. Try again!");
            return;
        }
            budget.AddcreateFile(1,getCar_name(),getCar_type(),getCar_description(),isAv_available(), isTrunk(), isAutomatic(), getRate_per_mile());

    }

    @Override
    public void editCar() {
        super.editCar();
    }

    @Override
    public void deleteCar() {
        super.deleteCar();
    }

    @Override
    public void updateCar() {
        super.updateCar();
    }

    @Override
    public void saveCar() {
        super.saveCar();
    }

    @Override
    public void searchCar() {
        super.searchCar();
    }
}
