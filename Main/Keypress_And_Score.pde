void keyPressed() {
  
  if (key == CODED) {
    if (keyCode == LEFT) {
      a = #484358;
      keypress();
    } 
    else if (keyCode == UP) {
      b = #484358;
      keypress();
    } 
    else if (keyCode == DOWN){
      c = #484358;
      keypress();
    } 
    else if (keyCode == RIGHT) {
      d = #484358;
      keypress();
    }
    else if (keyCode == CONTROL) {
      e = #484358;
      keypress();
    }
  }
}

void keyReleased() {
  if (key == CODED) {
    if (keyCode == LEFT) {
      a = #C1C1C1;
    } 
    else if (keyCode == UP) {
      b = #C1C1C1;
    }
    else if (keyCode == DOWN){
      c = #C1C1C1;
    } 
    else if (keyCode == RIGHT) {
      d = #C1C1C1;
    }
    else if (keyCode == CONTROL) {
      e = #C1C1C1;
    }
  }
}



void keypress() {
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

void speedup() {
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
