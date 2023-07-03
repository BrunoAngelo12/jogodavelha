import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //NOVO JOGO
        Scanner sc = new Scanner(System.in);
        Tabuleiro tab = new Tabuleiro();
        System.out.println(" - Welcome to the tic-tac-toe game :) - ");
        System.out.println();

        //SELEÇÃO DE PLAYER
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
        
        //COMEÇO DO JOGO
        System.out.println("Play the game: ");
        System.out.println();
        tab.newBoard();
        tab.runGame(p1, p2);        

        sc.close();
    }
}
