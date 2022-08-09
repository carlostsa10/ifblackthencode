import java.util.ArrayList;

public class OperacaoBancoDados {

	public static void main(String[] args) {
		// criação de procedimento de inserção de registros
		
		ArrayList<String> nomeClientes = new ArrayList<String>();
		nomeClientes.add("Carlitos");
		nomeClientes.add("Kris Evans");
		
		//visualiza todos os registros em forma de array
		System.out.println(nomeClientes);
		
		//localiza um tipo de registro
		
		System.out.println(nomeClientes.get(0)); 
		
		//inserção de registros com SET (substitui o arquivo com index)
		ArrayList<String> nomeMarcas = new ArrayList<String>();
		nomeMarcas.add("Dell");
		nomeMarcas.add("Ford");
		nomeMarcas.add("BMW");
		
		nomeMarcas.set(0, "HP");
		
		System.out.println(nomeMarcas);
		
		//removendo registros do ArrayList com remove
		
		System.out.println(nomeMarcas.size());
		//nomeMarcas.remove(2);
		System.out.println(nomeMarcas);
		
		//exemplo de impressão no laço de repetição
		
		for(String contador: nomeMarcas) {
			System.out.println(contador);
		}
		
		for(int contador=0; contador < nomeMarcas.size(); contador++) {
			System.out.println(nomeMarcas.get(contador));
		}

	}

}
