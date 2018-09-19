import java.awt.Point;
PImage uparrow;
int movement = 1;

void setup() {
  size(800, 600);
  background(0, 0, 0);
  stroke(0, 0, 0);
  fill(255, 255, 255);
  uparrow = loadImage("arrow_up_icon.png");
  
  
}


void draw() {
  image(uparrow, 200, 0+movement);
  
}
