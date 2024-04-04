import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        int pedido = 1, quantidade, mesa;
        RestauranteCaseiro restaurante = new RestauranteCaseiro();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Bem vindo ao Restaurante Roça, selecione seu pedido:\n1 - Prato Feito: R$20\n2 - CocaCola: R$5\n3 - Balinha: R$2\n4 - Macarronete: R$24\n5 - Fechar conta\nDigite o número do pedido requerido: ");
            pedido = input.nextInt();
            if (pedido == 0)
                break;
            else if (pedido == 5){
                System.out.println("Qual mesa deseja encerrar a conta?");
                mesa = input.nextInt();
            }
            System.out.println("Quantos pedidos?");
            quantidade = input.nextInt();
            System.out.println("Em qual mesa adicionar?");
            mesa = input.nextInt();
            restaurante.AdicionaMulPedidos(mesa,pedido,quantidade);
        }
        System.out.println("A Conta da mesa1 deu: "+restaurante.mesa1.CalculaTotal()+" Reais");
        System.out.println("A Conta da mesa2 deu: "+restaurante.mesa2.CalculaTotal()+" Reais");
        input.close();
    }
}
