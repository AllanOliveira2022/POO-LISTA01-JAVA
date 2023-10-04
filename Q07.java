public class Q07 {
    public static void main(String args[]){
        int valor= 40;
            System.out.print(valor + " -- ");
            for(int i = valor; i >= 1; i--){
                if (valor % 2 == 0){
                    valor = valor / 2;
                }else{
                    valor =( 3 * valor) + 1;
                }
                System.out.print(valor+" -- ");
                if (valor == 1){
                    break;
                }

            }

    }
}
