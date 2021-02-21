class Enemy
{
  int x;
  int y;
  int type = 1; 
  Player player;

  Enemy(int tempX, int tempY, Player tempPlayer)
  {
    x = tempX;
    y = tempY;
    player = tempPlayer;
  }
  void chasePlayer() // ENEMY CHASES PLAYER
  { 
    if (player.x < enemy.x)
    {
      enemy.x --;
    }
    if (player.x > enemy.x)
    {
      enemy.x ++;
    }
    if (player.y < enemy.y)
    {
      enemy.y --;
    }
    if (player.y > enemy.y)
    {
      enemy.y ++;
    }
  }
}
