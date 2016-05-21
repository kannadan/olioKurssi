package Harjoitus2;

import java.util.Scanner;

/**
 * Created by Joonas on 19.5.2016.
 */
public class Main {

    private static void printProduct(final Product prod){
        System.out.println("Tuotteen nimi on "+ prod.getName());
        System.out.println("Tuotteen hinta on "+ prod.getPrice());
    }

   private  static Product readProduct(){
        Product tuote = null;
        String name;
        double price;
        System.out.println("Anna tuotteen nimi");
        name = lukija.nextLine();
        System.out.println("Anna tuotteen hinta");
        price = lukija.nextDouble();
        lukija.nextLine();
        tuote = new Product(name, price);
        return tuote;
    }

    static void readProducts( Product [] products ){
        int koko = products.length;
        int counter = 0;
        while(counter<koko){
            products[counter] = readProduct();
            counter++;
        }
    }

    static void printProducts( Product [] products ){
        int koko = products.length;
        int counter = 0;
        while(counter<koko){
            System.out.println("Tuote "+(counter+1));
            printProduct(products[counter]);
            System.out.println("");
            counter++;
        }
    }
    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args){
        int lkm;
        Product tuote = null, kopio = null;
        Product[] taulukko;
        System.out.println("kuinka monta tuotetta");
        lkm = lukija.nextInt();
        lukija.nextLine();
        taulukko = new Product[lkm];
        readProducts(taulukko);
        printProducts(taulukko);
        }
 }

