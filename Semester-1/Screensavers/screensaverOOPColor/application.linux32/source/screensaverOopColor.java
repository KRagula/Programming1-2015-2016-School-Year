import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class screensaverOopColor extends PApplet {


Lines[] myLines = new Lines [100];
public void setup() {
  frameRate(30);
  
  background(random(100, 255));
  for (int i = 0; i<myLines.length; i++) {
    myLines[i] = new Lines(random(width), random(height), random(1, 5), random(1, 20));
  }
}

public void draw() {
  if (frameCount == 300) {
    frameCount = 0;
    background(random(200, 255));
  } else {
    for (int i = 0; i<myLines.length; i++) {
      myLines[i].display();
    }
  }
  println(frameRate);
}
//Class Name
class Lines {
  //Member Variables
  float xpos, ypos, strokeW, lineLength;

  //Class Constructor
  Lines(float tempX, float tempY, float tempStroke, float tempLength) {
    xpos = tempX;
    ypos = tempY;
    strokeW = tempStroke;
    lineLength = tempLength;
  }
  //Visibility Method
  public void display() {
    strokeW = random(3, 5);
    lineLength = random(1, 11);
    //stroke(random(100,255);
    stroke(random(50, 255), random(50,255), random(50,255));
    if (xpos > width || xpos < 0 || ypos > height || ypos < 0) {
      xpos = random(width);
      ypos = random(height);
    } else {
      if (random(100)>70) {
        strokeWeight(strokeW);
        moveLeft(xpos, ypos, lineLength);
      } else if (random(100)>65) {
        strokeWeight(strokeW);
        moveUp(xpos, ypos, lineLength);
      } else if (random(100)>55) {
        strokeWeight(strokeW);
        moveRight(xpos, ypos, lineLength);
      } else {
        strokeWeight(strokeW);
        moveDown(xpos, ypos, lineLength);
//      } else if (random(100)>75) {
//        strokeWeight(strokeW);
//        leftUp(xpos, ypos, lineLength);
//      } else if (random(100)>75) {
//        strokeWeight(strokeW);
//        leftDown(xpos, ypos, lineLength);
//      } else if (random(100)>75) {
//        strokeWeight(strokeW);
//        rightUp(xpos, ypos, lineLength);
//      } else {
//        strokeWeight(strokeW);
//        rightDown(xpos, ypos, lineLength);
//      }
//    }
  }
}
}
  //Class Behavior
  public void moveRight(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX+i, startY);
      xpos = startX+10;
    }
  }

  public void moveLeft(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX-i, startY);
      xpos = startX-10;
    }
  }

  public void moveUp(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX, startY-i);
      ypos = startY-10;
    }
  }

  public void moveDown(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX, startY+i);
      ypos = startY+10;
    }
  }

  //void leftUp (float startX, float startY, float moveCount) {
  //  for (float i=0; i<moveCount; i++) {
  //    point(startX-i, startY-i);
  //    ypos = startY-10;
  //    xpos = startX-10;
  //  }
  //}
  //void rightUp (float startX, float startY, float moveCount) {
  //  for (float i=0; i<moveCount; i++) {
  //    point(startX+i, startY-i);
  //    ypos = startY-10;
  //    xpos = startX+10;
  //  }
  //}
  //void leftDown (float startX, float startY, float moveCount) {
  //  for (float i=0; i<moveCount; i++) {
  //    point(startX-i, startY+i);
  //    ypos = startY+10;
  //    xpos = startX-10;
  //  }
  //}
  //void rightDown (float startX, float startY, float moveCount) {
  //  for (float i=0; i<moveCount; i++) {
  //    point(startX+i, startY+i);
  //    ypos = startY+10;
  //    xpos = startX+10;
  //  }
  //}
}
  public void settings() {  size(displayWidth, displayHeight); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "screensaverOopColor" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
