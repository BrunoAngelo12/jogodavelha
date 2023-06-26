import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Tabuleiro tab = new Tabuleiro();

        System.out.println(" - Welcome to the tic-tac-toe game :) - ");
        System.out.println();

        System.out.print("Player 1 X or O ? -> ");
        char p1, p2;
        p1 = sc.next().charAt(0);
        if (p1 != 'X' && p1 != 'O'){
            do{
                System.out.print("Select valid player: X or O...");
                p1 = sc.next().charAt(0);
            }while(p1 != 'X' && p1 != 'O');
        }
        if(p1 == 'X'){
            p2 = 'O';
        }else{
            p2 = 'X';
        }
        System.out.println();
        
        System.out.println("Player 1: " + p1 + "\nPlayer 2: " + p2);
        System.out.println();
        
        System.out.println("Play the game: ");
        System.out.println("Player 1 (" + p1 + "): Select the number where you want to play." );
        System.out.println();
        tab.newBoard();
        tab.showBoard();
        System.out.print("Insert: ");
        char insert = sc.next().charAt(0);
        tab.insertMove(insert, p1);

        sc.close();
    }
}
