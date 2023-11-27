public class Produto {
    String nome;
    double preco;
    double desconto;

    public Produto (String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(){

    }

    public String returnaResumoDoPedido(){
        return String.format("O produto %s está com o preço: %.2f", nome, preco);
    }
    public double retornaPrecoDesconto(){
        return preco - (preco * desconto);
    }
    public void imprimirResumoDoProduto(){
        System.out.printf("O produto %s está com o preço: %.2f%n", nome, preco);
    }
}
