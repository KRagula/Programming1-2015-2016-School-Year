void setup() {
  size(400,400);
  background(255);
  frameRate(2);
 
}
void draw() {
  background(255);
  strokeWeight(1);
   fill(0);
  rect(100,0,200,200,175,100,60,97);
  fill(203,197,166);
  ellipse(300,200,random(70,80),random(90,110));
  ellipse(100,200,random(70,80),random(90,110));
  ellipse(200,200,random(220,260),random(360,400));
  fill(0);
  rect(125,90,60,15);
  rect(225,90,60,15);
  fill(255);
  ellipse(150,150,60,60);
  ellipse(250,150,60,60);
  strokeWeight(3);
  line(200,200,230,270);
  line(230,270,200,270);
  line(150,320,250,320);
  fill(0);
  ellipse(150,150,20,20);
  ellipse(250,150,20,20);
}
