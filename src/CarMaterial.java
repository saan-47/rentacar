public interface CarMaterial {
    int carId = 0;
    String Car_name = "";
    String Car_company_name = "";
    String Car_type = "";
    String Car_number = "";
    String Car_description = "";
    String trunk = " ";
    String automatic =" ";
    String AC_Availability =" " ;
    String rate_per_mile = " ";


    void AddcreateFile(int carid, String Car_company_name, String car_name, String car_type, String car_description,String Car_number,
                       String AC_Availability,String trunk, String automatic, String rate_per_mile);
    void addCar();
    void editCar();
    void deleteCar();
    void searchCar();
    void saveCar();
}
