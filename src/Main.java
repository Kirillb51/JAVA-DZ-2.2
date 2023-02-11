public class Main {
    public static void main(String[] args) {
        int account = 300;
        int replenishment = 2000;
        int bonus = 1;
        boolean replenisment = true;
        if (replenishment > 1000) {
            System.out.println(account + replenishment + (replenishment / 100));
            //Бонус при пополнении счета на сумму 2000= 20 бонусным рублям,при пополнении
            // счета на сумму менее 1000 расчёт бонусов не производится.
        }
    }
}