package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;


    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, null); 
    }

}
