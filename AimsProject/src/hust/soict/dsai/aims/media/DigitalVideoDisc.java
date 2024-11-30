package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;

    // Constructor 1
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);
    }

    // Constructor 2
    public DigitalVideoDisc(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, null);
    }

    public boolean matchesTitle(String title) {
        return getTitle().toLowerCase().contains(title.toLowerCase());  // Sử dụng getter để lấy title
    }

    public boolean matchesCategory(String category) {
        return getCategory().equalsIgnoreCase(category);  // Sử dụng getter để lấy category
    }

    public boolean matchesPrice(float minPrice, float maxPrice) {

        if (minPrice > 0 && getCost() < minPrice) {  
            return false;
        }
        if (maxPrice > 0 && getCost() > maxPrice) { 
            return false;
        }
        return true;
    }
}
