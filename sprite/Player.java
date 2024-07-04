package sprite;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import GAME.Params;

/**
 * Player class representing the player sprite in the game.
 * Programmer: HBM
 */
public class Player extends Sprite {

    private int width; // Width of the player's image

    // Constructor to initialize the player
    public Player() {
        initPlayer();
    }

    // Method to initialize the player's position and image
    private void initPlayer() {
        // Load the player's image
        var playerImg = "src/images/player.png";
        var img = new ImageIcon(playerImg);

        // Get the width of the player's image
        width = img.getImage().getWidth(null);
        setImage(img.getImage());

        // Set the initial position of the player
        int START_X = 270;
        setX(START_X);

        int START_Y = 280;
        setY(START_Y);
    }

    // Method to update the player's position based on movement
    public void act() {
        x += dx;

        // Prevent the player from moving out of the left boundary
        if (x <= 2) {
            x = 2;
        }

        // Prevent the player from moving out of the right boundary
        if (x >= Params.BOARD_WIDTH - 2 * width) {
            x = Params.BOARD_WIDTH - 2 * width;
        }
    }

    // Method to handle key press events
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Move left when the left arrow key is pressed
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        // Move right when the right arrow key is pressed
        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    // Method to handle key release events
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        // Stop moving when the left arrow key is released
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        // Stop moving when the right arrow key is released
        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}
