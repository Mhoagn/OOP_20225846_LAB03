package hust.soict.dsai.lab01;
import javax.swing.*;
// add new
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");

        // Sửa lỗi cú pháp và cách hiển thị thông báo
        JOptionPane.showMessageDialog(null,
                "You 've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0);
    }
}