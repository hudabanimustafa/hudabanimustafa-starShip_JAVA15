package GAME;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main extends JFrame {

    // Constructor to initialize the UI
    public Main() {
        initUI();
    }

    // Method to set up the user interface
    private void initUI() {
        // Add the game board to the frame
        add(new Board());

        // Set the title of the game window
        setTitle("Star Ship");

        // Set the size of the game window based on board parameters
        setSize(Params.BOARD_WIDTH, Params.BOARD_HEIGHT);

        // Ensure the application exits when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Prevent resizing the window
        setResizable(false);

        // Center the window on the screen
        setLocationRelativeTo(null);
    }

    // Main method to start the game
    public static void main(String[] args) {
        // Use EventQueue to ensure thread safety when creating the GUI
        EventQueue.invokeLater(() -> {
            var ex = new Main();
            ex.setVisible(true);
        });
    }
}
