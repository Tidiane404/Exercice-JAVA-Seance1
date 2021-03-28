public class Exo5{
    private int month; 
    private int year;

    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public void setMonth(int month) {
        if (month>0 && month<=12) {
            
            this.month=month;
        }
    }

    public void setYear(int year) {
        if (year>0) {
            this.year=year;
        }
        
    }
}