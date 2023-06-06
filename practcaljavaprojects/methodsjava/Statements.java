public class Statements {
    public static void main(String[] args) {
     /*   switchStatements(0);
        switchStatements(1);
        switchStatements(2);
        switchStatements(3);
        switchStatements(4);
        switchStatements(5);
        switchStatements(6);
        switchStatements(7);

    }

    private static void switchStatements(int switchValues) {
        switch (switchValues) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("InvalidValues");
        }*/
        int weekDays ;
        for (weekDays = 1; weekDays <=7; weekDays++ ) {
            if (weekDays == 1) {
                System.out.println("Sunday");
            } else if (weekDays == 2) {
                System.out.println("Monday");

            } else if (weekDays == 3) {
                System.out.println("Tuesday");
            } else if (weekDays == 4) {
                System.out.println("Wednesday");
            } else if (weekDays == 5) {
                System.out.println("Thursday");
            } else if (weekDays == 6) {
                System.out.println("Friday");
            } else if (weekDays == 7) {
                System.out.println("Saturday");
            } else {
                System.out.println("Invalid day");
            }
        }
        System.out.println("Days of the week" + weekDays);
    }
}
