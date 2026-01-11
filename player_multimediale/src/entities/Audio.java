package entities;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private String title;
    private int duration;
    private byte volume = 3;

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public byte getVolume() {
        return volume;
    }

    @Override
    public void setVolume(byte vol) {
        this.volume = volume;
    }

    @Override
    public void alzaVolume() {
        setVolume(this.volume++);
    }

    @Override
    public void abbassaVolume() {
        setVolume(volume--);
    }

    @Override
    public String play() {
        String output = "";
        for (int i = 0; i < duration; i++) {
        String str = "";
            for (byte j = 0; j < volume; i++) {
                str += "!";
            }
            output = title + " " + str;
        }
            return output;
    }
}
