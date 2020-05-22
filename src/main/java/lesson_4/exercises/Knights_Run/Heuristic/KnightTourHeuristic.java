package lesson_4.exercises.Knights_Run.Heuristic;


public class KnightTourHeuristic {
    private  int N = 8;
    private  int[][] board = new int[8][8];
    private  int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2 };
    private  int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private  int[][] accessibility = {{2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}};


    public void body()
    {
        for(int row = 0; row < board.length; row++)
        {
            for(int column = 0; column < board[row].length; column++)
                board[row][column] = -1;
            board[0][0] = 0;
        }
        display();

        if(!step(0, 0, 1))
        {
            System.out.println("\nthe solution is:\n");
            display();
        }
    }


    public  void display()
    {
        for(int row = 0; row < board.length; row++)
        {
            for(int column = 0; column < board[row].length; column++)
                System.out.printf("%4d", board[row][column]);
            System.out.println();
            System.out.println();
        }
    }

    public boolean step(int x, int y, int a)
    {
        int row, column;

        if(a == 64)
            return false;

        for(int sign = 2; sign <= N; sign++)
        {

            for(int k = 0; k < N ; k++)
            {
                row = x + vertical[k];
                column = y + horizontal[k];

                if(safe(row, column))
                {
                    if(accessibility[row][column] == sign)
                    {
                        board[row][column] = a;

                        if(step(row, column, a + 1))
                            return true;
                        else
                            return false;

                    }
                }
            }
        }
        return false;
    }

    public boolean safe( int row, int column)
    {
        if(row >= 0 && row <= 7 && column >= 0 && column <= 7 && board[row][column] == -1)
            return true;
        return false;
    }


}

