public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.month++;
            this.day = 1;

            if (this.month > 12) {
                this.year++;
                this.month = 1;
            }
        }
    }

    public void advance(int numberOfDays) {
        int paevad = 0;
        while (paevad < numberOfDays) {
            this.advance();
            paevad++;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate( this.day, this.month, this.year );
        int paev = 0;
        while (paev < days){
            newMyDate.advance();
            paev++;
        }// some code here

        return newMyDate;
    }
  public int  differenceInYears(MyDate compared){
      int minusYear = 0;
      if (this.month < compared.month) {
          minusYear = 1;
      } else if (this.month == compared.month && this.day < compared.day) {
          minusYear = 1;
      }

      return this.year - compared.year - minusYear;
  }
}