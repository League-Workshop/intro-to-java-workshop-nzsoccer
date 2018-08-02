PImage mustache;
PImage friend;
void setup() {
  friend=loadImage ("cristiano-ronaldo.jpg");
  size(800, 600);
  friend.resize(width, height);
  mustache = loadImage ("Mustache.png");
  mustache.resize(100, 100);
}
void draw () {
  background (friend);

  if (mousePressed) {
    image (mustache, 290, 119);
  }
}