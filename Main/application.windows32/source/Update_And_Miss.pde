void newnote() {
  notespawn = int(random(1, 10));
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

void update() {
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
  
  fill(#ED0216);
  if (health > 100) {
  health = 100;
  }
  rect(50, 500, 50, -health*4);
  
}


void movement() {

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

void miss() {
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




void gameover() {
  
   background(0, 0, 0);
   fill(#F20000);
   textFont(font, 120);
   text("Game Over", 180, 300);
   textFont(font, 50);
   text("Press 'ENTER' to retry!", 200, 400);
  
  
  
}
