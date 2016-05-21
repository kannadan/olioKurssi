package Harjoitus1;

/**
 * Created by Joonas on 19.5.2016.
 */
import java.util.Scanner;
public class tehtava3 {
    public static boolean checkIdNumber(final String hetu){
        int lenght = hetu.length();
        if(lenght == 11) {
            char century = hetu.charAt(6);
            if (century == "-".charAt(0) || century == "+".charAt(0) || century == "A".charAt(0)) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
    static void printBirthdate(final String hetu){
        StringBuilder tyosto = new StringBuilder(hetu);
        tyosto.replace(7,11,"");
        tyosto.insert(6, " ");
        tyosto.insert(4, " ");
        tyosto.insert(2, " ");
        String word = tyosto.toString();
        String[] dates = word.split(" ");
        if(dates[3].matches("-")){
            System.out.printf("Syntymäaikasi 0n %s.%s.19%s\n", dates[0],dates[1],dates[2]);
        }
        else if(dates[3].matches("\\+")){
            System.out.printf("Syntymäaikasi 0n %s.%s.18%s\n", dates[0],dates[1],dates[2]);
        }
        else{
            System.out.printf("Syntymäaikasi 0n %s.%s.20%s\n", dates[0],dates[1],dates[2]);
        }
    }
    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args){
        String hetu;
        System.out.println("Anna henkilötunnus");
        hetu = lukija.nextLine();
        boolean correct = checkIdNumber(hetu);
        if (correct){
            printBirthdate(hetu);
        }
        else{
            System.out.println("väärän mallinen hetu");
        }


    }
}
