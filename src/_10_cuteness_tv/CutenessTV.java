package _10_cuteness_tv;

import java.net.URI;

public class CutenessTV {
public void start() {
	
	
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showNothingSuspicious() {
    playVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
