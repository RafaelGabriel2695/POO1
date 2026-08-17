package br.pucrs.Rafael;

import java.time.LocalDatetime;
import java.util.ArrayList;

public class Venda{

    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Vendas(Cliente cli){
        this.cliente = cli;
        this.itens = new ArrayList<>();
    }

    public void Inserir(Produto prod){

    }

    public void Inserir(int qtde, Produto prod){
        itens.add(new ItemVenda(qtde, prod));
    }

    public String getNotaFiscal(){
        double total = 0;
        StringBuilder nota = new StringBuilder("Exercicio POO 2026/2\t");
        nota.append(LocalDatetime.now().toLocalDate() + "\n");
        nota.append("Comprador: " + cliente.getNome());
        nota.append("/n-------------------------/n");

        for(ItemVenda item: itens){
            nota.append(item.toStrin() + "\n");
            total = total + item.getValor();
        }
        nota.append("/n-------------------------/n");
        nota.append(String.format("\t\tTotal: R$ %2f\n\n", total));
        return nota.String();
    }

    public String toString(){
        return "Venda [cliente = " + cliente + ", itens = " + itens + "]";
    }
}

