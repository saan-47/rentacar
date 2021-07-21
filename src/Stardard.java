public class Stardard extends CarCategories{
    boolean trunk;
    boolean automatic;

    public Stardard(String name, String model, String CC, String millage, String seats, int price, boolean trunk, boolean automatic) {
        super(name, model, CC, millage, seats, price);
        this.trunk = trunk;
        this.automatic = automatic;
    }


    public void specs(){
        System.out.printf("Name: "+getName()+" \n"+"Model: "+getModel()+" \n"+"CC: "+getCC()+" \n"
                +"Milage: "+getMillage()+" \n"
                +"Seats: "+getSeats()+" \n"
                +"Price: "+getPrice()+" \n"
                +"Trunk available: "+trunk+" \n"
                +"Automatic available: "+automatic+" \n"
        );
    }
    public void cars(){
        System.out.printf("\n1. Corolla \n2. Corolla Gli \n3. Honda Civic");
    }
}
