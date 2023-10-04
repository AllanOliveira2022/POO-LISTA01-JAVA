public class Q04 {
    public static void main(String args []){
        int valor = 17;
        for(int i = 2; i <= valor - 1; i++){
            if (valor % i == 0){
                System.out.println("Este número não é primo!");
                break;
            }else{
                System.out.println("É primo!");
                break;
            }
        }
    }
}
