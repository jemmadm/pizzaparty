public class Exercise7RectangleRoomArea {
    private final static double CONVERSION_FACTOR = 0.09290304;

    public int areaInFeet(int length, int width) {
        int feetFormula = length * width;
        int areaInSquareFeet = feetFormula;

        return areaInSquareFeet;
    }

    public double convertFeetToMetres(int areaInSquareFeet) {

        double conversion = areaInSquareFeet * CONVERSION_FACTOR;
        double areaInSquareMetres = conversion;

        return areaInSquareMetres;


    }
}