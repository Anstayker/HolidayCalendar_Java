public class HolidayCalendar {

    public HolidayCalendar() {

    }

    public boolean isHoliday(MyDate date) {
        boolean res = false;
        if(date.getWeekday() == 0) {
            res = true;
        } else {
            if(date.getDay() == 25 && date.getMonth() == 12) {
                res = true;
            }
        }
        return res;
    }
}
