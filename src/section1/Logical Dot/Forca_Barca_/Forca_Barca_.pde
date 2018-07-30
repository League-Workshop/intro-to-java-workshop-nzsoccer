void setup () {
  size (800, 800);
}

void draw () { 
  fill (#FF0000);
  if (mousePressed) {
    fill (#3F00FF);
  }
  ellipse (mouseX,mouseY, 500, 500);
}