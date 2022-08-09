
public class MostraMensagem {

	public static void main(String[] args) {
		// Criando variáveis
		String nome="Carlos Tavares";
		int idade=25;
		
		int num1=10;
		int num2=20;
		int resultado=num2-num1,
		resultadoAd=num2+num1,
		resultadoMult=num2*num1,
		resultadoDiv=num2/num1;
	
		
		// Demonstração dos comentários
		System.out.println("Bem vindo, " + nome);
		System.out.println("Vamos fazer um suuuuper desenvolvimento em Java?!");
		System.out.println(nome + ", você tem " + idade + " anos");
		
		// Calculando váriaveis
		System.out.println("O resultado da subtração entre " + num2 + "-" + num1 + " é igual a " + resultado);
		System.out.println("O resultado da adição entre " + num2 + "+" + num1 + " é igual a " + resultadoAd);
		System.out.println("O resultado da multiplicação entre " + num2 + "*" + num1 + " é igual a " + resultadoMult);
		System.out.println("O resultado da divisão entre " + num2 + "÷" + num1 + " é igual a " + resultadoDiv);
	}

}
