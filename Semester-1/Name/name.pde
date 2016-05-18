int x, y;

void setup() {
  size(400, 400);
  frameRate(10);
  x = 0;
  y = 0;
}

void draw() {
  fill (255);
  drawName();
  noLoop();
}

void drawName() {
  moveRight(1);
  moveDown(8);
  moveUp(4);
  moveUpRight(4);
  moveDownLeft(4);
  moveDownRight(4);
  moveRight(2);
  moveUp(5);
  moveUpRight(1);
  moveDownRight(1);
  moveDown(3);
  moveLeft(2);
  moveRight(2);
  moveDown(2);
  moveRight(1);
  moveUp(6);
  moveDownRight(6);
  moveUp(6);
  moveRight(5);
  moveLeft(2);
  moveDown(6);
  moveLeft(2);
  moveRight(8);
  moveUp(3);
  moveLeft(3);
  moveUp(3);
  moveRight(5);
  
}
//moveRight tells the program how many times it has to 
//move right 10 points
void moveRight(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x+i, y);
  }
  x=x+(10*rep);
}

void moveLeft(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x-i, y);
  }
  x=x-(10*rep);
}

void moveDown(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x, y+i);
  }
  y=y+(10*rep);
}
void moveUp(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x, y-i);
  }
  y=y-(10*rep);
}

void moveUpLeft(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x-i, y-i);
  }
  x=x-(10*rep);
  y=y-(10*rep);
}

void moveDownLeft(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x-i, y+i);
  }
  x=x-(10*rep);
  y=y+(10*rep);
}

void moveUpRight(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x+i, y-i);
  }
  x=x+(10*rep);
  y=y-(10*rep);
}

void moveDownRight(int rep) {
  for (int i=0; i<rep*10; i++) {
    point(x+i, y+i);
  }
  x=x+(10*rep);
  y=y+(10*rep);
}

