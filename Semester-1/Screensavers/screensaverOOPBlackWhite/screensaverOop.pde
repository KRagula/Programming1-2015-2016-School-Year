
Lines[] myLines = new Lines [100];
void setup() {
  frameRate(1000);
  size(displayWidth, displayHeight);
  background(random(200, 255));
  for (int i = 0; i<myLines.length; i++) {
    myLines[i] = new Lines(random(width), random(height), random(1, 5), random(1, 20));
  }
}

void draw() {
  if (frameCount == 500) {
    frameCount = 0;
    background(random(200, 255));
  } else {
    for (int i = 0; i<myLines.length; i++) {
      myLines[i].display();
    }
  }
  println(frameRate);
}