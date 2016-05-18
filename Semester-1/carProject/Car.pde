//Class Name
class Car {
  //Member Variables
  color c;
  float xpos;
  float ypos;
  float xspeed;
  float direction;
  float carWidth;
  float carHeight;
  float tireSize;

  //Class Constructor
  Car(float tempXpos, float tempYpos) {
    c = color(random(20, 255), random(20, 255), random(20, 255));
    xpos = tempXpos;
    ypos = tempYpos;
    direction = random(0, 3);
    xspeed = random(1, 6);
    carWidth = random(20, 30);
    carHeight = random(10, 15);
    if (direction>1) {
      xspeed = xspeed*-1;
    }
    tireSize = random(5, 9);
  }
  //Visibility Method
  void display() {
    rectMode(CENTER);
    fill(c);
    stroke(1);
    //Antennae
    line(xpos+14, ypos+3, xpos+14, ypos-12);
    //Car Body
    noStroke();
    rect(xpos, ypos, carWidth, carHeight);
    //Roof
    quad(xpos-carWidth/2, ypos-carHeight/2, xpos-carWidth/4, ypos-carHeight, xpos+carWidth/4, ypos-carHeight, xpos+carWidth/2, ypos-carHeight/2);
    //Bumpers
    quad(xpos+10, ypos-5, xpos+17, ypos-3, xpos+19, ypos+5, xpos+10, ypos+5);
    quad(xpos-10, ypos-5, xpos-17, ypos-3, xpos-19, ypos+5, xpos-10, ypos+5);
    stroke(1);
    //Windows
    fill(0);
    quad(xpos-carWidth/2+2, ypos-carHeight/2, xpos-carWidth/4, ypos-carHeight+2, xpos+carWidth/4, ypos-carHeight+2, xpos+carWidth/2-2, ypos-carHeight/2);
    fill(c);
    //Doors
    rect(xpos, ypos-2, carWidth-2, 8);
    line(xpos, ypos-carHeight+2, xpos, ypos+2);
    fill(0);
    //Tires
    ellipse(xpos-13, ypos+5, tireSize, tireSize);
    ellipse(xpos+13, ypos+5, tireSize, tireSize);
    //Headlights
    if (xspeed <0) {
      noStroke();
      fill(255, 255, 0);
      rect(xpos-carWidth/2-2, ypos-2, 3, 3);
    } else {
      noStroke();
      fill(255, 255, 0);
      rect(xpos+carWidth/2+2, ypos-2, 3, 3);
    }
  }
  //Behavior Method
  void drive() {
    xpos=xpos+xspeed;
    if (xpos > width) {
      xpos = 0;
    } else if (xpos<0) {
      xpos = width;
    }
  }
}