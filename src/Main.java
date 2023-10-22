import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        //va01
        System.out.println("+-----+");
        System.out.println("|david|");
        System.out.println("+-----+");

        //va02
        String nome = "fortaleza";
        int len = nome.length();
        System.out.println(len);

        String nome2 = "joana";
        String n = nome2.toUpperCase();
        System.out.println(n);

        String nome3 = "ana";
        //nome3.println();
        //nao esta correto.

        //va03
        double[] data = new double[10];
        for (int i=0; i < data.length; i++)
            data[i]=i*i;
        System.out.println(data);

        //va05
        //a)
        for (int a=100; a<201; a++)
            System.out.println(a);

        //b)
        int soma=0;
        for (int b=2; b<1000; b+=2)
            soma += b;
        System.out.println(soma);

        //c)
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
        //e)
        int primeiroTermo = 0;
        int segundoTermo = 1;

        while (primeiroTermo <= 50) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        //f)
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        while (x != 1) {
            System.out.print(x + " -> ");

            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        }

        // Imprime o último valor (1) após o loop
        System.out.println(x);

        // Fecha o scanner
        scanner.close();
    }
}