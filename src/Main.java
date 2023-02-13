public class Main {
    public static void main(String[] args) {
        int account = 300;
        int replenishment = 2000;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;

        }
        int balance = account + replenishment + bonus;
        System.out.println("Ваш баланс+бонус:" + balance);
    }
}