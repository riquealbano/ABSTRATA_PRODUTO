package Main;

import Produto.ProdutoAlimenticio;
import Produto.ProdutoVestuario;

public class Main {
    public static void main(String[] args) {
        ProdutoAlimenticio pa = new ProdutoAlimenticio("Biscoito", 2.00, 3.50, "12/2024");
        ProdutoVestuario pv = new ProdutoVestuario("Camiseta", 10.00, 20.00, "M");

        pa.salvar();
        System.out.println("Lucro do Produto Alimentício: " + pa.calcularLucro()+"\n");
        
        pv.salvar();
        System.out.println("Lucro do Produto de Vestuário: " + pv.calcularLucro()+"\n");
    }
}
