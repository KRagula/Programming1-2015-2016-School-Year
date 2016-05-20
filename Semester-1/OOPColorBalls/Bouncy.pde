class Bouncy {
  float xpos, ypos, xSize, ySize, xSpeed, ySpeed;
  color circle;
  Bouncy(float xpos, float ypos) {
    this.xpos = xpos;
    this.ypos = ypos;
    xSize = random(5,10);
    ySize = xSize;
    xSpeed = random(5, 10);
    ySpeed = random(5, 10);
    circle = color(random(100,255), random(100,255), random(0,255));
  }
  
  void display() {
    fill(circle);
    ellipse(xpos, ypos, xSize, ySize);
    
  }
  void drive() {
    xpos += xSpeed;
    ypos += ySpeed;
    if (xpos >= width || xpos <= 0){
    xSpeed *= -1;
  }
  if (ypos >= height || ypos <= 0){
  ySpeed = ySpeed *-1;
  }
  }
  
  
  
  
  
  
  
  
}