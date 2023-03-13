import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Solicita ao usuario um numero inteiro
        System.out.print(" Digite um numero inteiro: ");
        int num = sc.nextInt();

        //Iniciando a sequencia de Fibonacci com os primeiros numeros.
        int [] fib = {0,1};

        //Calculo fibonacci
        while(fib[fib.length - 1] <= num){
            int prox = fib[fib.length - 1] + fib[fib.length -2];
            int[] novaFib = new int[fib.length +1];
            for(int i = 0; i< fib.length; i++){
                novaFib[i] = fib[i];
            }
            novaFib[fib.length] = prox;
            fib = novaFib;
        }
        //Verifica se o numero informado pertence a seguencia.
        boolean pertence = Arrays.stream(fib).anyMatch(x -> x == num);
        if(pertence){
            System.out.println("O numero inteiro pertecer a seguencia de Fibonacci");
        }else{
            System.out.println("O numero NAO pertence a seguencia de Fibonacci");
        }
    }
}
