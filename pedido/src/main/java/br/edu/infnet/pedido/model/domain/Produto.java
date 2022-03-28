package br.edu.infnet.pedido.model.domain;

public abstract class Produto {

	private Integer id;
	private String nome;
	private float valor;
	private int codigo;
	
	public Produto(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract float calcularValorVenda();

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		sb.append(calcularValorVenda());
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}