package Lab5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateRange {
    private Calendar startDate;
    private Calendar endDate;
    public DateRange(Calendar startDate, Calendar endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public boolean isInRange(Date dt){
        if(dt.compareTo(startDate.getTime()) > 0 && dt.compareTo(endDate.getTime()) < 0)
            return true;
        else
            return false;
    }

    public static Date getFirstDayOfMonth(Date dt){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, dt.getYear());
        cal.set(Calendar.MONTH, dt.getMonth());
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    public static Date getLastDayOfMonth(Date dt){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, dt.getYear());
        cal.set(Calendar.MONTH, dt.getMonth());
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
        return "Date Range: " + sdf.format(startDate.getTime()) + " - " + sdf.format(endDate.getTime());
    }
}
