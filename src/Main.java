import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        readFile("customer_orders.csv");
        OrdersReport.runReports();
    }

    private static void readFile(String filename){
        try {
            File f1 = new File(filename);
            Scanner s1 = new Scanner(f1);

            if (s1.hasNextLine()) s1.nextLine();
            while (s1.hasNextLine()){
                try {
                    String line = s1.nextLine();
                    String[] parts = line.split(",");

                    String fullname = parts[0].trim();
                    String size = parts[1].trim();
                    Boolean wdesign = Boolean.parseBoolean(parts[2].trim());
                    Boolean whoodie = Boolean.parseBoolean(parts[3].trim());
                    String payment = parts[4].trim();

                    Order.orders.add(new Order(fullname,size,wdesign,whoodie,payment));
                }
                catch (Exception e) {
                    continue;
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}