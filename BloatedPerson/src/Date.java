public class Date {

  private final int day;
  private final int month;
  private final int year;

  public Date(int day, int month,int year) throws IllegalArgumentException{
    this.year = year;
    this.month = month;
    this.day = day;
  }

  private boolean isValid(int day, int month, int year) {

    if (year < 0) {
      return false;
    }

    if (month < 1 || month > 12) {
      return false;
    }

    if (day < 1) {
      return false;
    }

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        if (day > 31) {
          return false;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if (day> 30) {
          return false;
        }
        break;
      default:
        assert month == 2;
        if (day > (isLeapYear(year) ? 29 : 28)) {
          return false;
        }
    }
    return true;
  }

  private static boolean isLeapYear(int year) {
    // Deliberately simplified version of
    // leap year calculation
    return (year % 4 == 0);
  }

  @Override
  public String toString(){
    return day + "/" + month + "/" + year;
  }



}
