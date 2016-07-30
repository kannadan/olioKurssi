package Viikkotehtava6;


/**
 * Created by Joonas on 30.7.2016.
 */
public class Piirra {

    public Piirra(){

    }

    public void setVaihe(int vaihe){

        switch (vaihe){
            case 0:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |    O\n\t  |   /|\\\n\t  |   / \\\n\t+-+-+\n\t|   |");
                break;
            case 1:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |    O\n\t  |   /|\\\n\t  |   / \n\t+-+-+\n\t|   |");
                break;
            case 2:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |    O\n\t  |   /|\\\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 3:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |    O\n\t  |   /|\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 4:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |    O\n\t  |    |\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 5:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |    O\n\t  |\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 6:
                System.out.println("\t  +----+\n\t  |/   |\n\t  |\n\t  |\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 7:
                System.out.println("\t  +----+\n\t  |/   \n\t  |\n\t  |\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 8:
                System.out.println("\n\t  |/   \n\t  |\n\t  |\n\t  |\n\t+-+-+\n\t|   |");
                break;
            case 9:
                System.out.println("\n\n\n\n\n\t+-+-+\n\t|   |");
                break;
            case 10:
                System.out.println("\n\n\n\n\n\n");
                break;


        }

    }

}
