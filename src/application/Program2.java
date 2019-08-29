package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cadastro_aluno.Aluno;

public class Program2 {

	static List<Aluno> cadastro = new ArrayList<>();//Passei ela como uma variavel global
	
	public static void main(String[] args) {

		while(true) {//Começo do while
			
			String[] selectOption = { "Cadastrar", "Exibir","Pesquisar","Sair"};
			String option = (String) JOptionPane.showInputDialog(null, "Menu... ","Selecione a ação desejada: ", JOptionPane.QUESTION_MESSAGE, null, selectOption,selectOption[0]);

			switch (option) {
			case "Cadastrar":

				cadastrar();//Vai chamar o metodo cadastrar

				break;

			case "Exibir":
				mostrar();//Vai chamar o metodo mostrar
				break;
			
			case "Pesquisar":
				pesquisar();//Vai chamar o metodo Pesquisar
				break;
			case "Sair":
				System.out.println("Fim");//Vai sair

			}

			if (option.equals("Sair")) {
				break;
			}

		} // Fim do while
		
		
		
	}
	
	public static void cadastrar() {

		String name = JOptionPane.showInputDialog("Digite o nome do aluno");
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o r.a do aluno"));
		
		String[] selectSexo = { "Masculino", "Feminino"};
		String sexo = (String) JOptionPane.showInputDialog(null, "Sexo... ","Selecione o sexo: ", JOptionPane.QUESTION_MESSAGE, null, selectSexo,selectSexo[0]);
		
		String[] selectPlano = { "Basico", "Black"};
		String plano = (String) JOptionPane.showInputDialog(null, "Plano... ","Selecione o plano: ", JOptionPane.QUESTION_MESSAGE, null, selectPlano,selectPlano[0]);
		
		String[] selectPagamento = { "Mensal", "Semestral","Anual"};
		String pagamento = (String) JOptionPane.showInputDialog(null, "Pagamento... ","Selecione a forma de pagamento: ", JOptionPane.QUESTION_MESSAGE, null, selectPagamento,selectPagamento[0]);
	
		Aluno aluno = new Aluno(name, ra, sexo, plano, pagamento);
		cadastro.add(aluno);
		JOptionPane.showMessageDialog(null,"Cadastro finalizado com sucesso!");

	}

	public static void mostrar() {

		System.out.println("Dados");
		for (Aluno aluno : cadastro) {// for each vai percorrer a lista

			System.out.println(aluno);// Vai mostrar os dados na classe aluno
			System.out.println();
		}

	}

	public static void pesquisar() {
		
		int nRa = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do RA do aluno que voce deseja"));//Passa o numero do r.a
		Aluno a = cadastro.stream().filter(x -> x.getRa() == nRa).findFirst().orElse(null);//Vai utilizar duas classes do java que são stream e filter elas fazem pesquisas dentro de lista
		//vao comparar oque tem dentro da variavel que vc passou como parametro e a variavel que vai ser comparada
		
		if (a == null) {
			System.out.println("RA não encontrado");//Se o comando da classe straem trazer um valor nulo vai mostrar esssa msg
		}
		
		else {
			
			System.out.println("Cadastro encontrado!");
			System.out.println();
			System.out.println(a.toString());//vai mostrar os dados do aluno d

		}
		
	}

}
