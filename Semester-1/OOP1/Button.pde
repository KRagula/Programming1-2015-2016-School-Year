// Class Name
class Button {
  //Class or Member Variables
  boolean button;
  int x, y, w, h;

  //Class Constructor
  Button(int tempX, int tempY, int tempW, int tempH) {
    x = tempX;
    y = tempY;
    w = tempW;
    h = tempH;
    button = false;
  }

  //Class Attributes
  void display() {
    if (button) {
      fill(0);
      text("Button ON: " + str(button), x, y);
      fill(0, 255, 255);
      rect(x, y, w, h);
    } else if (!button) {
      fill(0);
      text("Button ON: " + str(button), x, y);
      fill(255, 0, 255);
      rect(x, y, w, h);
    }
  }

  //Class Behavior
  void clickButton() {
    if (mouseX>x && mouseX<x+w && mouseY>y && mouseY<y+h) {
      button = !button;
    }
  }
}