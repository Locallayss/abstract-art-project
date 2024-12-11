import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

  private VideoGames[] vidGames;      // 1D array of Person objects

  /** Constructor */
  public DataScene() {
    vidGames = createVidGames();
  }

  /** Returns a 1D array of VideoGames objects using the txt files in this project */
  public VideoGames[] createVidGames() {
    String[] titleArray = FileReader.toStringArray("title.txt");
    String[] developerArray = FileReader.toStringArray("developer.txt");
    int[] salesArray = FileReader.toIntArray("sales.txt");
    
    VideoGames[] vidGameArray = new VideoGames[titleArray.length];
    for (int i = 0; i < vidGameArray.length; i++) {
      vidGameArray[i] = new VideoGames(titleArray[i], salesArray[i], developerArray[i]);
    }

    return vidGameArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {
    for(VideoGames v : vidGames) {
    
    clear("pink");

      if(v.getSales() <= 30000000) {
        clear("purple");
  drawText("This game made a lot of money!", 50, 300);
} else if(v.getSales() <= 27500000) {
        clear("blue");
  drawText("This game made not a lot of money:(", 50, 300);
}
    
    drawImage("Vanilla-PMP_Collection-Carousel-0_Buzzy-Bees_1280x768.jpg", 100, 50, 200);
    
setTextStyle(Font.MONO, FontStyle.BOLD);
    setTextHeight(25);
    setTextColor("white");
      
    drawText(v.getTitle(), 100, 200);
    drawText(""+v.getDeveloper(), 100, 240);

    pause(0.5);
    }
  }

  /** Other Methods */
  
}