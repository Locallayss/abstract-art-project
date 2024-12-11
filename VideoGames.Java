/**
 * Represents a Video game with the title, sales, and developer
 */
public class VideoGames {

  private String title;     // title of game
  private int sales;         // number of sales
    private String developer;         // name of developer

  /** Constructor */
  public VideoGames(String title, int sales, String developer) {
    this.title = title;
    this.sales = sales;
    this.developer = developer;
  }

  /** Accessor Method for title */
  public String getTitle() {
    return title;
  }
  
  /** Accessor Method for sales */
  public int getSales() {
    return sales;
  }

    
  /** Accessor Method for developer */
  public String getDeveloper() {
    return developer;
  }
  
  /** toString Method override */
  public String toString() {
    return title + " (" + developer + ")";
  }
  
}