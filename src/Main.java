import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        //inicializando scanner para receber dados do usuario

        System.out.println("Digite um primeiro número: ");
        double num1 = scanner.nextDouble(); //recebendo o primeiro numero do usuario
        System.out.println("Digite um segundo número: ");
        double num2 = scanner.nextDouble();//recebendo o segundo numero

        System.out.println("Escolha uma operação: ");
        System.out.println("1.Adição");
        System.out.println("2.Subtração");
        System.out.println("3.Divisão");
        System.out.println("4.Multiplicação");
        System.out.println("5.Porcentagem");

        int escolha = scanner.nextInt();
        //lendo a escolha do usuario 

        double resultado = 0;
        //inicializando o resultado com 0 

        switch (escolha) {
            case 1:
              resultado = num1 + num2;
              System.out.println("Resultado da adição: " + resultado);
              break;
            case 2:
              resultado = num1 - num2;
              System.out.println("Resultado da subtração: " + resultado);
              break;
            case 3:
              resultado = num1 / num2;
              System.out.println("Resultado da divisão: " + resultado);
              break;
            case 4:
              resultado = num1 * num2;
              System.out.println("Resultado da multiplicação é: " + resultado);
              break;
            case 5:
              resultado = (num1 * num2) / 100;
              System.out.println("Resultado da porcentagem é: " + resultado);
              break;
            default:
              System.out.println("Opção inválida!");
              
        }

        scanner.close();


    }
}
