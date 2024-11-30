package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {}

    public Disc(String title, String category, String director, int length, float cost) {
        super(0, title, category, cost); // `id` có thể được tự động gán trong lớp cha
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
