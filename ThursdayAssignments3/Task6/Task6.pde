int[][] board = new int[8][8];
int sideLength = 40;

void setup() {
  size(320,320);
  int i = 0;
  for(int x = 0; x < board.length; x++) {
    for(int y = 0; y < board[x].length; y++) {
      
      board[x][y] = i % 2;
      i++;
    }
    i++;
  }
}

void draw() {

  for(int x = 0; x < board.length; x++) {
    for(int y = 0; y < board[x].length; y++) {
      if (board[x][y] == 1) {
        fill(255);
      }
      else {
        fill(0);
      }
      rect(x * sideLength, y * sideLength, sideLength, sideLength);
    }
  }

}
