import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Main extends PApplet {

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

int a = 0xffC1C1C1;
int b = 0xffC1C1C1;
int c = 0xffC1C1C1;
int d = 0xffC1C1C1;
int e = 0xffC1C1C1;

PFont font;
  
//VARIABLES END

public void setup() {
  
  background(0, 0, 0);
  stroke(0, 0, 0);
  fill(0xffED0216);
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


public void draw() {
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
  fill(0xff2192FF);
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
public void keyPressed() {
  
  if (key == CODED) {
    if (keyCode == LEFT) {
      a = 0xff484358;
      keypress();
    } 
    else if (keyCode == UP) {
      b = 0xff484358;
      keypress();
    } 
    else if (keyCode == DOWN){
      c = 0xff484358;
      keypress();
    } 
    else if (keyCode == RIGHT) {
      d = 0xff484358;
      keypress();
    }
    else if (keyCode == CONTROL) {
      e = 0xff484358;
      keypress();
    }
  }
}

public void keyReleased() {
  if (key == CODED) {
    if (keyCode == LEFT) {
      a = 0xffC1C1C1;
    } 
    else if (keyCode == UP) {
      b = 0xffC1C1C1;
    }
    else if (keyCode == DOWN){
      c = 0xffC1C1C1;
    } 
    else if (keyCode == RIGHT) {
      d = 0xffC1C1C1;
    }
    else if (keyCode == CONTROL) {
      e = 0xffC1C1C1;
    }
  }
}



public void keypress() {
  if ((note1 > 438) && (note1 < 520) && (keyCode == LEFT)) {
    note1 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note2 > 438) && (note2 < 520) && (keyCode == UP)) {
    note2 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note3 > 438) && (note3 < 520) && (keyCode == DOWN)) {
    note3 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note4 > 438) && (note4 < 520) && (keyCode == RIGHT)) {
    note4 = 0;
    score = score + combo;
    health = health + 2;;
  }
  else if ((note5 > 438) && (note5 < 520) && (keyCode == CONTROL)) {
    note5 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note6 > 438) && (note6 < 520) && (keyCode == LEFT)) {
    note6 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note7 > 438) && (note7 < 520) && (keyCode == UP)) {
    note7 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note8 > 438) && (note8 < 520) && (keyCode == DOWN)) {
    note8 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note9 > 438) && (note9 < 520) && (keyCode == RIGHT)) {
    note9 = 0;
    score = score + combo;
    health = health + 2;
  }
  else if ((note10 > 438) && (note10 < 520) && (keyCode == CONTROL)) {
    note10 = 0;
    score = score + combo;
    health = health + 2;
  }
  
}

public void speedup() {
  if (score == 100) {
    speed = 2;
  }
  if (score == 200) {
    speed = 3;
  }
  if (score == 300) {
    speed = 4;
  }
  if (score == 700) {
    speed = 5;
  }
  if (score == 1000) {
    speed = 6;
  }
  
}
public void circles() {
  fill (0xffA7A7A7);
  ellipse (230, 500, 70, 70);
  fill (a);
  ellipse (230, 500, 35, 35);
  fill (0xffA7A7A7);
  ellipse (329, 500, 70, 70);
  fill (b);
  ellipse (329, 500, 35, 35);
  fill (0xffA7A7A7);
  ellipse (430, 500, 70, 70);
  fill (c);
  ellipse (430, 500, 35, 35);
  fill (0xffA7A7A7);
  ellipse (530, 500, 70, 70);
  fill (d);
  ellipse (530, 500, 35, 35); 
  fill (0xffA7A7A7);
  ellipse (630, 500, 70, 70);
  fill (e);
  ellipse (630, 500, 35, 35); 
}
public void newnote() {
  notespawn = PApplet.parseInt(random(1, 10));
  print(notespawn);
  
  if ((notespawn == 1) && (note1 == 0)) {
    note1 = 1;
    image(leftarrow, 200, note1, 60, 60);
  }
  
  else if ((notespawn == 2) && (note2 == 0)) {
    note2 = 1;
    image(uparrow, 300, note2, 60, 60);
  }
  
  else if ((notespawn == 3) && (note3 == 0)) {
    note3 = 1;
    image(downarrow, 400, note3, 60, 60);
  }
  
  else if ((notespawn == 4) && (note4 == 0)) {
    note4 = 1;
    image(rightarrow, 500, note4, 60, 60);
  }
  
  else if ((notespawn == 5) && (note5 == 0)) {
    note5 = 1;
    image(controlc, 600, note5, 60, 60);
  }
  
  //Repeat
  else if ((notespawn == 6) && (note6 == 0)) {
    note6 = 1;
    image(leftarrow, 200, note6, 60, 60);
  }
    
  else if ((notespawn == 7) && (note7 == 0)) {
    note7 = 1;
    image(uparrow, 300, note7, 60, 60);
  }
     
  else if ((notespawn == 8) && (note8 == 0)) {
    note8 = 1;
    image(downarrow, 400, note8, 60, 60);
    }
    
  else if ((notespawn == 9) && (note9 == 0)) {
    note9 = 1;
    image(rightarrow, 500, note9, 60, 60);
    }
  
  else if ((notespawn == 10) && (note10 == 0)) {
    note10 = 1;
    image(controlc, 600, note10, 60, 60);
    } 
}

public void update() {
  background(0, 0, 0);
  circles();
  image(leftarrow, 200, 0, 60, 60);
  image(leftarrow, 200, note1, 60, 60);
  
  image(uparrow, 300, 0, 60, 60);
  image(uparrow, 300, note2, 60, 60);
  
  image(downarrow, 400, 0, 60, 60);
  image(downarrow, 400, note3, 60, 60);
  
  image(rightarrow, 500, 0, 60, 60);
  image(rightarrow, 500, note4, 60, 60);
  
  image(control, 600, 0, 60, 60);
  image(controlc, 600, note5, 60, 60); 
  
  image(leftarrow, 200, 0, 60, 60);
  image(leftarrow, 200, note6, 60, 60); 
  
  image(uparrow, 300, 0, 60, 60);
  image(uparrow, 300, note7, 60, 60); 
  
  image(downarrow, 400, 0, 60, 60);
  image(downarrow, 400, note8, 60, 60); 
  
  image(rightarrow, 500, 0, 60, 60);
  image(rightarrow, 500, note9, 60, 60); 
  
  image(controlc, 600, note10, 60, 60); 
  image(control, 600, 0, 60, 60);
  
  fill(0xffED0216);
  if (health > 100) {
  health = 100;
  }
  rect(50, 500, 50, -health*4);
  
}


public void movement() {

  if (note1 > 0) {
    note1 = note1 + speed; 
  }
  if (note2 > 0) {
    note2 = note2 + speed; 
  }
  if (note3 > 0) {
    note3 = note3 + speed; 
  }
  if (note4 > 0) {
    note4 = note4 + speed; 
  }
  if (note5 > 0) {
    note5 = note5 + speed; 
  }
  if (note6 > 0) {
    note6 = note6 + speed; 
  }
  if (note7 > 0) {
    note7 = note7 + speed; 
  }
  if (note8 > 0) {
    note8 = note8 + speed; 
  }
  if (note9 > 0) {
    note9 = note9 + speed; 
  }
  if (note10 > 0) {
    note10 = note10 + speed; 
  }
}

public void miss() {
  if (note1 > 600) {
    note1 = 0;
    health = health - 7;
  }
  if (note2 > 600) {
    note2 = 0;
    health = health - 7;
  }
  if (note3 > 600) {
    note3 = 0;
    health = health - 7;
  }
  if (note4 > 600) {
    note4 = 0;
    health = health - 7;
  }
  if (note5 > 600) {
    note5 = 0;
    health = health - 7;
  }
  if (note6 > 600) {
    note6 = 0;
    health = health - 7;
  }
  if (note7 > 600) {
    note7 = 0;
    health = health - 7;
  }
  if (note8 > 600) {
    note8 = 0;
    health = health - 7;
  }
  if (note9 > 600) {
    note9 = 0;
    health = health - 7;
  }
  if (note10 > 600) {
    note10 = 0;
    health = health - 7;
  }
  
}




public void gameover() {
  
   background(0, 0, 0);
   fill(0xffF20000);
   textFont(font, 120);
   text("Game Over", 180, 300);
   textFont(font, 50);
   text("Press 'ENTER' to retry!", 200, 400);
  
  
  
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Main" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
