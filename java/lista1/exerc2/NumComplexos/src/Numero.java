class Numero{
    int parteReal;
    int parteImg;
    void InicializaNum(int real, int img){
        parteReal = real;
        parteImg = img;
    }
    void ImprimeNum(){
        System.out.println(parteReal+" + " +parteImg+"i");
    }
    boolean Igual( Numero num1){
        if ((parteReal == num1.parteReal) && (parteImg == num1.parteImg))
            return true;
        else
            return false;
        
    }
    void Soma(Numero num){
        int somaReal,somaImg;
        somaReal = parteReal + num.parteReal;// a + c 
        somaImg = parteImg + num.parteImg;// b + d
        System.out.println("A soma é "+ somaReal+" + "+somaImg+"i");
    }
    void Subtrai(Numero num){
        int subReal, subImg;
        subReal = parteReal - num.parteReal;// a - c
        subImg = parteImg - num.parteImg;// b - d
        System.out.println("A subtração é "+subReal+" + "+subImg+"i");
    }
    void Multiplica(Numero num){
        int mulReal, mulImg;
        mulReal = (parteReal*num.parteReal - parteImg*num.parteImg );// ac - bd
        mulImg = (parteReal*num.parteImg + parteImg*num.parteReal);// ad + bc
        System.out.println("A multiplicação é "+mulReal+" + "+mulImg+"i");
    }
    void Divide(Numero num){
        int cima1, baixo, cima2;
        cima1 = (parteReal*num.parteReal + parteImg*num.parteImg );// ac + bd
        baixo = num.parteReal*num.parteReal + num.parteImg*num.parteImg;// c^2 + d^2
        cima2 = (parteImg*num.parteReal - parteReal*num.parteImg);// bc - ad
        System.out.println("A divisão é "+cima1+"/"+baixo+" + ("+cima2+"/"+baixo+")i");

    }
}