package cavalcanti;

public class Player {
    String name;
    int health;
    int mana;
    int gold;

    public Player(String cavalcanti, int i, int i1, int i2) {
        this.name = name;
        this.health = 0;
        this.mana = 0;
        this.gold = 0;
    }

    public void display() {
        System.out.println("Name: " + name + "\nHeath: " + health + "\nMana: " + mana + "\nGold: " + gold);
    }
}
