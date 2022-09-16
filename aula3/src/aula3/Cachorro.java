package aula3;

  public class Cachorro {

	    private String nome;
	    private int idade;
	    private float compPelos;
	    private String corPelos;
	    private String corOlhos;
	    private double peso;
		
		
		
	public Cachorro(String nome, int idade, int compPelos, String corPelos, String corOlhos, double peso) {
		
		this.nome = nome;
		this.idade = idade;
		this.compPelos = compPelos;
		this.corPelos = corPelos;
		this.corOlhos = corOlhos;
		this.peso = peso;
	}
	
	//NOME
	public String getNome() {
	return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//IDADE
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//COMPRIMENTO PELO
	public float getCompPelos() {
		return compPelos;
	}
	
	public void setCompPelos(float compPelos) {
		this.compPelos = compPelos;
	}
	
	//COR PELOS
	public String getCorPelos() {
		return corPelos;
	}
	
	public void setCorPelos(String corPelos) {
		this.corPelos = corPelos;
	}
	
	//COR OLHOS
	public String getCorOlhos() {
		return corOlhos;
	}
	
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	
	//PESO
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
		

}