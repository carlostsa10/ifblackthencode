import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<String>();
        int op, id;
        String nome;

        System.out.println("------Controle de Frutas--------");

        do {
            System.out.println("Digite [1] - Cadastrar Frutas");
            System.out.println("Digite  [2] - Para listar Frutas");
            System.out.println("Digite  [3] - Excluir uma fruta");
            System.out.println("Digite  [4] - Listar Frutas uma fruta");
            System.out.println("Digite  [5] - alterar a Fruta");
            System.out.println("Digite  [0] - Sair");
            
            op = teclado.nextInt();

            switch(op) {
            
                case 1:
                    System.out.print("Entre com uma fruta:");
                    nome = teclado.next();
                    
                    if (nome != "")
                    {
                        frutas.add(nome);
                        System.out.println("Fruta adicionada com sucesso!");
                        System.out.println("");
                        
                    }
                    
                    break;
                    
                case 2:
                	
                    System.out.println("Lista de Frutas:");
                    System.out.println(frutas);
                    System.out.println("");
                    
                    break;
                    
                case 3:
                	
	                    System.out.println("Escolha a fruta: ");  
	                    id = teclado.nextInt();
	                    frutas.remove(id);
	                    System.out.println("Fruta excluida com sucesso!");
	                    System.out.println("");
                    
                    break;
                    
                case 4:
                	
                    System.out.println("Escolha sua fruta: ");
                    id = teclado.nextInt();
                    System.out.println("Fruta escolhida = " + (frutas.get(id)));
                    
                    break;
                    
                case 5:
                	
                    System.out.println("Alterar fruta: ");
                    id = teclado.nextInt();
                    nome = teclado.next();
                    frutas.set(id, nome);
                    
                    System.out.println("Voce alterou  fruta!");
                    break;
                    
            }
            
        } while(op != 0);
        
        teclado.close();
    }

	
}

