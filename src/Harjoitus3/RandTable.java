package Harjoitus3;

/**
 * Created by Joonas on 20.5.2016.
 */
import java.util.Random;
public class RandTable {
    private int curPosition;
    private int[] taulukko;
    private int maxSize, size;

    public RandTable(final int max, final int size){
        Random generator = new Random();
        maxSize = max;
        this.size = size;
        taulukko = new int[size];
        curPosition = 0;
        for (int x = 0; x<size; x++){
            taulukko[x] = generator.nextInt(max);
        }
    }
    public int nextNumber(){
        if (curPosition == size){
            return -1;
        }
        else{
            int arvo = taulukko[curPosition];
            curPosition++;
            return arvo;
        }
    }
}
