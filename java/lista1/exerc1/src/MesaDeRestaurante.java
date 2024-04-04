public class MesaDeRestaurante{
    int contaFinal;
    int pratoFeito, precoPratoFeito = 20;
    int cocacola, precoCocaCola = 5;
    int balinha, precoBalinha = 2;
    int macarronete, precoMacarronete = 24; 
    public void AdicionaPedidos(int NumPedido){
        switch (NumPedido) {
            case 1:
                pratoFeito += 1 ;
                break;
            case 2:
                cocacola += 1;
                break;
            case 3:
                balinha += 1;
                break;
            case 4: 
                macarronete += 1;
            default:
                break;
        }
        
    }
    void zeraPedidos(){
        pratoFeito = 0;
        cocacola = 0;
        balinha = 0;
        macarronete = 0;
    }
    int CalculaTotal(){
        contaFinal = pratoFeito * precoPratoFeito + cocacola * precoCocaCola + balinha * precoBalinha + macarronete * precoMacarronete;
        return contaFinal;
    }
}