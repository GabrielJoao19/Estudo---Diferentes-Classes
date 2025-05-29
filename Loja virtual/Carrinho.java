import java.util.List;
import java.util.ArrayList;
public class Carrinho {
    private List<Produto> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public double calcularTotal(){
        double somaTotal = 0;
        for (Produto produto : produtos){
            somaTotal+= produto.getPreco();
        }
        return somaTotal;
    }
}