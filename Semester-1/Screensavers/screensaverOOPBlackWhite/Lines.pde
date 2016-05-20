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
  void display() {
    strokeW = random(1, 5);
    lineLength = random(1, 15);
    //stroke(random(100,255);
    stroke(random(50, 150));
    if (xpos > width || xpos < 0 || ypos > height || ypos < 0) {
      xpos = random(width);
      ypos = random(height);
    } else {
      if (random(100)>80) {
        strokeWeight(strokeW);
        moveLeft(xpos, ypos, lineLength);
      } else if (random(100)>75) {
        strokeWeight(strokeW);
        moveUp(xpos, ypos, lineLength);
      } else if (random(100)>70) {
        strokeWeight(strokeW);
        moveRight(xpos, ypos, lineLength);
      } else if (random(100)>65) {
        strokeWeight(strokeW);
        moveDown(xpos, ypos, lineLength);
      } else if (random(100)>60) {
        strokeWeight(strokeW);
        leftUp(xpos, ypos, lineLength);
      } else if (random(100)>55) {
        strokeWeight(strokeW);
        leftDown(xpos, ypos, lineLength);
      } else if (random(100)>50) {
        strokeWeight(strokeW);
        rightUp(xpos, ypos, lineLength);
      } else {
        strokeWeight(strokeW);
        rightDown(xpos, ypos, lineLength);
      }
    }
  }
  //Class Behavior
  void moveRight(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX+i, startY);
      xpos = startX+i;
    }
  }

  void moveLeft(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX-i, startY);
      xpos = startX-i;
    }
  }

  void moveUp(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX, startY-i);
      ypos = startY-i;
    }
  }

  void moveDown(float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX, startY+i);
      ypos = startY+i;
    }
  }

  void leftUp (float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX-i, startY-i);
      ypos = startY-i;
      xpos = startX-i;
    }
  }
  void rightUp (float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX+i, startY-i);
      ypos = startY-i;
      xpos = startX+i;
    }
  }
  void leftDown (float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX-i, startY+i);
      ypos = startY+i;
      xpos = startX-i;
    }
  }
  void rightDown (float startX, float startY, float moveCount) {
    for (float i=0; i<moveCount; i++) {
      point(startX+i, startY+i);
      ypos = startY+i;
      xpos = startX+i;
    }
  }
}