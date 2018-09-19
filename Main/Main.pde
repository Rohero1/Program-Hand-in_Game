//VARIABLES DECLARE

PImage uparrow;
PImage downarrow;
PImage leftarrow;
PImage rightarrow;
PImage control;
PImage controlc;

int second1 = second();
int second2 = 0;
int dtime = 0;

float notespawn = 0;

int note1 = 0;
int note2 = 0;
int note3 = 0;
int note4 = 0;
int note5 = 0;
int note6 = 0;
int note7 = 0;
int note8 = 0;
int note9 = 0;
int note10 = 0;

int health = 70;
int speed = 1;
int score = 0;
int combo = 10;

//boolean keypL = false;
//boolean keypR = false;
//boolean keypU = false;
//boolean keypD = false;

color a = #C1C1C1;
color b = #C1C1C1;
color c = #C1C1C1;
color d = #C1C1C1;
color e = #C1C1C1;

PFont font;
  
//VARIABLES END

void setup() {
  size(800, 600);
  background(0, 0, 0);
  stroke(0, 0, 0);
  fill(#ED0216);
  uparrow = loadImage("arrow_up_icon.png");
  downarrow = loadImage("arrow_down_icon.png");
  leftarrow = loadImage("arrow_left_icon.png");
  rightarrow = loadImage("arrow_right_icon.png");
  control = loadImage("ctrl-key-icon-18.png");
  controlc = loadImage("500px-Circle.png");
  second2 = second1;
  font = loadFont("AgencyFB-Bold-48.vlw");
  textFont(font, 30);
  
}


void draw() {
  if (health <= 0) {
  gameover();
  
  if (keyCode == ENTER) {
    health = 70;
    note1 = 0;
    note2 = 0;
    note3 = 0;
    note4 = 0;
    note5 = 0;
    note6 = 0;
    note7 = 0;
    note8 = 0;
    note9 = 0;
    note10 = 0;
  }
  
  }
  
  else {
  //print(note1);
  second1 = second();
  dtime = (second1 - second2);
  
  update();
  fill(#2192FF);
  textFont(font, 30);
  text("Score: ", 10, 25, 300, 300);
  text(" "+ score, 10, 55, 300, 300);
  
  movement();
  
  miss();
  speedup();
  
  if ((dtime > 0) && (score < 400) ||(dtime < 0) && (score < 400)) {
    second2 = second1;
    //print(dtime);
    newnote();
  }
  
  else if ((dtime >= 0) && (score > 400) ||(dtime <= 0) && (score > 400)) {
    second2 = second1;
    //print(dtime);
    newnote();
  }
  }
  
}
