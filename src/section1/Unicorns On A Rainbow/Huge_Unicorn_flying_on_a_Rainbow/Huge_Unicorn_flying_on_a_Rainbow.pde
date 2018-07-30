PImage rainbow;
PImage unicorn;
void setup() {
  rainbow=loadImage("rainbow image.jpg");
  size(800,600);
  rainbow.resize(width,height);
  unicorn=loadImage ("unicorn image.png");
  background (rainbow);
  unicorn.resize(250,150);
}
void draw (){
  background (rainbow);
  image (unicorn, mouseX, mouseY);
}