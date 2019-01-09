import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class Exercise7RectangleRoomAreaTest {

    private Exercise7RectangleRoomArea exercise7RectangleRoomArea;

    @Before
    public void setup() {
        exercise7RectangleRoomArea = new Exercise7RectangleRoomArea();
    }

    @Test
    public void noValuesForFeet() {
        assertThat(exercise7RectangleRoomArea.areaInFeet(0, 0)).isEqualTo(0);
    }

    @Test
    public void noValueForLength() {
        assertThat(exercise7RectangleRoomArea.areaInFeet(0, 5)).isEqualTo(0);
    }

    @Test
    public void noValueForWidth() {
        assertThat(exercise7RectangleRoomArea.areaInFeet(10, 0)).isEqualTo(0);
    }

    @Test
    public void noValueForArea() {
        assertThat(exercise7RectangleRoomArea.convertFeetToMetres(0)).isEqualTo(0);
    }

    @Test
    public void areaCalculatorValuesOf1() {
        assertThat(exercise7RectangleRoomArea.areaInFeet(1, 1)).isEqualTo(1);
    }

    @Test
    public void areaCalculator() {
        assertThat(exercise7RectangleRoomArea.areaInFeet(15, 20)).isEqualTo(300);
    }

    @Test
    public void converterValueOf1() {
        assertThat(exercise7RectangleRoomArea.convertFeetToMetres(1)).isEqualTo(0.09290304);
    }

    @Test
    public void feetToMetresConverter() {
        assertThat(exercise7RectangleRoomArea.convertFeetToMetres(300)).isEqualTo(27.870912);
    }

}