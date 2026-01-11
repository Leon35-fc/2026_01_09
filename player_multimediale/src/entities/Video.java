package entities;

import interfaces.Illuminato;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Illuminato {
    private String title;
    private int duration;
    private byte volume = 3;
    private byte luminosità = 3;

    public Video(String title, int duration){
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setVolume(byte vol){
        this.volume = volume;
    };

    @Override
    public byte getVolume(){
        return volume;
    }

    @Override
    public void alzaVolume(){
        setVolume(this.volume++);
    }

    @Override
    public void abbassaVolume(){
        setVolume(volume--);
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
        for (int i = 0; i < duration; i++) {
            String str = "";
            for (byte j = 0; j < volume; i++) {
                str += "!";
            }
        }
        return output + show();
    }
}
