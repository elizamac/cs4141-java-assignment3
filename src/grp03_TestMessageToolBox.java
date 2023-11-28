public class grp03_TestMessageToolBox {
  public static void main(String[] args) {
    // !TESTING: timeOfDayFormatted
    System.out.println(grp03_MessageToolBox.timeOfDayFormatted(System.currentTimeMillis()));
    
    // !TESTING: post age
    final long MILLISECONDS_IN_A_DAY = 24 * 60 * 60 * 1000;
    long postTime = System.currentTimeMillis() - 3 * MILLISECONDS_IN_A_DAY - (1000 * 60 * 60) * 18;
    System.out.println("Diff between current time (" + grp03_MessageToolBox.dayName(System.currentTimeMillis()) + ", "
        + grp03_MessageToolBox.timeOfDayFormatted(System.currentTimeMillis()) + ") and post time ("
        + grp03_MessageToolBox.dayName(postTime) + ", " + grp03_MessageToolBox.timeOfDayFormatted(postTime) + "): "
        + grp03_MessageToolBox.ageOfPost(postTime) + " days");

    //!TESTING: centre method
    String msg = "testing test";
    int width = 40;
    System.out.println(grp03_MessageToolBox.centre(msg, width));
  }
}