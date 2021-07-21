public class Budget extends CarCategories{
    private boolean AC = false;


    public Budget(String name, String model, String CC, String millage, String seats, int price, boolean AC) {
        super(name, model, CC, millage, seats, price);
        this.AC = AC;
    }


    public boolean isAC() {
        return AC;
    }

    public void cars(){
        System.out.printf("\n1. Mehran\n2. Wagon R");
    }
    public void specs(){
        System.out.printf("Name: "+getName()+" \n"+"Model: "+getModel()+" \n"+"CC: "+getCC()+" \n"
                +"Milage: "+getMillage()+" \n"
                +"Seats: "+getSeats()+" \n"
                +"Price: "+getPrice()+" \n"
                +"AC: "+AC+" \n"
        );
    }
    public void setAC(boolean AC) {
        this.AC = AC;
    }
}
