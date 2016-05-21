package Harjoitus3;

/**
 * Created by Joonas on 20.5.2016.
 */
public class ProductInfo {
    private Product tuote;
    private String seloste;

    public ProductInfo(final Product tuote, final String seloste){
        this.tuote = tuote;
        this.seloste = seloste;
    }
    public ProductInfo(final String name, final double price, final String seloste){
        tuote = new Product(name, price);
        this.seloste = seloste;
    }

    public Product getTuote(){
        return tuote;
    }
    public String getSeloste(){
        return seloste;
    }

    public void setSeloste(String seloste) {
        this.seloste = seloste;
    }

    public void setTuote(Product tuote) {
        this.tuote = tuote;
    }

    public void printInfo(){
        System.out.println("Tuotteen nimi on " + tuote.getName());
        System.out.println("Tuotteen hinta on " + tuote.getPrice());
        System.out.println("Seloste: "+ seloste);
    }
}
