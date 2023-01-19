public class main {

    public static void main(String[] args) {
        int amount = 5000;
        int mile = 20;


        int bonus = 0;
        if (amount >= 20) {
            bonus = amount / mile;
        }
        System.out.println(" Бонусные мили " + bonus);
    }
}
