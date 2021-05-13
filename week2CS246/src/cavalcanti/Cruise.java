package cavalcanti;

import java.sql.SQLOutput;

public class Cruise implements Expense {
    //Creates a variable that stores Destination Value;
    Destination _dest;
    /*
    where we'll go on vacation
     */
    public Cruise(Destination dest) {
        _dest = dest;
    }
    public float getCost() {
        switch (_dest) {
            case MEXICO -> {
                return 1000.00f;
            }
            case EUROPE -> {
                return 2000.00f;
            }
            case JAPAN -> {
                return 3000.00f;
            }
            default -> {
                return 0.00f;
            }


        }
    }
}