// Create an Instance of Button
Button btn1 = new Button(90, 70, 100, 160);
Button btn2 = new Button(230, 90, 160, 100);
Button btn3 = new Button(400, 90, 200, 190);


void setup() {
  size(600, 600);
}

void draw() {
  background(255);
  btn1.display();
  btn2.display();
  btn3.display();
}

void mousePressed() {
  btn1.clickButton();
  btn2.clickButton();
  btn3.clickButton();
}