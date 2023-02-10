import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioman.services.Radio;


public class RadioTest {

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.Next(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousRadioStation() {
        Radio radio = new Radio();
        radio.Prev(2);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Next() {
        Radio radio = new Radio();

        radio.currentRadioStation = 10;
        int expected = 10;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();

        radio.maxRadioVolume(10);

        int expected = 10;

        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();

        radio.minRadioVolume(1);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);


    }
}
