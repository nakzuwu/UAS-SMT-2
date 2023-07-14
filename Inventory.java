package UAS3;

import java.util.List;

public class Inventory {
    private String NAMA;
    private String HARGA;

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getHARGA() {
        return HARGA;
    }

    public void setHARGA(String HARGA) {
        this.HARGA = HARGA;
    }

    public static void sortByPrice(List<Inventory> jamal) {
        int n = jamal.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (Integer.parseInt(jamal.get(j).getHARGA().replaceAll("[^\\d.]", ""))
                        < Integer.parseInt(jamal.get(minIndex).getHARGA().replaceAll("[^\\d.]", ""))) {
                    minIndex = j;
                }
            }
            Inventory temp = jamal.get(i);
            jamal.set(i, jamal.get(minIndex));
            jamal.set(minIndex, temp);
        }
    }

    public static void sortByName(List<Inventory> jamal) {
        int n = jamal.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (jamal.get(j).getNAMA().compareTo(jamal.get(minIndex).getNAMA()) < 0) {
                    minIndex = j;
                }
            }
            Inventory temp = jamal.get(i);
            jamal.set(i, jamal.get(minIndex));
            jamal.set(minIndex, temp);
        }
    }
}