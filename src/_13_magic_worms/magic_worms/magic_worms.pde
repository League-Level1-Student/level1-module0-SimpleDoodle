void setup() {
  size(1000, 1000);
 
}
void draw() {
    float r = random(255);
  float u = random(255);
  float h = random(255);
 background(r, u, h);
makeMagical();

   for (int i=0; i<=1000; i++) {
  int n = (int)random(1000);
  int o = (int)random(1000);
  float d = random(0);
  float e = random(0);
  float f = random(0);
    ellipse(getWormX(n), getWormY(o), 15, 15);
    fill(d, e, f);

  }
   for (int i=0; i<=1000; i++) {
  int p = (int)random(1000);
  int q = (int)random(1000);
    ellipse(getWormX(p), getWormY(q), 15, 15);
    fill(255, 255, 255);

  }
    for (int i=0; i<=1000; i++) {
  int x = (int)random(1000);
  int y = (int)random(1000);
  float a = random(255);
  float b = random(255);
  float c = random(255);
    ellipse(getWormX(x), getWormY(y), 15, 15);
    fill(a, b, c);

  }
}
  float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
