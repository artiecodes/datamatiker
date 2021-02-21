class Food
{
  int x;
  int y;
  int type = 2;

  Player player;

  Food(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  } 
  void fleeFromPlayer() // FOOD MOVES AWAY FROM PLAYER - FIGURE OUT HOW TO STOP FOOD FROM GETTING STUCK IN CORNER?
  {
    if (player.x < food.x)
    {
      food.x += 2;
    }
    if (player.x > food.x)
    {
      food.x -= 2;
    }
    if (player.y < food.y)
    {
      food.y += 2;
    }
    if (player.y > food.y)
    {
      food.y -= 2;
    }
  }
}
