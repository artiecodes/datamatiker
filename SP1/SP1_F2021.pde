// MAIN

/*
If I were better, I would have liked to figure out how to keep the frameRate(60)
but slow down the enemies & food, so the player remains the fastest, since delay() seemed to slow down the entire program
The game is basically unplayable with how fast the enemy moves
and add some images/music as well as a cooler overlay for score&health.
If I had figured out how to slow down the game, I could have probably made a bigger grid and added more enemies and food.
*/

int size = 40;
int[][] grid = new int[20][20];

Player player;
Enemy enemy;
//Enemy enemy2;
//Enemy enemy3; None of these are being drawn?
//Enemy enemy4;
Food food;
//Food food2;
//Food food3; Neither are these
//Food food4;


void setup()
{
  size(800, 860);
  frameRate(10);
  player = new Player(12, 12, 3);
  enemy = new Enemy(1, 1, player);
  food = new Food(10, 10, player);
  //food2 = new Food(19, 19, player); // ?
  
}

void draw()
{
  clearBoard();
  updateEntities();
  drawBoard();
}

void clearBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      grid[x][y] = 0;
    }
  }
}

void drawBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid.length; y++)
    {
      fill(getColorFromType(grid[x][y]));
      stroke(255);
      rect(x * size, y * size, size, size);
    }
  }
  /*
  textSize(30);
  fill(255);
  text("Score: " + player.score, 10, 840); // Tried to add score&health overlay, but it would always show 0 underneath even after updating
  text("Health: " + player.health, 640, 840);
  */
}
void playerOobPrevention()
{
  player.x = constrain(player.x, 0, 19);
  player.y = constrain(player.y, 0, 19);
}
void foodOobPrevention()
{
  food.x = constrain(food.x, 0, 19);
  food.y = constrain(food.y, 0, 19);
}
void enemyOobPrevention()
{
  enemy.x = constrain(enemy.x, 0, 19);
  enemy.y = constrain(enemy.y, 0, 19);
}
void updateEntities()
{
  player.movement();
  player.takeDamage();
  player.increaseScore();
  playerOobPrevention();
  grid[player.x][player.y] = player.type;

  grid[enemy.x][enemy.y] = enemy.type;
  enemy.chasePlayer();
  enemyOobPrevention();

  foodOobPrevention();
  grid[food.x][food.y] = food.type;
  food.fleeFromPlayer();
  
  if (player.score >= 3) // Victory screen
  {
    textSize(60);
    fill(255);
    text("VICTORY", 300, 850);
    noLoop();
  }
  else if (player.health == 0) // Game over screen
  {
    textSize(60);
    fill(255);
    text("GAME OVER", 250, 850); // Set x to 0 for "'R' to restart"
    noLoop();
  }
}


color getColorFromType(int type) 
{
  color c = color(255);

  switch(type)
  {
  case 0: 
    c = color(0);
    break;
  case 1: 
    c = color(255, 0, 0);
    break;
  case 2: 
    c = color(0, 255, 0);
    break;
  case 3: 
    c = color(0, 0, 255);
    break;
  }    

  return c;
}
void keyReleased()
{
  keyCode = -1;
}
/*
void keyPressed()
{
  if (key == 'r');
  frameCount = -1; Played a bit with a 'reset' button, but couldn't figure it out
  loop();
}
*/
