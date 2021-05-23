package SwitchCases;
//reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

/*
Deciding whether to use if-then-else statements or a switch statement is
 based on readability and the expression that the statement is testing.
 An if-then-else statement can test expressions based on ranges of values or
 conditions, whereas a switch statement tests expressions based only on a
 single integer, enumerated value, or String object.
 */

public class SwitchCasePractice {

    public static void main(String[] args) {
        int month = 8;
        String monthString;
        switch(month) {
            case 1: monthString = "January";
                    break;
            case 2: monthString = "February";
                    break;
            case 3: monthString = "March";
                    break;
            case 4: monthString = "April";
                    break;
            case 5: monthString = "May";
                    break;
            case 6: monthString = "June";
                    break;
            case 7: monthString = "July";
                    break;
            case 8: monthString = "August";
                    break;
            case 9: monthString = "September";
                    break;
            case 10: monthString = "October";
                    break;
            case 11: monthString = "November";
                    break;
            case 12: monthString = "December";
                    break;
            default: monthString = "Invalid month";
                    break;
        }
        System.out.println(monthString); //in this case, "August" is printed to standard output.
    }

}
