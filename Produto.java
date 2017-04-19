public class Produto {
	private String nome, descricao;
	float avaliacao, preco;
	int SKU;
	public Produto(String nome, String descricao, float avaliacao, float preco, int sKU) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.avaliacao = avaliacao;
		this.preco = preco;
		SKU = sKU;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getSKU() {
		return SKU;
	}
	public void setSKU(int sKU) {
		SKU = sKU;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", avaliacao=" + avaliacao + ", preco=" + preco
				+ ", SKU=" + SKU + "]";
	}
	
	
}
