public class BonusMilesService {
    public int bonusmiles(int price) {
        int result;
        if (price >= 20) {
            result = price / 20;
        } else {
            result = 0;
        }
        return result;
    }
}







/*public class Main {
    public static void main(String[] args) {
        int amount = 13676; //стоимость билета
        int bonus = 20; //количество рублей для одной бонусной мили

        int accrual = amount / bonus; //accrual - количество начисленных бонусных миль
        if (amount >= 20) {
            System.out.println(accrual);
        } else {
            System.out.println("Бонусные мили = 0");
        }
    }
}*/