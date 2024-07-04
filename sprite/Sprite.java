package sprite;

import java.awt.Image;

/**
 * Sprite class representing a basic game object with common properties.
 * Programmer: HBM
 */
public class Sprite {

    private boolean visible; // Visibility status of the sprite
    private Image image; // Image representing the sprite
    private boolean dying; // Status indicating if the sprite is dying
    
    int x; // X-coordinate of the sprite
    int y; // Y-coordinate of the sprite
    int dx; // Change in X-coordinate for movement

    // Constructor to initialize the sprite as visible
    public Sprite() {
        visible = true;
    }

    // Method to mark the sprite as dead (invisible)
    public void die() {
        visible = false;
    }

    // Method to check if the sprite is visible
    public boolean isVisible() {
        return visible;
    }

    // Method to set the visibility of the sprite
    protected void setVisible(boolean visible) {
        this.visible = visible;
    }

    // Method to set the image of the sprite
    public void setImage(Image image) {
        this.image = image;
    }

    // Method to get the image of the sprite
    public Image getImage() {
        return image;
    }

    // Method to set the X-coordinate of the sprite
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the Y-coordinate of the sprite
    public void setY(int y) {
        this.y = y;
    }

    // Method to get the Y-coordinate of the sprite
    public int getY() {
        return y;
    }

    // Method to get the X-coordinate of the sprite
    public int getX() {
        return x;
    }

    // Method to set the dying status of the sprite
    public void setDying(boolean dying) {
        this.dying = dying;
    }

    // Method to check if the sprite is dying
    public boolean isDying() {
        return this.dying;
    }
}
