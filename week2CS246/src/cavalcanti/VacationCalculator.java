package cavalcanti;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {
    public static void main(String[] args) {
        VacationCalculator vc = new VacationCalculator();
        float japanCost = vc.calculateVacationCost(Destination.JAPAN, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.MEXICO, 3);
        float europeCost = vc.calculateVacationCost(Destination.EUROPE, 7);
        System.out.format(String.format("Total cost for trip to Japan: $%.2f%n", japanCost));
        System.out.format(String.format("Total Cost for trip to Mexico: $%.2f%n", mexicoCost));
        System.out.format((String.format("Total cost for trip to Europe: $.2f%n", europeCost));
    }

    public float calculateVacationCost(Destination dest, int totalNights) {
        List<Expense> itenerary = new ArrayList<Expense>();
        itenerary.add(new Cruise(dest));
        itenerary.add(new Dining(dest));


        float totalCost = tallyExpenses(itenerary);
        return totalCost
    }
    private float tallyExpenses(List<Expense> expenses) {
        float totalCost = 0;
        for(Expense e : expenses) {
            totalCost += e.getCost();
        }
        return totalCost;
    }
}
