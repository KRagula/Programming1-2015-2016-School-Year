//Kanishka Ragula
//Grid
void setup() {
  size(1000, 1000);
  background(128);
}

void draw() {
  background(128);
  drawGrid();
}

void drawGrid() {
  for (int i=0; i<width; i+=100) {
    line(0, i, width, i);//horizontal
    line(i, 0, i, height);//vertical
    text(i, i-8, 10); //vertical line text
    text(i, 2, i+5); //horizontal line text
  }
}

