public class Main {
    public static void main(String[] args) {
        int x = 300;
        int y = 2000;
        int bonus = 1;
        if (y > 1000) {
            System.out.println(x + y + (y / 100));
            //Бонус при пополнении счета на сумму 2000= 20 бонусным рублям,при пополнении
            // счета на сумму менее 1000 расчёт бонусов не производится.
        }
    }
}