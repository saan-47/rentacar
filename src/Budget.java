import java.io.File;
import java.io.FileWriter;

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
        super.addCar();
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
