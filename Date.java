public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getyear(){
        return year;
    }
    public int compareTo(Date d1) {
        return 0;
    }
    public boolean isBetween(Date startDate, Date endDate) {
        return false;
    }
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
