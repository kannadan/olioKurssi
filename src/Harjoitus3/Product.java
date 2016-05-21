package Harjoitus3;

/**
 * Created by Joonas on 19.5.2016.
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(final Product original){
        this.name = original.getName();
        this.price = original.getPrice();
        System.out.println("Kopiomuodostin");
        System.out.println("name = "+ this.name);
        System.out.println("price = "+ this.price);
    }

    public void setName(final String name){
        this.name = name;
    }
    public void setPrice(final double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

}
