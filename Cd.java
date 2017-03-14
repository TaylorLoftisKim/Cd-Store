class Cd {
  public String mBand;
  public String mAlbum;
  public int mRDate;
  public int mPrice;

  public Cd(String band, String album, int rDate, int price) {
    mBand = band;
    mAlbum = album;
    mRDate = rDate;
    mPrice = price;
  }

  public String displayProp(Cd cd) {
    System.out.println( "----------------------" );
    System.out.println("Band: " + cd.mBand);
    System.out.println("Album: " + cd.mAlbum);
    System.out.println("Release Date: " + cd.mRDate);
    System.out.println("Price: " + cd.mPrice);

    return ("");
  }

}
