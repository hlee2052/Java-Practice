package enums;

/**
 * Runner for {@link PayrollDay} - Strategy enum pattern
 */
public class PayrollDayMain {
    public static void main(String[] args) {
        System.out.println(PayrollDay.MONDAY);

        // pay adjusted for overtime (Weekday and weekend has 1.1, 1.5 after-hour multiplier
        double payForMonday = PayrollDay.MONDAY.pay(9, 10.0);
        double payForSunday = PayrollDay.SUNDAY.pay(13, 10);
        System.out.println(payForMonday);
        System.out.println(payForSunday);
    }
}
