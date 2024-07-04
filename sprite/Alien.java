package sprite;

import javax.swing.ImageIcon;

/**
 * Alien class representing an alien sprite in the game.
 * Programmer: HBM
 */
public class Alien extends Sprite {

    private Bomb bomb;

    // Constructor to initialize an alien at the given coordinates
    public Alien(int x, int y) {
        initAlien(x, y);
    }

    // Method to initialize the alien's position and image
    private void initAlien(int x, int y) {
        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y);

        // Load the alien image
        var alienImg = "src/images/alien.png";
        var img = new ImageIcon(alienImg);
        setImage(img.getImage());
    }

    // Method to move the alien in the specified direction
    public void act(int direction) {
        this.x += direction;
    }

    // Getter for the bomb object
    public Bomb getBomb() {
        return bomb;
    }

    /**
     * Inner class representing a bomb dropped by the alien.
     */
    public class Bomb extends Sprite {

        private boolean destroyed;

        // Constructor to initialize a bomb at the given coordinates
        public Bomb(int x, int y) {
            initBomb(x, y);
        }

        // Method to initialize the bomb's position and image
        private void initBomb(int x, int y) {
            setDestroyed(true);

            this.x = x;
            this.y = y;

            // Load the bomb image
            var bombImg = "src/images/bomb.png";
            var img = new ImageIcon(bombImg);
            setImage(img.getImage());
        }

        // Setter to update the bomb's destroyed status
        public void setDestroyed(boolean destroyed) {
            this.destroyed = destroyed;
        }

        // Getter to check if the bomb is destroyed
        public boolean isDestroyed() {
            return destroyed;
        }
    }
}
