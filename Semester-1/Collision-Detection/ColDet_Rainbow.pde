//Kanishka Ragula
//Collision Detection

//Declaring Global Variables
int xspeed, yspeed;
int xspeed1, yspeed1;
int xpos1, ypos1, wdth1, ht1;
int xpos, ypos, wdth, ht;
//This saves memory for the variables and declares they exist
void setup() {
  size(1920,1080);
  //Size of the Program in Pixels
  background(255,255,255);
  //Color of Background
  xspeed = 3;
  yspeed = 10;
  wdth = 40;
  ht = 40;
  xspeed1 = -3;
  yspeed1 = -10;
  wdth1 = 40;
  ht1 = 40;
  //These give values to the variables
  noStroke();
  xpos = width/2;
  ypos = height/2;
  xpos1 = width/2;
  ypos1 = height/2;
  frameRate(240);
  //This sets the frame rate
}

// Draw is a loop
void draw() {
  //background(255);
  fill(xpos, ypos, xpos1);
  ellipse(xpos, ypos, wdth, ht);
  xpos += xspeed;
  ypos += yspeed;
  if (xpos >= width-wdth/2 || xpos <= wdth/2){
    xspeed *= -1;
  }
  if (ypos >= height-ht/2 || ypos <= ht/2){
  yspeed = yspeed *-1;
  }
  ellipse(xpos1,ypos1, wdth1, ht1);
  xpos1 += xspeed1;
  ypos1 += yspeed1;
  if (xpos1 >= width-wdth1/2 || xpos1 <= wdth1/2){
    xspeed1 *= -1;
  }
  if (ypos >= height-ht1/2 || ypos1 <= ht1/2){
  yspeed1 = yspeed1 *-1;
  }
  println(frameCount);
}
