import java.util.Scanner;

public class Jeweller {

    private Storage storage;


    public Jeweller() {
        storage = new Storage();
        InventoryFactory.fillInventory(storage);
    }

    public void run() {
        Scanner jeweller = new Scanner(System.in);

        double productBasePrice = 0;
        double productMinimumSellingPrice = 0;
        int i = 1;

        System.out.println("Add meg az " + i + ". alkatrész nevét!");
        String component = jeweller.nextLine();


        while (!component.equals("exit")) {
            System.out.println("Hány darabot használtál fel belőle?");
            int pieces = jeweller.nextInt();
            String enter = jeweller.nextLine();
            for (int j = 0; j < storage.getStorage().size(); j++) {
                if (component.equals(storage.getStorage().get(j).name)) {
                    productBasePrice += (double) (storage.getStorage().get(j).pricePerPiece * pieces);
                }
            }
            i++;
            System.out.println("Add meg az " + i + ". alkatrész nevét!");
            component = jeweller.nextLine();
//            System.out.println("Hány darabot használtál fel belőle?");
//            pieces = jeweller.nextInt();
//            enter = jeweller.nextLine();
        }
        productMinimumSellingPrice = productBasePrice * 3;

        System.out.println("A termék bekerülési költsége: " + productBasePrice);
        System.out.println("A termék ajánlott fogyasztói ára: " + productMinimumSellingPrice);
    }


}
