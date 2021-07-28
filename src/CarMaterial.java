public interface CarMaterial {
    int carId = 0;
    String Car_name = "";
    String Car_type = "";
    int Car_number = 0;
    String Car_description = "";
    boolean trunk = false;
    boolean automatic = false;
    boolean AC_Availability = false;
    int rate_per_mile = 0;


    void AddcreateFile(int carid, String car_name, String car_type, String car_description, boolean AC_Availability,boolean trunk, boolean automatic, int rate_per_mile);

}
