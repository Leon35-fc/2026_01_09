package entities;

public abstract class ElementoMultimediale {
    private String title;
    private int duration;

        public ElementoMultimediale(String title, int duration){
            this.title = title;
            this.duration = duration;
        }

    public ElementoMultimediale(String title) {
    }

    public String getTitle() {
            return title;
        }

    public int getDuration() {
        return duration;
    }
}
