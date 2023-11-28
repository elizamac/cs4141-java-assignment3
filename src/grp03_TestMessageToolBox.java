public class grp03_TestMessageToolBox {
  public static void main(String[] args) {
    // !TESTING: timeOfDayFormatted
    System.out.println(grp03_MessageToolBox.timeOfDayFormatted(System.currentTimeMillis()));

    // !TESTING: post age
    final long MILLISECONDS_IN_A_DAY = 24 * 60 * 60 * 1000;
    long postTime = System.currentTimeMillis() - 3 * MILLISECONDS_IN_A_DAY - (1000 * 60 * 60) * 18;
    System.out.println("Diff between current time (" +
        grp03_MessageToolBox.dayName(System.currentTimeMillis()) + ", "
        + grp03_MessageToolBox.timeOfDayFormatted(System.currentTimeMillis()) + ") and post time ("
        + grp03_MessageToolBox.dayName(postTime) + ", " + grp03_MessageToolBox.timeOfDayFormatted(postTime) + "): "
        + grp03_MessageToolBox.ageOfPost(postTime) + " days");

    // !TESTING: centre method
    String msg = "testing test";
    int width = 40;
    System.out.println(grp03_MessageToolBox.centre(msg, width));

    // !TESTING: display function
    String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    int testWidth = 9999;
    grp03_MessageToolBox.display(testString, testWidth);

    /*
     * // initialise timeNow to the current time on the system clock
     * long timeNow = System.currentTimeMillis();
     * // Display the formatted time
     * System.out.println("Posted at " +
     * grp03_MessageToolBox.timeOfDayFormatted(timeNow));
     * 
     * String currentTime = grp03_MessageToolBox.dayName(timeNow);
     * 
     * System.out.println(currentTime);
     * 
     * String COPon = "#COP27 Unite Behind The Science @ThePlanet";
     * System.out.println(grp03_MessageToolBox.centre(COPon, 55));
     * 
     * System.out.println(grp03_MessageToolBox.centre("", 55));
     * 
     * System.out.println(grp03_MessageToolBox.centre("World Cup 2022", -22));
     * 
     * final long MILLISECONDS_IN_A_DAY = 24 * 60 * 60 * 1000;
     * int i = 0;
     * for (i = 1; i < 10; i++) {
     * // set the value of postTime to the system time
     * // adjusted by ‘i' days earlier
     * long adjustment = i * MILLISECONDS_IN_A_DAY;
     * long postTime = System.currentTimeMillis() - adjustment;
     * int postAge = grp03_MessageToolBox.ageOfPost(postTime);
     * 
     * System.out.printf("Age of post is %2d\n", postAge);
     * }
     * grp03_MessageToolBox.display("Edsger Dijkstra", 4);
     * 
     * String aMessage = "Bono saves but not in Ireland";
     * grp03_MessageToolBox.display(aMessage, 6);
     * 
     * String anotherPost = "";
     * grp03_MessageToolBox.display(anotherPost, 25);
     * 
     * String munsterRugby = "Munster 12 The All Blacks 0";
     * grp03_MessageToolBox.display(munsterRugby, 1978);
     */
  }
}