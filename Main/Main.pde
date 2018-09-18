import java.awt.Point;

Point buttonpos;
int buttonnum;
int buttonp;

void setup() {
  size(800, 600);
  background(255, 255, 255);
  

}

void draw() {
  buttoninit();

}

void buttoninit() {
  int butcheck = 0;
  buttonpos = buttonp;
  while (buttonnum > butcheck) {
    rect(buttonpos-200, buttonpos-100, buttonpos+200, buttonpos+100)
    
    
  }
  
}
