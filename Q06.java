public class Q06 {
    public static void main(String args[]){
        
        int fatorial = 1;
        for(int j = 1; j >=10 ; j++){
            for(int i = j; i > 1; i--){
                fatorial = fatorial * i;
            } 
            System.out.println("Fatorial de "+ j + " é: " + fatorial);
    }
    }
}
