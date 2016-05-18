//Kanishka Ragula
//Random Ball
void setup () {
  size(600,600);
  background(255);
}

void draw() {
  //background(255);
  fill(random(150,255),random(20,50),random(20,50));
  ellipse(mouseX,mouseY,random(20,200),random(20,200));
  noStroke();
  frameRate(10);
}

