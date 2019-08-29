package cadastro_aluno;

public class Aluno {
	
	private String name;
	private Integer ra;
	private String sexo;
	private String plano;
	private String pagamento;
	
	public Aluno() {
		
	}

	public Aluno(String name, Integer ra, String sexo, String plano, String pagamento) {
		//Metodo contrutor que obriga que o usuario passe todas as informações passada como parametro
		this.name = name;
		this.ra = ra;
		this.sexo = sexo;
		this.plano = plano;
		this.pagamento = pagamento;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRa() {
		return ra;
	}

	public void setRa(Integer ra) {
		this.ra = ra;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getPagamento() {
		return pagamento;
	}

	
	public Double plano() {
		
		double basico = 79.0;
		double black = 99.0;
		
		if (plano.equals("Basico")) {
			//vai receber uma String pelo metodo contrutor e vai selecionar o tipo de plano dependendo de qual for o plano vai retornar um valor
			return basico;
		}else {
			return black;
		}
		
	}
	
	public Double total() {
		
		if (pagamento.equals("Mensal")) {
			//vai receber uma String pelo metodo contrutor e vai selecionar a forma de pagamento dependedndo de qual for a forma de pagamento ele vai aplicar uma formula diferente
			return plano();
			
		}else if (pagamento.equals("Semestral")) {
			
			return plano() - plano() *0.5;
			
		}else {
			return plano() - (plano() * 0.10);
		}
		
	}
	
	public String toString() {
		
		return "Name: "+name
				+"\nR.A: "+ra
				+"\nSexo: "+sexo
				+"\nForma de pagamento: "+pagamento
				+"\nPlano: "+plano
				+"\nTotal: "+total();
		//Vai retornar todos os dados em forma de String
		
	}
	
}
