import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioman.services.Radio;


public class RadioTest {

    @Test
    public void maxRadioStation() {
        Radio radio = new Radio();

        radio.Next(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.Next(4);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lastRadioStation() {
        Radio radio = new Radio();
        radio.Prev(0);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousRadioStation() {
        Radio radio = new Radio();
        radio.Prev(5);
        int expected = 4;
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
    public void maxVolume() {
        Radio radio = new Radio();

        radio.maxRadioVolume(10);

        int expected = 10;

        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void altVolume() {
        Radio radio = new Radio();
        radio.maxRadioVolume(6);
        int expected = 7;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void backVolume() {
        Radio radio = new Radio();

        radio.minRadioVolume(1);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.minRadioVolume(0);
        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
}
