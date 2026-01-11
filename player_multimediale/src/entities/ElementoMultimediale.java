package entities;

public abstract class ElementoMultimediale {
        private String title;


    private byte duration;

        public ElementoMultimediale(String title){
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
        
    public byte getDuration() {
        return duration;
    }
}
