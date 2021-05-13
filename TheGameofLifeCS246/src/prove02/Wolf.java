package prove02;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// The Wolf class should be a subclass of Creature and
// should implement the Movable, Aware, and Aggressor interfaces.
public class Wolf extends Creature implements Movable, Aware, Aggressor, Spawner {
    Direction _direction;
    Boolean _spawn;

    public Wolf() {
        Random random = new Random();
        int _randomDirection = random.nextInt(4);
        _health = 1;
        _spawn = false;

        if (_randomDirection == 0) {
            _direction = Direction.Up;
        } else if (_randomDirection == 1) {
            _direction = Direction.Down;
        } else if (_randomDirection == 2) {
            _direction = Direction.Left;
        } else {
            _direction = Direction.Right;
        }
    }

    // Instances of the Wolf class should attack any Animal instances they land on,
    // but should not attack Plant or Zombie instances.
    // Wolves should inflict 5 points of damage when they attack.
    @Override
    public void attack(Creature target) {
        if (target instanceof Animal) {
            target.takeDamage(5);

            // Every time a wolf eats another animal,
            // it should gain the ability to spawn a new wolf on its next turn.
            if (!(target.isAlive())) {
                _spawn = true;
            }
        }
    }

    // When the senseNeighbors() function is called, the Wolf instance should change
    // its preferred direction to be in the direction of the first Animal instance it sees.
    // When checking for nearby animals, it should first check in the direction it's already moving.
    // If no Animal instance is there, it should search in a clockwise pattern starting at the top.
    //
    // So, if the Wolf is moving left, it should first check the creature provided in the
    // left parameter of senseNeighbors() , followed by above, then right, then below.

    @Override
    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        Map<Direction, Creature> map = new HashMap<>();
        map.put(Direction.Up, above);
        map.put(Direction.Down, below);
        map.put(Direction.Left, left);
        map.put(Direction.Right, right);

        Direction[] directions = Direction.values();

        int startingPosition = _direction.ordinal();

        for (int i=0; i<directions.length; i++) {
            int currentPosition = (startingPosition + i) % directions.length;

            if (map.get(directions[currentPosition]) instanceof Animal) {
                _direction = directions[currentPosition];
                return;
            }
        }
    }

    @Override
    Shape getShape() {
        return Shape.Square;
    }

    // Instances of the Wolf class should be represented as gray squares.
    @Override
    Color getColor() {
        return Color.gray;
    }

    @Override
    Boolean isAlive() {
        return (_health > 0);
    }


    // When the move() function is called on a Wolf instance, it should move in its preferred direction.
    // When it is first created, it's preferred direction should be random.

    @Override
    public void move() {
        if (_direction == Direction.Up) {
            _location.y--;
        } else if (_direction == Direction.Right) {
            _location.x++;
        } else if (_direction == Direction.Down) {
            _location.y++;
        } else if (_direction == Direction.Left) {
            _location.x--;
        }
    }

    @Override
    public Creature spawnNewCreature() {
            //  After spawning a new wolf, the parent should lose the ability to spawn
            //  new wolves until the next time it eats an animal.
           _spawn = false;
           Wolf babyWolf = new Wolf();
           // The newly spawned wolf should be created in the square directly to the left of its parent.
           babyWolf._location = (new Point(_location.x - 1, _location.y));
           return babyWolf;
       }
    }


