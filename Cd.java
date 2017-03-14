import java.text.DecimalFormat;

class Cd {
  public String mBand;
  public String mAlbum;
  public int mRDate;
  public double mPrice;

  public Cd(String band, String album, int rDate, double price) {
    mBand = band;
    mAlbum = album;
    mRDate = rDate;
    mPrice = price;
  }

  public String displayProp(Cd cd) {
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println( "----------------------" );
    System.out.println("Band: " + cd.mBand);
    System.out.println("Album: " + cd.mAlbum);
    System.out.println("Release Date: " + cd.mRDate);
    System.out.println("Price: " + df.format(cd.mPrice));

    return ("");
  }

}
