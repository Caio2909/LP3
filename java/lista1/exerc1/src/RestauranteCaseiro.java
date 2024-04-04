public class RestauranteCaseiro {
    MesaDeRestaurante mesa1 = new MesaDeRestaurante();
    MesaDeRestaurante mesa2 = new MesaDeRestaurante();
    void AdicionaMulPedidos(int NumMesa, int NumPedido, int QuantPedidos){
        switch (NumMesa) {
            case 1:
                for (int i = 0; i < QuantPedidos; i++)
                    this.mesa1.AdicionaPedidos(NumPedido);
                break;
            case 2:
                for (int i = 0; i < QuantPedidos; i++)
                    this.mesa2.AdicionaPedidos(NumPedido);
            default:
                break;
        }
       

    }
}

