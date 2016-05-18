//Kanishka Ragula
//Colored Shapes
void setup () {
  size(650, 550);
  //This is for the yellow quads.
  fill(255,255,0);
  rect(20,20,130,130);
  rect(180,20,130,130,20);
  rect(340,20,130,130,20,7,40,70);
  rect(500,50,120,80);
  //This is for the Red ellipses
  fill(255,0,0);
  ellipse(80,250,130,130);
  ellipse(240,250,130,85);
  ellipse(400,240,80,120);
  //This is for the blue triangles
  fill(0,0,255);
  triangle(560,180,500,300,620,300);
  triangle(20,420,150,460,40,340);
  //This is for the light blue quads at bottom 
  fill(100,255,255);
  quad(180,330,180,460,300,380,300,330);
  quad(400,340,360,400,400,460,440,400);
  quad(500,345,550,400,500,455,610,400);
}

