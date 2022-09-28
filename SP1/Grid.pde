class Grid {
  
  int x;
  int y;
  int w;
  int h;
  int state;
  
  public Grid (int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    
  }
  void display() {
    stroke(0);
    fill(255);
    rect(x, y, w, h);
    if (state == 1) {
      // Draw the circle
      fill(255);
      ellipse(x+w/2, y+h/2, 190, 190);
    } else if (state == 2) {
      fill(255);
      // Draw the "cross"
      //point(x+w/2,y+h/2) //MIDDLE OF RECT
      line(x, y, x+w/2, y+h/2);
      line(x, y, x+w, y+h);
      line(x, y+200, x+w/2, y+h/2);
      line(x+200, y, x+w/2, y+h/2);
    }
  }
  
  void keyPressed() {
  if (keyPressed) {
    if (key == 'R' || key == 'r') {
      state = 0;
      println("Resetting game");
    }
  }
}

void placeCrossAndCircle(Grid a) {
  if (mousePressed) {
    if (mouseButton == LEFT && mouseX > a.x && mouseX < a.x+a.w
      && mouseY > a.y && mouseY < a.y+a.h) {
      a.state= 1;
    } else if (mouseButton == RIGHT && mouseX > a.x && mouseX < a.x+a.w
      && mouseY > a.y && mouseY < a.y+a.h) {
      a.state= 2;
    }
  }
}
}
