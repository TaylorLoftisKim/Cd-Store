import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Cd radiohead = new Cd("Radiohead", "Hail to the Thief", 2003, 13);
    Cd metalica = new Cd("Metalica", "Enter Sandman", 1991, 10);

    List <Cd> allCds = new ArrayList<Cd>();
    allCds.add(radiohead);
    allCds.add(metalica);
    System.out.println("Welcome to our CD Shop! What would you like to do?");

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("Enter one of the following options:" + "\n" + "All Cds, Search Price, Add Cd, Exit");

      System navigationChoice = myConsole.readLine();
      if (navigationChoice.equals("All Cds")) {
        for ( Cd individualCd : allCds ) {
          System.out.println("Band: " + individualCd.mBand);
          System.out.println("Album: " + individualCd.mAlbum);
          System.out.println("Release Date: " + individualCd.mRDate);
          System.out.println("Price: " + individualCd.mPrice);
        }
      }
      // else if (navigationChoice.equals("Searchprice"))
    }
  }
}
