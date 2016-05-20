class CalcButton { //<>// //<>// //<>// //<>//
  //Class Variables
  boolean isNum=false, isSp=false, isOp=false, isClear = false, overBox, isMem = false;
  float numButVal, xpos, ypos, disX, disY, timer;
  String opVal, spVal;
  int bSize, w, h, circD;

  //Constructor for buttons
  CalcButton(float xpos, float ypos) {
    this.xpos=xpos;
    this.ypos = ypos;
  }
  //Constructor for number buttons
  CalcButton asNumber(float numButVal, int w, int h) {
    isNum = true;
    this.w=w;
    this.h=h;
    this.numButVal = numButVal;
    overBox = false;
    return this;
  }
  //Constructor for operation buttons
  CalcButton isOp(String opVal, int w, int h, boolean isClear) {
    isOp = true;
    this.w=w;
    this.h=h;
    this.opVal = opVal;
    this.isClear = isClear;
    overBox = false;
    return this;
  }
  CalcButton isSp(String spVal, int w, int h, boolean isMem) {
    isSp = true;
    this.w = w;
    this.h = h;
    this.spVal = spVal;
    this.isMem = isMem;
    overBox = false;
    return this;
  }
  //Draw the button on the canvas
  void display() {
    if (isNum) {
      fill(#F8CECC);
      stroke(190, 97, 94);
      strokeWeight(2);
      ellipse(xpos, ypos, w, h);
      fill(0);
      textSize(24);
      text(int(numButVal), xpos-7, ypos+7);
      if (overBox) {
        fill(190, 97, 94);
        stroke(#F8CECC);
        ellipse(xpos, ypos, w, h);
        timer=millis();
        text(int(numButVal), xpos-7, ypos+7);
        if (timer>100) {
          overBox = false;
        }
      }
    } else if (isSp) {
      if (isMem) {
        fill(#DAE8FC);
        stroke(#431AFF);
      } else {
        fill(#F8CECC);
        stroke(190, 97, 94);
      }
      strokeWeight(2);
      if (isMem) {
        rect(xpos, ypos, w, h, 10);
        fill(0);
        textSize(18);
        text(spVal, xpos+5, ypos+30);
      } else {
        ellipse(xpos, ypos, w, h);
        fill(0);
        textSize(24);
        text(spVal, xpos-3, ypos+7);
      }
      if (isMem == false) {
        if (overBox) {
          fill(190, 97, 94);
          stroke(#F8CECC);
          ellipse(xpos, ypos, w, h);
          timer=millis();
          text(int(numButVal), xpos-7, ypos+7);
          if (timer>100) {
            overBox = false;
          }
        }
      }
    } else if (isOp) {
      if (isClear) {
        fill(#FFCD28);
      } else {
        fill(#8C6C9C);
      }

      stroke(0);
      strokeWeight(2);
      rect(xpos, ypos, w, h, 10);
      fill(0);
      textSize(24);
      if (isClear) {
        text(opVal, xpos+5, ypos+35);
      } else {
        text(opVal, xpos+7, ypos+35);
      }
      if (isMem == false) {
        if (overBox) {
          fill(#E1D5E7);
          stroke(255);
          rect(xpos, ypos, w, h, 10);
          timer=millis();
          if (timer>100) {
            overBox = false;
          }
        }
      }
    }
  }
  //Handle mouse actions
  void clickButton(int xMouse, int yMouse) {
    if (isOp) {
      overBox = xMouse > xpos && xMouse < xpos+w && yMouse > ypos && yMouse <ypos+h;
    } else if (isNum) {
      float disX = xpos-xMouse;
      float disY = ypos-yMouse;
      if (xMouse>xpos-w/2 && xMouse<xpos+w/2&&yMouse>ypos-h/2&&yMouse<ypos+h/2) {
        if (sqrt(sq(disX) + sq(disY)) < w/2) {
          overBox = true;
        } else {
          overBox = false;
        }
      }
    } else if (isSp) {
      if (isMem) {
        overBox = xMouse > xpos && xMouse < xpos+w && yMouse > ypos && yMouse <ypos+h;
      } else {
        float disX = xpos-xMouse;
        float disY = ypos-yMouse;
        if (xMouse>xpos-w/2 && xMouse<xpos+w/2&&yMouse>ypos-h/2&&yMouse<ypos+h/2) {
          if (sqrt(sq(disX) + sq(disY)) < w/2) {
            overBox = true;
          } else {
            overBox = false;
          }
        }
      }
    }
  }

  void hoverButton(int xMouse, int yMouse) {
    if (isOp) {
      if (xMouse > xpos && xMouse < xpos+w && yMouse > ypos && yMouse <ypos+h) {
        if (isClear) {
          fill(#FFA500);
        } else {
          fill(#E1D5E7);
        }
        stroke(0);
        strokeWeight(2);
        rect(xpos, ypos, w, h, 10);
        fill(0);
        textSize(24);
        if (isClear) {
          text(opVal, xpos+5, ypos+35);
        } else {
          text(opVal, xpos+7, ypos+35);
        }
      }
    } else if (isNum) {
      float disX = xpos-xMouse;
      float disY = ypos-yMouse;
      if (xMouse>xpos-w/2 && xMouse<xpos+w/2&&yMouse>ypos-h/2&&yMouse<ypos+h/2) {
        if (sqrt(sq(disX) + sq(disY)) < w/2) {
          fill(#EA6B66);
          ellipse(xpos, ypos, w, h);
          fill(0);
          textSize(24);
          text(int(numButVal), xpos-7, ypos+7);
        }
      }
    } else if (isSp) {
      if (isMem) {
        if (xMouse>xpos && xMouse<xpos+w&&yMouse>ypos&&yMouse<ypos+h) {
          fill(#7EA6E0);
          stroke(#431AFF);
          rect(xpos, ypos, w, h, 10);
          fill(0);
          textSize(18);
          text(spVal, xpos+5, ypos+30);
        }
      } else {
        float disX = xpos-xMouse;
        float disY = ypos-yMouse;
        if (xMouse>xpos-w/2 && xMouse<xpos+w/2&&yMouse>ypos-h/2&&yMouse<ypos+h/2) {
          if (sqrt(sq(disX) + sq(disY)) < w/2) {
            fill(#EA6B66);
            ellipse(xpos, ypos, w, h);
            fill(0);
            textSize(24);
            text(spVal, xpos-3, ypos+7);
          }
        }
      }
    }
  }
}