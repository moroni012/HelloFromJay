package prove02;

import java.awt.*;
import java.util.Random;

// The Zombie class should be a subclass of Creature
// and should implement the Movable and Aggressor interfaces.
public class Zombie extends Creature implements Movable, Aggressor{

    public Zombie() {
        _health = 1;
    }

    /* Instances of the Zombie class should attack any creature they land on,
     as long as it isn't an instance of the Plant class.
     They should inflict 10 points of damage when they attack.*/
    @Override
    public void attack(Creature target) {
        // Zombies attack any creature they land on,
        // as long as it isn't an instance of the Plant class
        // They inflict 10 points of damage when they attack
        if ((target != null) && !(target instanceof Plant)){
            target.takeDamage(10);
        }
    }

    // Instances of the Zombie class should be represented as blue squares.
    @Override
    Shape getShape() {
        return Shape.Square;
    }

    // Instances of the Zombie class should be represented as blue squares.
    @Override
    Color getColor() {
        return new Color(32, 83, 226, 255);
    }

    @Override
    Boolean isAlive() {
        return (_health > 0);
    }
    // Instances of the Zombie class should always move from left to right.
    @Override
    public void move() {
            _location.x++;
        }
    }

