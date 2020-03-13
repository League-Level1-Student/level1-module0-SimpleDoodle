PImage pictureOfRecord;
int s = 10;
  import ddf.minim.*;
  Minim minim;
  AudioPlayer song;
void setup (){
  size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
        pictureOfRecord.resize(600,600);
        minim = new Minim(this);
        song = minim.loadFile("awesomeTrack.mp3", 512);
}
void draw(){
  background(255,255,255);
  image(pictureOfRecord, 1, 1);
    rotateImage(pictureOfRecord, s);
  image(pictureOfRecord, 1, 1);
  if(mousePressed){
  s+=5;
  song.play();
  }
  else{
   song.pause();
   song.rewind();
  }
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
