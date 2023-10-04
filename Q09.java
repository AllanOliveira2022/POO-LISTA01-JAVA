import java.util.Scanner;
public class Q09 {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        float salario;
        float novo_salario = 0;
        System.out.println("Informe seu salário: ");
        salario = sc.nextFloat();
        System.out.println("Seu salário antes do reajuste: " + salario);

        if(salario <= 280){
            novo_salario = (salario + (salario * 0.20f)); 
            System.out.println("Percentoal de reajuste: 20%");
            System.out.println("Valor do aumento: " + (novo_salario - salario));
        }else if(salario > 280 && salario < 700){
            novo_salario = (salario + (salario * 0.15f));
            System.out.println("Percentoal de reajuste: 15%");
            System.out.println("Valor do aumento: " + (novo_salario - salario));
        }else if(salario >= 700 && salario < 1500){
            novo_salario = (salario + (salario * 0.10f));
            System.out.println("Percentoal de reajuste: 10%");
            System.out.println("Valor do aumento: " + (novo_salario - salario));
        }else if(salario >= 1500){
            novo_salario = (salario + (salario * 0.05f));
            System.out.println("Percentoal de reajuste: 5%");
            System.out.println("Valor do aumento: " + (novo_salario - salario));
        }else{
            System.out.println("Informe um salário válido!!!");
        }
        System.out.println("Salário após o aumento: " + novo_salario);

    }
}
