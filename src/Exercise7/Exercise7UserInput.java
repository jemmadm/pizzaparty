package Exercise7;

import java.util.Scanner;

public class Exercise7UserInput {
    private final static double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {


        System.out.println("What is the length of the room in feet?");

        String stringLength = new Scanner(System.in).next();


        System.out.println("What is the width of the room in feet?");

        String stringWidth = new Scanner(System.in).next();


        int length = Integer.parseInt(stringLength);
        int width = Integer.parseInt(stringWidth);


        int feetFormula = length * width;
        int areaInFeet = feetFormula;
        double conversion = areaInFeet * CONVERSION_FACTOR;
        double totalAreaInMetres = conversion;

        System.out.println("The length of the room is " + length + " feet");
        System.out.println("The width of the room is " + width + " feet");
        System.out.println("The area of the room is " + areaInFeet + " square feet");
        System.out.println("The area of the room is " + totalAreaInMetres + " square metres");

    }

}
