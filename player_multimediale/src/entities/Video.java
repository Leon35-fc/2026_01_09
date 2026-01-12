package entities;

import interfaces.Illuminato;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Illuminato {
    private byte volume = 3;
    private byte luminosità = 3;

    public Video(String title, int duration){
        super(title, duration);
        this.volume = volume;
        this.luminosità = luminosità;
    }

    @Override
    public void setVolume(byte vol){
        this.volume = vol;
    };

    @Override
    public byte getVolume(){
        return volume;
    }

    @Override
    public void alzaVolume(){
        this.volume++;
    }

    @Override
    public void abbassaVolume(){
        this.volume--;
    }

    @Override
    public void alzaLuminosità(){
        this.luminosità++;
    }

    @Override
    public void abbassaLuminosità(){
        this.luminosità--;
    }

    public String show(){
        String str = "";
        for(byte i=0; i < luminosità; i++){
            str += "*";
        }
//        System.out.println(getTitle() + str);
        return " " + str;
    }

    public String play(){
        String output = "";
        for (int i = 0; i < getDuration(); i++) {
            String str = "";
            for (byte j = 0; j < getVolume(); j++) {
                str += "!";
            }
            return getTitle() + " " + str + " " + show();
        }
        return "Riproduzione terminata";
    }
}
