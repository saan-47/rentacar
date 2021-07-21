public class CarCategories {
    private String name;
    private String Model;
    private String CC;
    private String millage;
    private String seats;
    private int price;

    public CarCategories(String name, String model, String CC, String millage, String seats, int price) {

        this.name = name;
        Model = model;
        this.CC = CC;
        this.millage = millage;
        this.seats = seats;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getMillage() {
        return millage;
    }

    public void setMillage(String millage) {
        this.millage = millage;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
