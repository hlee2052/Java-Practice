package enums;

/**
 *  Strategy enum pattern
 */
public enum PayrollDay{
    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);

    // private enum
    private final PayType payType;

    PayrollDay(PayType payType) {this.payType = payType;}


    double pay(double hoursWorked, double payRate){
        return payType.pay(hoursWorked, payRate);
    }
    //The strategy  enum type
    private enum PayType{
        WEEKDAY{
            double overtimePay(double hours, double payRate) {
                return hours*payRate*1.1;
            }
        },
        WEEKEND{
            double overtimePay(double hours, double payRate) {
                return hours*payRate*1.5;
            }
        };
        private static final int HOURS_PER_SHIFT = 8;

        abstract double overtimePay(double hours, double payRate);

        double pay(double hoursWorked, double payRate){
            double basePay = hoursWorked * payRate;


            return basePay + overtimePay((hoursWorked >
                    HOURS_PER_SHIFT)?(hoursWorked-HOURS_PER_SHIFT):0,
                    payRate);
        }
    }


}