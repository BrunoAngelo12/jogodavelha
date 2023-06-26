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
                this.board[0][0] = player;
                break;
            case '2':
                this.board[0][1] = player;
                break;
            case '3':
                this.board[0][2] = player;
                break;
            case '4':
                this.board[1][0] = player;
                break;
            case '5':
                this.board[1][1] = player;
                break;
            case '6':
                this.board[1][2] = player;
                break;
            case '7':
                this.board[2][0] = player;
                break;
            case '8':
                this.board[2][1] = player;
                break;
            case '9':
                this.board[2][2] = player;
                break;
            default:
                System.out.println("Jogada inválida");
                break;                             
        }
        System.out.println();
        showBoard();   
    }

}
