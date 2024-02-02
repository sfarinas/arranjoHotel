package arranjoHotel;

public class Aluguel {
	public String nome;
	public String email;
	public int quarto;
	
	public Aluguel(int quarto, String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "ALUGUEL: Rooms: " + quarto + " = " + nome + ", " + email + ".";
	}
	
	
	

}
