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
}