package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title) {
        super(title, null, null, 0, 0);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public boolean matchesTitle(String title) {
        return getTitle().toLowerCase().contains(title.toLowerCase());  
    }

    // Phương thức kiểm tra danh mục
    public boolean matchesCategory(String category) {
        return getCategory().equalsIgnoreCase(category);  
    }

    // Phương thức kiểm tra giá
    public boolean matchesPrice(float minPrice, float maxPrice) {

        if (minPrice > 0 && getCost() < minPrice) {  
            return false;
        }
        if (maxPrice > 0 && getCost() > maxPrice) { 
            return false;
        }
        return true;
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }
}
