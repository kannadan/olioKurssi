package Harjoitus3;

/**
 * Created by Joonas on 20.5.2016.
 */
public class Main {

    private static String getName(Listener sc){
        String name;
        System.out.println("Anna tuotteen nimi");
        name = sc.getString();
        return name;
    }

    private static String getSeloste(Listener sc){
        String seloste;
        System.out.println("Anna tuotteen seloste");
        seloste = sc.getString();
        return seloste;
    }

    private static double getPrice(Listener sc){
        double price;
        System.out.println("Anna tuotteen hinta");
        price = sc.getDouble();
        return price;
    }

    public static void main(String[] args) {
        Listener sc = new Listener();
        Product tuote2;
        ProductInfo kooste1, kooste2;
        String seloste1, seloste2, name1, name2;
        double price1, price2;
        name1 = getName(sc);
        price1 = getPrice(sc);
        seloste1 = getSeloste(sc);
        name2 = getName(sc);
        price2 = getPrice(sc);
        seloste2 = getSeloste(sc);
        tuote2 = new Product(name2, price2);
        kooste1 = new ProductInfo(name1, price1, seloste1);
        kooste2 = new ProductInfo(tuote2, seloste2);
        kooste1.printInfo();
        System.out.println("");
        kooste2.printInfo();
        RandTable taulukko = new RandTable(10, 10);
        int arvo;
        while (true){
            arvo = taulukko.nextNumber();
            if (arvo == -1){
                break;
            }
            else{
                System.out.println(arvo);
            }
        }
    }
}
