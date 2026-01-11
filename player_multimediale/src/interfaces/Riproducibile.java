package interfaces;

public interface Riproducibile {
    public void setVolume(byte vol);
    public byte getVolume();
    public void alzaVolume();
    public void abbassaVolume();
    public String play();
}
