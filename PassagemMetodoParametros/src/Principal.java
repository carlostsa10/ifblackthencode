import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// criação das variáveis
		
		String Nome, Email;
		int Idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Olá! Digite o seu nome: ");
		Nome = teclado.nextLine();
		System.out.println("Agora digite o seu e-mail: ");
		Email = teclado.nextLine();
		System.out.println("Agora que temos esses dados, digite a sua idade: ");
		Idade = teclado.nextInt();
		
		//import da classe e seu respectivo método
		
		MandaMensagem executar = new MandaMensagem();
		
		executar.mensagem(Nome, Email, Idade);

	}

}
