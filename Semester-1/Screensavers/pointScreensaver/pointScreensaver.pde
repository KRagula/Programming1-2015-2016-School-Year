float xpos, ypos, strokeW, moveCount;

void setup() {
  size(500, 500);
  background(random(100, 255));
  xpos = width/2;
  ypos = height/2;
}

void draw() {
  strokeW = random(1, 10);
  moveCount = random(1, 20);
  stroke(random(0, 255), random(0, 255), random(0, 255));
  if (xpos > width || xpos < 0 || ypos > height || ypos < 0) {
    xpos = random(width);
    ypos = random(height);
  }
  if (random(100)>70) {
    strokeWeight(strokeW);
    moveLeft(xpos, ypos, moveCount);
  } else if (random(100)>65) {
    strokeWeight(strokeW);
    moveUp(xpos, ypos, moveCount);
  } else if (random(100)>55) {
    strokeWeight(strokeW);
    moveRight(xpos, ypos, moveCount);
  } else {
    strokeWeight(strokeW);
    moveDown(xpos, ypos, moveCount);
  }
}


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