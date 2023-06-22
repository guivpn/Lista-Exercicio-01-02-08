import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numeroUm = teclado.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numeroDois = teclado.nextDouble();

        System.out.println("Informe algum operador para resolver a conta: ");
        String operador = teclado.next();

        //Fechamento de Scanner
        teclado.close();


        if(operador.equals("+")) {
            //Soma dos números
            double resultUm = numeroUm + numeroDois;
            System.out.println("A soma do número é: " + resultUm + "\nAlém disso, o número é: ");
            //Código par ou ímpar
            if(resultUm % 2 == 0) {
                System.out.println("Par.");
            } else {
                System.out.println("Ímpar. ");
            }

            //Código número positivo ou negativo
            if(resultUm > 0) {
                System.out.println("Positivo. ");
            } else {
                System.out.println("Negativo. ");
            }

            //Código inteiro ou decimal
            if(resultUm % 1 == 0) {
                System.out.println("Inteiro. ");
            } else {
                System.out.println("Decimal. ");
            }



        } else if(operador.equals("-")) {
            //Subtração dos números
            double resultDois = numeroUm - numeroDois;
            System.out.println("A subtraçção dos números é: " + resultDois + "\nAlém disso o número é: ");

            //Par ou ímpar
            if(resultDois % 2 == 0) {
                System.out.println("Par. ");
            } else {
                System.out.println("Ímpar. ");
            }
            
            //Código número positivo ou negativo
            if(resultDois > 0) {
                System.out.println("Positivo. ");
            } else {
                System.out.println("Negativo. ");
            }

            //Código inteiro ou decimal
            if (resultDois % 1 == 0) {
                System.out.println("Inteiro. ");
            } else {
                System.out.println("Decimal. ");
            }



        } else if(operador.equals("/")) {
            //Divisão dos números
            double resultTres = numeroUm / numeroDois;
            System.out.println("A divisão dos números é: " + resultTres + "\nAlém disso o número é: ");

            //Par ou ímpar
            if(resultTres % 2 == 0) {
                System.out.println("Par. ");
            } else {
                System.out.println("Ímpar. ");
            }
            
            //Código número positivo ou negativo
            if(resultTres > 0) {
                System.out.println("Positivo. ");
            } else {
                System.out.println("Negativo. ");
            }

            //Código inteiro ou decimal
            if(resultTres % 1 == 0) {
                System.out.println("Inteiro. ");
            } else {
                System.out.println("Decimal. ");
            }


            
        } else if(operador.equals("*")) {
            //Multiplicação dos números
            double resultQuatro = numeroUm * numeroDois;
            System.out.println("A multiplicação dos números é: " + resultQuatro + "\nAlém disso o número é: ");

            //Par ou ímpar
            if(resultQuatro % 2 == 0) {
                System.out.println("Par. ");
            } else {
                System.out.println("Ímpar. ");
            }
            
            //Código número positivo ou negativo
            if(resultQuatro > 0) {
                System.out.println("Positivo. ");
            } else {
                System.out.println("Negativo. ");
            }

            //Código inteiro ou decimal
            if(resultQuatro % 1 == 0) {
                System.out.println("Inteiro. ");
            } else {
                System.out.println("Decimal. ");
            }
        }

    }
}
