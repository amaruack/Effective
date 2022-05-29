package com.son.yj.chapter6.item34;

import static com.son.yj.chapter6.item34.PayrollDay.PayType.WEEKDAY;
import static com.son.yj.chapter6.item34.PayrollDay.PayType.WEEKEND;

public enum PayrollDay {

    MONDAY(WEEKDAY), TUESDAY(WEEKDAY),
//    ...
    SATURDAY (WEEKEND)
    ;

    private PayType payType;
    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }


    enum PayType {
        WEEKDAY {
            int overtimePay (int mins, int payRate){
                return mins <=  MINS_PER_SHIFT ? 0 : (mins - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            int overtimePay (int mins, int payRate){
                return mins * payRate / 2;
            }
        };

        private static final int MINS_PER_SHIFT = 8 * 60;
        abstract int overtimePay(int mins, int payRate);

        int pay(int minsWorked, int payRate)  {
            int basePay = minsWorked * payRate ;
            return basePay + overtimePay(minsWorked, payRate);
        }

    }

}
