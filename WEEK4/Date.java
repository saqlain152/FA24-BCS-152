package librarysystem;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    public void showDate() {
        System.out.println("Publication Date: " + day + "/" + month + "/" + year);
    }

   
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }
}

