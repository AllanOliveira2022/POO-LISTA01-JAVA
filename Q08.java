public class Q08{
    public static void main(String args[]){
        int valorN = 5;
        for(int i=1; i <= valorN; i++){
            for(int j=1; j <= i; j++){
                System.out.print(i * j + " -- ");
            }
            System.out.println("");
        }

    }
}