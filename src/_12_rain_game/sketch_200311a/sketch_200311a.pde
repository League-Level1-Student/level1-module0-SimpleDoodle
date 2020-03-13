int y = 10;
int randomNumber = (int) random(width);
int score = 0;
void checkCatch(int x) {
}
void setup () {
  size(500, 500);
}


void draw () {
  background(100, 110, 60);
  fill(90, 125, 50);
  ellipse(randomNumber, y, 20, 20);

  y+=4;
  if (y==490) {
    y = 10; 
    randomNumber = (int) random(width);
  }
  if (randomNumber > mouseX && randomNumber < mouseX+100 && y > 400 && y < 405){
    score++;
  }
   if ((randomNumber < mouseX || randomNumber > mouseX + 101) && y > 405 && y < 410){
    score--;
     println("heehoo");
  }
  println("Your score is now: " + score);



  rect(mouseX+10, 400, 70, 120);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
