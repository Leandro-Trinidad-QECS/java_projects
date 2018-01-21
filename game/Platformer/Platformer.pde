Player player = new Player(color(255,255,0),50);
//Player player ;
void setup(){
   size(500,500);
}
void draw(){
  player.display();
  player.update();
   
}
void keyPressed() {
  if(key == CODED) {
    if(keyCode == LEFT) {
      player.movingLeft = true;
    }
    if(keyCode == RIGHT) {
      player.setX(player.getX() + player.speed);
    }
  }
}
void keyReleased() {

}