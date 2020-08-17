public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        boolean isLeapYear = isLeapYear(year);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) day++;
                else {
                    day = 1;
                    month++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) day++;
                else {
                    day = 1;
                    month++;
                }
                break;
            case 12:
                if (day < 31) day++;
                else {
                    day = 1;
                    month = 1;
                    year++;
                }
                break;
            case 2:
                if (isLeapYear) if (day < 29) day++;
                else {
                    day = 1;
                    month++;
                }
                else if (day < 28) day++;
                else {
                    day = 1;
                    month++;
                }
                break;
        }
        return day + "-" + month + "-" + year;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}