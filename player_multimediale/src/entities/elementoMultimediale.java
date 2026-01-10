package entities;

public class elementoMultimediale {
        private String title;
        private int duration;

    public elementoMultimediale(String title){
            this.title = title;
        }

        public elementoMultimediale(String title, int duration){
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
        return title;
        }

        public int getDuration() {
        return duration;
        }
}
