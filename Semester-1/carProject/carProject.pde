//Kanishka Ragula
//Car Assignment Intro To Object
Car[] cars;
int index;
void setup() {
  size(600, 600);
  index = height/6;
  cars = new Car[index];
  for (int i = 1; i < index; i++) {
    cars[i] = new Car(220, 6*i);
  }
}

void draw() {
  background(66,66,66);
  for (int i = 1; i < index; i++){
    strokeWeight(2);
    stroke(187,178,15);
    line(0, i*6, width, i*6);
    strokeWeight(1);
  }
  for (int i = 1; i < index; i++) {
    cars[i].display();
    cars[i].drive();
  }
}