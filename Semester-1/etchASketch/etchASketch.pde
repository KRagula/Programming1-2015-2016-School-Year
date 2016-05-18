int x, y;

void setup() {
  size(400, 400);
  x = 0;
  y = 0;
  frameRate(120);
}

void draw() {
  strokeWeight(2);
}

//moveRight tells the program how many times it has to 
//move right 1 points
void moveRight(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x+i, y);
  }
  x=x+(1*rep);
}

void moveLeft(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x-i, y);
  }
  x=x-(1*rep);
}

void moveDown(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x, y+i);
  }
  y=y+(1*rep);
}
void moveUp(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x, y-i);
  }
  y=y-(1*rep);
}

void moveUpLeft(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x-i, y-i);
  }
  x=x-(1*rep);
  y=y-(1*rep);
}

void moveDownLeft(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x-i, y+i);
  }
  x=x-(1*rep);
  y=y+(1*rep);
}

void moveUpRight(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x+i, y-i);
  }
  x=x+(1*rep);
  y=y-(1*rep);
}

void moveDownRight(int rep) {
  for (int i=0; i<rep*1; i++) {
    point(x+i, y+i);
  }
  x=x+(1*rep);
  y=y+(1*rep);
}

void keyPressed() {
  if(key == CODED) {
    if(keyCode == RIGHT) {
      if(x>=width) {
        x=width;
      } 
      moveRight(1);
    } else if(keyCode == DOWN) {
      if(y>=height) {
        y=height;
      }
      moveDown(1);
    } else if(keyCode == UP) {
      if(y<=0) {
        y=height;
      }
      moveUp(1);
    } else if(keyCode == LEFT) {
      if(x<=0) {
        x=0;
      }
      moveLeft(1);
    }
  }
}

