import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int lerReal, lerImg;
        Numero teste = new Numero();
        Numero teste2 = new Numero();
        Scanner in = new Scanner(System.in);
        lerReal = in.nextInt();
        lerImg = in.nextInt();
        teste.InicializaNum(lerReal, lerImg);
        teste.ImprimeNum();
        lerReal = in.nextInt();
        lerImg = in.nextInt();
        teste2.InicializaNum(lerReal, lerImg);
        teste2.ImprimeNum();
        if (teste.Igual(teste2))
            System.out.println("É igual.");
        else
            System.out.println("Não é igual.");
        teste.Soma(teste2);
        teste.Subtrai(teste2);
        teste.Multiplica(teste2);
        teste.Divide(teste2);
        in.close();
    }
}
