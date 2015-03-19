package nyc.c4q.reinardcox;

/**
 * Created by shadowslimmedia on 3/15/15.
 */
public class CusMod {

    public static void gridWidth (int size) {
        for (int i =1 ; i <size; i++) {
            System.out.print("@ ");
        }
    }

    public static void gridWidth (int size, int numOne) {

        String word = " ";
        for (int i = 0; i <size; i++){
            System.out.println("@ ");

            for (i = numOne; i <= size; i++ ){
                System.out.println( word += "@ ");
            }
        }
    }

}