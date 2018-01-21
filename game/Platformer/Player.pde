class Player {

  private float x;
  private float y;
  private float w;
  private color c;
  private int speed = 10;
  boolean movingLeft;
  boolean movingRight;
  
  
  Player(color c, float w) {
    this.c = c;
    this.w = w;
  }
  void update() {
  }
  void display() {
    fill(c);
    
    rect(x,y,w,w);
  }
  
  float getX() {
    return x;
  }
  float getY() {
    return y;
  
  
  }
  int getSpeed() {
    return speed;
  }
  void setX(float xx) {
    this.x = xx;
  }
  void setY(float yy) {
    this.y = yy;
  }

}