import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioman.services.Radio;
import ru.netology.radioman.services.RadioVolume;

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
        RadioVolume volume = new RadioVolume();

        volume.maxRadioVolume(10);

        int expected = 10;

        int actual = volume.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        RadioVolume volume = new RadioVolume();

        volume.minRadioVolume(1);
        int expected = 0;
        int actual = volume.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);


    }
}
