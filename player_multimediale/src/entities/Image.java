package entities;

import interfaces.Illuminato;

public class Image extends ElementoMultimediale implements Illuminato {
    private static final Object duration = 0;
    private byte luminosità = 3;

    public Image(String title, byte luminosità) {
        super(title, duration);
        this.luminosità = luminosità;
    }


    public Image(String title) {
        super(title);
    }

    public byte getDuration() {
        return duration;
    }

    public byte getLuminosità(){
        return luminosità;
    }

    public void setLuminosità(byte luminosità) {
        this.luminosità = luminosità;
    }

    @Override
    public void alzaLuminosità(){
        this.luminosità++;
    }

    @Override
    public void abbassaLuminosità(){
        this.luminosità--;
    }

    @Override
    public String show(){
        String str = "";
        for(byte i=0; i < luminosità; i++){
            str += "*";
        }
//        System.out.println(getTitle() + str);
        return getTitle() + " " + str;
    }
}
