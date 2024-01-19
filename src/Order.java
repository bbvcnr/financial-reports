import java.util.ArrayList;

public class Order {
    private final String fullname;
    private final String shirtsize;
    private final Boolean wdesign;
    private final Boolean whoodie;
    private final String payment;
    public static final ArrayList<Order> orders = new ArrayList<>();
    public Order(String fullname, String shirtsize, Boolean wdesign, Boolean whoodie, String payment){
        this.fullname = fullname;
        this.shirtsize = shirtsize;
        this.wdesign = wdesign;
        this.whoodie = whoodie;
        this.payment = payment;
    }

    public String getFullName() {
        return fullname;
    }

    public String getShirtSize() {
        return shirtsize;
    }

    public Boolean hasDesign() {
        return wdesign;
    }

    public Boolean hasHoodie() {
        return whoodie;
    }
    public String getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Order for (full name):" + fullname + '\'' +
                ", Shirt size:'" + shirtsize + '\'' +
                ", Has a design:" + wdesign +
                ", Has a hoodie:" + whoodie +
                ", Payment type:" + payment;
    }


}
