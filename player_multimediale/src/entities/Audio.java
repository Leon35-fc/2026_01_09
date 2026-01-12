package entities;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private byte volume = 3;

    public Audio(String title, int duration) {
        super(title, duration);
    }

    @Override
    public byte getVolume() {
        return volume;
    }

    @Override
    public void setVolume(byte vol) {
        this.volume = vol;
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    @Override
    public String play() {
        String output = "";
        for (int i = 0; i < getDuration(); i++) {
        String str = "";
            for (byte j = 0; j < getVolume(); j++) {
                str += "!";
            }
//            output = getTitle() + " " + str;
            System.out.println(getTitle() + " " + str);
        }
            return "Riproduzione terminata";
    }
}
