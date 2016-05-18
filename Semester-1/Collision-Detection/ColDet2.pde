//Kanishka Ragula
//Collision Detection

//Setup runs once
int xspeed, yspeed;
int xpos, ypos, wdth, ht;
void setup() {
  size(displayWidth, displayHeight);
  //change the size above from size(400, 400); to size(displayWidth, displayHeight) to make program fullscreen.
  background(0);
  xspeed = 0;
  //reduce xspeed to 0 to make the ball go vertically
  yspeed = 10;
  wdth = 20;
  ht = 20;
  //double wdth and ht to double size of ball
  noStroke();
  xpos = width/2;
  ypos = height/2;
  frameRate(30);
  //Reduce from 60 to 30 to slow speed to half
}

// Draw is a loop
void draw() {
  //background(0);
  //remove // before background to hide path of ball or add // to show the ball path
  //change 255 to 0 to invert background and set fill to 255 to invert color of ball
  fill(255);
  ellipse(xpos, ypos, wdth, ht);
  ellipse(xpos+50, ypos, wdth, ht);
  //this extra ellipse adds a second ball
  xpos += xspeed;
  ypos += yspeed;
  if (xpos >= width-wdth/2 || xpos <= wdth/2) {
    xspeed *= -1;
  }
  if (ypos >= height-ht/2 || ypos <= ht/2) {
    yspeed = yspeed *-1;
  }
}
//The formatting error in Mr. Kapptie's code is the second if is tabbed over one to many times.
