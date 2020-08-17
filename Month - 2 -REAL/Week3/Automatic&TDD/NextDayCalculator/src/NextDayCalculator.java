public class NextDayCalculator {
    public static String NextDayCalculator(int day, int month, int year) {
        switch (day) {
            case 1:
                if (month < 13 && month > 0)
                    return day + 1 + "-" + month + "-" + year;
            case 31:
                if (month == 12) return day - 30 + "-" + (month - 11) + "-" + (year + 1);
                return day - 30 + "-" + (month + 1) + "-" + year;
            case 30:
                if (month == 4) return day - 29 + "-" + (month + 1) + "-" + (year);
            case 28:
                if (month == 2) return day - 27 + "-" + (month + 1) + "-" + (year);
            case 29:
                if (month == 2 && year == 2020) return day - 28 + "-" + (month + 1) + "-" + (year);


        }
        return null;
    }
}
