public class Q05{
    public static void main(String args []){
        int quant = 15;
        int fibonacci[] = new int[quant];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < quant; i++){
            fibonacci[i] =fibonacci[i - 1] + fibonacci[i - 2];
        }
        for(int a= 0; a <= quant; a++){
            System.out.print(fibonacci[a] + " -- ");
        }


    }
}