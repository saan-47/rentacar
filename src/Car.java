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
    Stardard stardard;
    //private int car_driver_id;
    //private int car_customer_id;

    Scanner scanner;

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getCar_company() {
        return car_company;
    }

    public void setCar_company(String car_company) {
        this.car_company = car_company;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getCar_number() {
        return car_number;
    }

    public void setCar_number(int car_number) {
        this.car_number = car_number;
    }

    public String getCar_description() {
        return car_description;
    }

    public void setCar_description(String car_description) {
        this.car_description = car_description;
    }

    public boolean isAv_available   () {
        return av_available;
    }

    public void setAv_available(boolean av_available) {
        this.av_available = av_available;
    }

    public int getRate_per_mile() {
        return Rate_per_mile;
    }

    public void setRate_per_mile(int rate_per_mile) {
        Rate_per_mile = rate_per_mile;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }


    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addCar(){
        budget = new Budget();
        stardard = new Stardard();
        System.out.printf("What type of car you wanna add?" +
                "\n1. Budget" +
                "\n2. Standard" +
                "\n3. Luxury" +
                "\n4. SUV");
        scanner = new Scanner(System.in);
        int category = scanner.nextInt();
        if (category == 1){
            budget.addCar();
            //car_type = "budget";
        }else if(category == 2 ){
            stardard.addCar();
            System.out.printf("Babes!");
            //car_type = "Standard";
        }else if(category == 3 ){
            //car_type = "Luxury";
        }else if(category == 4 ){
            //car_type = "SUV";
        }else{
            System.out.printf("Wrong entry. Try again!");
            addCar();
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
