import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the tic-tac-toe game :)");
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
        System.out.println("player 1: " + p1 + " - player 2: " + p2);                
        sc.close();
    }
}
