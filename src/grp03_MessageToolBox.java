public class grp03_MessageToolBox {
  public static String timeOfDayFormatted(long timeInMillis) {
    final long MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
    final long SECS_IN_HOUR = 60 * 60;

    // Variable figures needed to calculate time
    long MILLIS_SINCE_MIDNIGHT = timeInMillis % MILLIS_IN_DAY;
    long SECS_SINCE_MIDNIGHT = MILLIS_SINCE_MIDNIGHT / 1000;
    // Calculating the current time
    long hour = SECS_SINCE_MIDNIGHT / SECS_IN_HOUR;
    long minute = (SECS_SINCE_MIDNIGHT % SECS_IN_HOUR) / 60;
    long second = SECS_SINCE_MIDNIGHT % 60;

    String formatedTime = new String();
    if (hour < 10)
      formatedTime += "0"; // Adding "0" if the hour is smaller than 10
    formatedTime += Long.toString(hour) + ':';
    if (minute < 10)
      formatedTime += "0"; // Adding "0" if the minute is smaller than 10
    formatedTime += Long.toString(minute) + ':';
    if (second < 10)
      formatedTime += "0"; // Adding "0" if the second is smaller than 10
    formatedTime += Long.toString(second);

    return formatedTime;
  }

  public static String dayName(long timeInMillis) {
    final long MILLIS_IN_DAY = 24 * 60 * 60 * 1000;
    int currentDayNumber = (int) (timeInMillis / MILLIS_IN_DAY) % 7;
    String currentDayName;
    switch (currentDayNumber) {
      case 0:
        currentDayName = "Thursday";
        break;
      case 1:
        currentDayName = "Friday";
        break;
      case 2:
        currentDayName = "Saturday";
        break;
      case 3:
        currentDayName = "Sunday";
        break;
      case 4:
        currentDayName = "Monday";
        break;
      case 5:
        currentDayName = "Tuesday";
        break;
      default:
        currentDayName = "Wednesday";
        break;
    }
    
    return currentDayName;
  }

  public static String centre(String messageText, int width) {
    String msg = "Insert Message that is rather long here";
    int wideness = 100;
    int padding = (wideness - msg.length()) / 2;
    if (width <= 0) {
      return "";
    }
    if (width < messageText.length()) {
      return "";
    }
    if (messageText.length() == 0) {
      String s = " ";
      String repeated = new String(new char[width]).replace("\0", s);
      return repeated;
      // https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string
      // used within this in order to avoid a loop
    } else {
      return String.format("%" + (padding + msg.length()) + "s", msg.substring(0, width));
    }
  }
}