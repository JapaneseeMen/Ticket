public class BonusMilesService {
    public int calculate(int price) {
        int bonus =0;
        if (price >= 20) {
            bonus = price / 20;
        }
        return bonus;
    }
}

