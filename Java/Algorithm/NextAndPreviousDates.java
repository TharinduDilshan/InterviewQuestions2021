import java.util.HashMap;
import java.util.Map;

public class NextAndPreviousDates {

    int d, m, y;
    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public NextAndPreviousDates(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }


    public static void getNextDate(NextAndPreviousDates date) throws InputException {
        int month = date.m;
        int day = date.d;
        int year = date.y;
        System.out.println("given date is :" + day + "/" + month + "/" + year);
        if (day < map.get(month)) {
            day += 1;
        } else if (day == map.get(month) && month != 12) {
            day = 01;
            month += 1;
        } else if (month == 12 && day == 31) {
            day = 01;
            month = 01;
            year += 1;
        }
        System.out.println("next date is : " + day + "/" + month + "/" + year);
    }

    public static int leapyear(NextAndPreviousDates date) {
        if (date.y % 4 == 0)
            return 29;
        return 28;
    }

    public static void getPreviousDate(NextAndPreviousDates dates) throws InputException {
        int month = dates.m;
        int day = dates.d;
        int year = dates.y;
        if (day <= map.get(month) && day > 01) {
            day -= 1;
        } else if (day == 01 && month != 01) {
            day = map.get(month - 1);
            month -= 1;
        } else if (month == 01 && day == 01) {
            day = 31;
            month = 12;
            year -= 1;
        }
        System.out.println("previous date is : " + day + "/" + month + "/" + year);
    }


    public static void main(String[] args) throws InputException {
        try {
            NextAndPreviousDates date = new NextAndPreviousDates(31, 13, 2001);
            int month = date.m;
            int day = date.d;
            int year = date.y;
            map.put(1, 31);
            map.put(2, leapyear(date));
            map.put(3, 30);
            map.put(4, 31);
            map.put(5, 30);
            map.put(6, 31);
            map.put(7, 31);
            map.put(8, 30);
            map.put(9, 31);
            map.put(10, 31);
            map.put(11, 30);
            map.put(12, 31);
            if (day > map.get(month) || month > 12) System.out.println("invalid date");
            else {
                getNextDate(date);
                getPreviousDate(date);
            }
        }catch (Exception e){
            System.out.println("enter valid date");
        }
    }
}
