package SwitchCases;
//reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

/*
The break statements are necessary because without them, statements in switch blocks
fall through: All statements after the matching case label are executed in sequence,
regardless of the expression of subsequent case labels, until a break statement is
encountered.
This program below shows statements in a switch block that fall through.
 */

import java.util.ArrayList;

public class SwitchCaseFallThrough {

    public static void main(String[] args) {

        ArrayList<String> futureMonths = new ArrayList<>();

        int month = 8;

        switch(month){
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()){
            System.out.println("Invalid month number");
        }else{
            for (String monthName:futureMonths){
                System.out.println(monthName);
            }
        }
    }
}
