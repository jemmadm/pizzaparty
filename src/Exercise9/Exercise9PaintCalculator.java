package Exercise9;

public class Exercise9PaintCalculator {
    private final static double SQUARE_FEET_PER_GALLON = 350;

    public String paintNeededForRectangularRoom(double width, double length) {
        return (int) Math.ceil(length * width / SQUARE_FEET_PER_GALLON) + " gallons of paint needed";
    }

    public String paintNeededForRoundRoom(double radius) {
        return "" + (int) Math.ceil((radius * radius) * Math.PI);
    }
}