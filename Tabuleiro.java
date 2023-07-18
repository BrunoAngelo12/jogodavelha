import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Tabuleiro {
    public Character[][] board = new Character[3][3];

    public Tabuleiro(){}

    public void showBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if ((j == 0 || j == 2)){
                    System.out.print(" | " + board[i][j] + " | ");
                }else{
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void newBoard(){
        this.board[0][0] = '1';
        this.board[0][1] = '2';
        this.board[0][2] = '3';
        this.board[1][0] = '4';
        this.board[1][1] = '5';
        this.board[1][2] = '6';
        this.board[2][0] = '7';
        this.board[2][1] = '8';
        this.board[2][2] = '9';       
    }

    public void insertMove(char insert, char player){
        switch (insert){
            case '1':                               
                if(this.board[0][0] == '1'){
                    this.board[0][0] = player;
                    break;
                }
                break;
            case '2':
                if(this.board[0][1] == '2'){
                    this.board[0][1] = player;
                    break;
                }
                break;
            case '3':
                if(this.board[0][2] == '3'){
                    this.board[0][2] = player;
                    break;
                }
                break;
            case '4':
                if(this.board[1][0] == '4'){
                    this.board[1][0] = player;
                    break;
                }
                break;
            case '5':
                if(this.board[1][1] == '5'){
                    this.board[1][1] = player;
                    break;
                }
                break;
            case '6':
                if(this.board[1][2] == '6'){
                    this.board[1][2] = player;
                    break;
                }
                break;
            case '7':
                if(this.board[2][0] == '7'){
                    this.board[2][0] = player;
                    break;
                }
                break;
            case '8':
                if(this.board[2][1] == '8'){
                    this.board[2][1] = player;
                    break;
                }
                break;
            case '9':
                if(this.board[2][2] == '9'){
                    this.board[2][2] = player;
                    break;
                }
                break;
            default:
                System.out.println("Jogada inválida");
                break;                             
        }
        System.out.println();   
    }

    public void runGame(char p1, char p2){
        Scanner sc2 = new Scanner(System.in);
        for(int i = 6; i <= 99; i++){
            if (i % 2 == 0){
                System.out.println("Player 1 (" + p1 + "): Select the number where you want to play: ");
                System.out.println();
                showBoard();
                System.out.print("P1 Insert: ");
                char insert = sc2.next().charAt(0);
                insertMove(insert, p1);
                boolean test = verification(insert, p1);
                if(test == false){
                    System.out.println("invalid move, try again");
                    i--;
                    System.out.println();
                }
                boolean ganhador = winner(p1);                
            }else{
                System.out.println("Player 2 (" + p2 + "): Select the number where you want to play: ");
                System.out.println();
                showBoard();
                System.out.print("P2 Insert: ");
                char insert = sc2.next().charAt(0);
                insertMove(insert, p2);
                boolean test = verification(insert, p2);
                if(test == false){
                    System.out.println("invalid move, try again");
                    i--;
                    System.out.println();
                }
                boolean ganhador = winner(p2);           
            }
        }
        sc2.close();
    }

    public boolean verification(char insert, char player){
        boolean test = false;
        switch (insert){
            case '1':
                if (this.board[0][0] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }               
            case '2':
                if (this.board[0][1] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '3':
                if (this.board[0][2] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '4':
                if (this.board[1][0] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '5':
                if (this.board[1][1] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '6':
                if (this.board[1][2] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '7':
                if (this.board[2][0] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '8':
                if (this.board[2][1] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }
            case '9':
                if (this.board[2][2] == player){
                    test = true;
                    return test;
                }else{
                    test = false;
                    return test;
                }                                  
            default:
                test = false;
                return test;    
        }
    }

    public boolean winner(char player){
        if (this.board[0][0] == player && this.board[0][1] == player && this.board[0][2] == player){
            System.out.println("ganhou");
            return true;
        }else{
            return false;
        }
    }

}
