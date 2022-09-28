/*
I would have liked to create a proper wincondition, but I couldn't figure out how to workaround the array.
I would also have liked to prevent a circle/cross from being placed in a 'taken' gridcell. My ideas didn't really function.

TicTacToe Game
Left mousebutton to place a cross
Right mousebutton to place a circle
Get 3 in a row/column/diagonal to win the game
Press the 'R' key to reset the board
*/

int cols = 3;
int rows = 3;
Grid[][] gameBoard = new Grid[cols][rows];

void setup() {
  size(600, 600);
  stroke(100);
  strokeWeight(3);

  for (int i = 0; i < cols; i++) {
    for (int j = 0; j < rows; j++) {
      gameBoard[i][j] = new Grid (i*200, j*200, 200, 200);
    }
  }
}

void draw() {

  for (int i = 0; i < cols; i++) {
    for (int j = 0; j < rows; j++) {
      gameBoard[i][j].display();
      gameBoard[i][j].placeCrossAndCircle(gameBoard[i][j]);
      gameBoard[i][j].keyPressed(); // reset game
    }
  }
}

void winCon() {
  //TODO: make a win condition that checks if 3 crosses or circles are horizontal, vertical, or diagonal

}
