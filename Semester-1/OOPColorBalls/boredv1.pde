int xpos, ypos;
Bouncy[] balls = new Bouncy[50];
void setup() {
  size(600,600);
  rectMode(CENTER);
  for(int i = 0; i < balls.length; i++) {
   balls[i] = new Bouncy(random(width), random(height)); 
  }
}

void draw() {
  background(0);
  for(int i = 0; i<balls.length; i++) {
    balls[i].display();
    balls[i].drive();
  }
  println(frameRate);
}