public class TicTacToe {
   public static void main( String [] args )
    {
        String spot = ".|.|."; // spot where you can choose "X" or "O"
        String board = "-----"; // can't put your "X" or "O" on the board that would be ridiculous

        System.out.printf( " %s%n %s%n %s%n %s%n %s%n", spot, board, spot, board, spot );
    }
}
