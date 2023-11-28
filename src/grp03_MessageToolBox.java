public class grp03_MessageToolBox {

  // Macovei O. ↓ (3, 5)
  public static int ageOfPost(long timeInMillis) {
    final long MILLISECONDS_IN_A_DAY = 24 * 60 * 60 * 1000;
    long currentTime = System.currentTimeMillis();
    // Time at midnight before current day and the day before
    long lastMidnight = currentTime - (currentTime % MILLISECONDS_IN_A_DAY); 
    long timeDifference = lastMidnight - timeInMillis;
    int ageInDays = (int) (timeDifference / MILLISECONDS_IN_A_DAY);
    if(timeDifference % MILLISECONDS_IN_A_DAY > 0)
      ++ageInDays;
    return ageInDays;
  }

  public static void display(String messageText, int width) {
    if(messageText.length() == 0)
      return;
    if(width < 10)
      width = 10;
    if(width > 80)
      width = 80;

    for(int line = 0; line * width <= messageText.length(); ++line) {
      int lineEnd = (line + 1) * width;
      if(lineEnd >= messageText.length())
        lineEnd = messageText.length();
      
      System.out.println(messageText.substring(line * width, lineEnd));

    }
  }

  // Kufa D. ↓ (1)
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

  // McHale C. ↓ (2)
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

  // Oliszewska S. ↓ (4)
  public static String centre(String messageText, int width) {
    int padding = (width - messageText.length()) / 2;
    if (width <= 0) {
      return "";
    }
    else {
    if (width < messageText.length()) {
      return "";
    } else {
    if (messageText.length() == 0) {
      String s = " ";
      String repeated = new String(new char[width]).replace("\0", s);
      return repeated;
      // https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string
      // used within this in order to avoid a loop
    } else {
      return String.format("%" + (padding + messageText.length()) + "s", messageText.substring(0));
    }
    }
    }
  }
}