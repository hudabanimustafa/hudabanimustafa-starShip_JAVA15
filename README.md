# Star Ship Game

This project is a simple 2D space shooter game written in Java. It serves as a training project to practice Java programming, especially working with 2D graphics and game development concepts.

## Overview

In this game, the player controls a spaceship that can move left and right and shoot projectiles to destroy aliens. The aliens move back and forth across the screen and periodically drop bombs. The player must avoid these bombs and destroy all the aliens to win the game.

## Features

- Player-controlled spaceship that can move and shoot
- Aliens that move and drop bombs
- Simple collision detection
- Game over conditions for both winning and losing

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE such as IntelliJ IDEA, Eclipse, or NetBeans is recommended for easier development and debugging

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/starship-game.git
    ```
2. Open the project in your preferred IDE.
3. Ensure that your IDE is configured to use the correct JDK version.

### Running the Game

1. Navigate to the `GAME` package.
2. Run the `Main` class to start the game.

## Project Structure

- `GAME`: Contains the main game logic and the entry point of the game.
  - `Board.java`: Manages the game board and the game loop.
  - `Main.java`: The entry point of the game.
- `sprite`: Contains classes representing different game entities.
  - `Alien.java`: Represents an alien.
  - `Player.java`: Represents the player-controlled spaceship.
  - `Shot.java`: Represents a shot fired by the player.
  - `Sprite.java`: A base class for all game entities.
- `src/images`: Contains image files used for the game's graphics.

## Code Overview

### `Main.java`

The `Main` class initializes the game window and starts the game.

### `Board.java`

The `Board` class extends `JPanel` and contains the game logic, including drawing the game entities and handling the game cycle.

### `Sprite.java`

The `Sprite` class is a base class for all game entities. It contains common properties such as position, visibility, and image.

### `Player.java`

The `Player` class extends `Sprite` and represents the player's spaceship. It handles player movement and shooting.

### `Alien.java`

The `Alien` class extends `Sprite` and represents an alien. Each alien can drop a bomb.

### `Shot.java`

The `Shot` class extends `Sprite` and represents a projectile fired by the player.

## Resources

- Images for the game are stored in the `src/images` directory.


## Acknowledgments

This project is developed as part of Java training to practice and understand basic game development concepts.

---

**Programmer:** HBM
![image](https://github.com/hudabanimustafa/hudabanimustafa-starShip_JAVA15/assets/71215108/fa6a41ba-e76b-4a47-80f2-b9b68e703036)


