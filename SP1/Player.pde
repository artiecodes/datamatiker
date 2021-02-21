class Player
{
  int x; 
  int y; 
  int type = 3; 
  int health;
  int score;

  Player(int tempX, int tempY, int tempHealth)
  {
    x = tempX;
    y = tempY;
    health = tempHealth;
  }

  void movement()
  {
    if (keyCode == UP)
    {
      player.y-=2;
    }
    if (keyCode == LEFT)
    {
      player.x-=2;
    }
    if (keyCode == DOWN)
    {
      player.y+=2;
    }
    if (keyCode == RIGHT)
    {
      player.x+=2;
    }
  }
  void takeDamage()
  {
    int enemyXToPlayer = Math.abs(player.x - enemy.x);
    int enemyYToPlayer = Math.abs(player.y - enemy.y);

    if (enemyXToPlayer <= 0 && enemyYToPlayer <= 0)
    {
      health--;
      enemy.x = (int)random(19);
      enemy.y = (int)random(19);
    }
    if (health <= 0)
    {
      health = 0;
    }
    
  }
  void increaseScore() // ONLY WORKS ON Y-AXIS?
  {
    int foodXToPlayer = Math.abs(player.x - food.x);
    int foodYToPlayer = Math.abs(player.y - food.y);

    if (foodXToPlayer <= 0 && foodYToPlayer <= 0)
    {
      player.score++;
      food.x = (int)random(19);
      food.y = (int)random(19);
    }
  }
}
