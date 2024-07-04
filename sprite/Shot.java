package sprite;

import javax.swing.ImageIcon;

/**
 * Shot class representing the projectile shot by the player.
 * Programmer: HBM
 */
public class Shot extends Sprite {

    // Default constructor
    public Shot() {
    }

    // Constructor to initialize the shot at given coordinates
    public Shot(int x, int y) {
        initShot(x, y);
    }

    // Method to initialize the shot's position and image
    private void initShot(int x, int y) {
        // Load the shot image
        var shotImg = "src/images/shot.png";
        var img = new ImageIcon(shotImg);
        setImage(img.getImage());

        // Set the initial position of the shot
        // X_SPACE adds an offset to the x-coordinate
        int X_SPACE = 6;
        setX(x + X_SPACE);

        // Y_SPACE adds an offset to the y-coordinate
        int Y_SPACE = 1;
        setY(y - Y_SPACE);
    }
}
