package nyc.c4q.reinardcox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int size, x, y;

        System.out.print("How big do you want your square: ");
        size = userInput.nextInt();
        System.out.print("Pick a number: ");
        x = userInput.nextInt();
        System.out.print("Pick a second number: ");
        y = userInput.nextInt();

        CusMod.gridWidth(size);
        CusMod.gridWidth(x,y);
    }
}
