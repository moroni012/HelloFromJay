package prove02;

import java.awt.*;

public class Hipopotamus extends Creature implements Aggressor, Movable {
    public Hipopotamus() {
        _health = 4;
    }
    @Override
    Shape getShape() {
        return Shape.Circle;
    }

    @Override
    public void attack(Creature target) {
        target.takeDamage(4);

    }

    @Override
    Color getColor() {
        return Color.BLACK;
    }

    @Override
    Boolean isAlive() {
        return _health>0;
    }

    @Override
    public void move() {
        _location.y++;
        _location.x--;

    }
}
