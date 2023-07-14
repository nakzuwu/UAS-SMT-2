package UAS3;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Inventory> jamal = new ArrayList<>();
        Inventory item1 = new Inventory();
        item1.setNAMA("usb");
        item1.setHARGA("20k");
        jamal.add(item1);

        Inventory item2 = new Inventory();
        item2.setNAMA("vivan usb");
        item2.setHARGA("40k");
        jamal.add(item2);

        Inventory item3 = new Inventory();
        item3.setNAMA("robot usb c");
        item3.setHARGA("50k");
        jamal.add(item3);

        Scanner udin = new Scanner(System.in);
        System.out.println("seleksi menurut apa? harga/nama ");
        String input = udin.nextLine();

        if (input.equals("harga")) {
            Inventory.sortByPrice(jamal);
        } else if (input.equals("nama")) {
            Inventory.sortByName(jamal);
        } else {
            System.out.println("Invalid input");
            udin.close();
            return;
        }

        for (Inventory item : jamal) {
            System.out.println("nama barang : " + item.getNAMA() + ", harga : " + item.getHARGA());
        }

        udin.close();
    }
}
