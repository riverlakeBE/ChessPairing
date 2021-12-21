package chessPairing;


import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.MenuItem;
import java.awt.PopupMenu;

public class Main {

    /**
     * @ignored @param args
     */
    public static void main(String[] args) {
        /* Launch the program.
         */
        launch();
    }

    /**
     * Creates all Panels, Buttons and Menus
     * Initializes action handlers
     */
    private static void launch() {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(400, 400));
        PopupMenu popup = new PopupMenu();
        Controller controller = new Controller();
        MenuItem menuItem = new MenuItem();
        menuItem.setName("add player");
        menuItem.addActionListener(controller::handleAddPlayerAction);
        popup.add(menuItem);
        frame.add(popup);
        frame.setVisible(true);
    }
}
