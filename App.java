import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    int tenPercentCoupon = 123;
    int twentyPercentCoupon = 234;
    int thirtyPercentCoupon = 345;

    Cd radiohead = new Cd("Radiohead", "Hail to the Thief", 2003, 13);
    Cd metalica = new Cd("Metalica", "Enter Sandman", 1991, 10);

    List <Cd> allCds = new ArrayList<Cd>();
    allCds.add(radiohead);
    allCds.add(metalica);
    System.out.println("Welcome to our CD Shop! What would you like to do?");

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("Enter one of the following options:" + "\n" + "All Cds, Apply Coupon, Add your own CD, Search by Release Date, Search by Price Range, Search by Band, Exit");

      String navigationChoice = myConsole.readLine();

      if (navigationChoice.equals("All Cds")) {
        for (Cd individualCd : allCds) {
          individualCd.displayProp(individualCd);
        }
      } else if (navigationChoice.equals("Apply Coupon")) {
        System.out.println("Please enter your coupon code.");
        int myCouponCode = Integer.parseInt(myConsole.readLine());

        if (myCouponCode == tenPercentCoupon) {
          for (Cd individualCd : allCds) {
            individualCd.mPrice = (individualCd.mPrice * .9);
            individualCd.displayProp(individualCd);
          }
        } else if (myCouponCode == twentyPercentCoupon) {
          for (Cd individualCd : allCds) {
            individualCd.mPrice = (individualCd.mPrice * .8);
            individualCd.displayProp(individualCd);
          }
        } else if (myCouponCode == thirtyPercentCoupon) {
          for (Cd individualCd : allCds) {
            individualCd.mPrice = (individualCd.mPrice * .7);
            individualCd.displayProp(individualCd);
          }
        }
      } else if (navigationChoice.equals("Add your own CD"))  {
        System.out.println("What is the name of the band?");
        String myBandName = myConsole.readLine();

        System.out.println("What is the name of the album?");
        String myAlbumName = myConsole.readLine();

        System.out.println("What year did the album come out?");
        int myReleaseDate = Integer.parseInt(myConsole.readLine());

        System.out.println("What price would you like to sell it for?");
        double myPrice = Double.parseDouble(myConsole.readLine());

        Cd userCd = new Cd(myBandName, myAlbumName, myReleaseDate, myPrice);
        allCds.add(userCd);

        System.out.println("Here is your new CD!");

        userCd.displayProp(userCd);

      } else if (navigationChoice.equals("Search by Release Date")) {
        System.out.println("What release date would like to search for?");
        int searchDate = Integer.parseInt(myConsole.readLine());

        for (Cd individualCd : allCds) {
          if (individualCd.mRDate == searchDate) {
            individualCd.displayProp(individualCd);
          }
        }

      } else if (navigationChoice.equals("Search by Price Range")) {
        System.out.println("What is your min price?");
        double minPrice = Double.parseDouble(myConsole.readLine());

        System.out.println("What is your max price?");
        double maxPrice = Double.parseDouble(myConsole.readLine());

        for (Cd individualCd : allCds) {
          if (minPrice <= individualCd.mPrice && individualCd.mPrice <= maxPrice) {
            individualCd.displayProp(individualCd);
          }
        }

      } else if (navigationChoice.equals("Search by Band")) {
        System.out.println("What band would you like to search for?");
        String searchBand = myConsole.readLine();

        for (Cd individualCd : allCds) {
          if (individualCd.mBand.equals(searchBand)) {
            individualCd.displayProp(individualCd);
          }
        }

      } else if (navigationChoice.equals("Exit")) {
        programRunning = false;
      }
    }
  }
}
