package aula3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int command;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("-----------------------");
		System.out.println("MENU DOS CACHORROS");
		System.out.println("Selecione a opção: ");
		System.out.println("-----------------------");
		System.out.println("1-Listar todos os cachorros");
		System.out.println("2- Listar um cachorro");
		System.out.print("Opção escolhida:");
		command = leitor.nextInt();
		
		
		//cria o objeto
		Cachorro c1 = new Cachorro ("Fifi", 15, 1, "bege", "pretos", 5.5);
		Cachorro c2 = new Cachorro ("Lula", 2, 3, "preto", "hazel", 10.9);
		
		//--------------------------------------------------------------------------
		//OPÇÃO 1 ESCOLHIDA
		//--------------------------------------------------------------------------
		if (command == 1) {
		int change = 0;
		
		//lista os cachorros
		System.out.println("\n-----------------------");
		System.out.println("Cachorro 1");
		System.out.println("-----------------------");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("-----------------------");
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("-----------------------");
		System.out.println("Comprimento pelos: " + c1.getCompPelos());
		System.out.println("-----------------------");
		System.out.println("Cor dos pelos: " + c1.getCorPelos());
		System.out.println("-----------------------");
		System.out.println("Cor dos olhos: " + c1.getCorOlhos());
		System.out.println("-----------------------");
		System.out.println("Peso: " + c1.getPeso());
		System.out.println("-----------------------");
		
		System.out.println("\n-----------------------");
		System.out.println("Cachorro 2");
		System.out.println("-----------------------");
		System.out.println("Nome: " + c2.getNome());
		System.out.println("-----------------------");
		System.out.println("Idade: " + c2.getIdade());
		System.out.println("-----------------------");
		System.out.println("Comprimento pelos: " + c2.getCompPelos());
		System.out.println("-----------------------");
		System.out.println("Cor dos pelos: " + c2.getCorPelos());
		System.out.println("-----------------------");
		System.out.println("Cor dos olhos: " + c2.getCorOlhos());
		System.out.println("-----------------------");
		System.out.println("Peso: " +c2.getPeso());
		System.out.println("-----------------------");
		
		System.out.println("Alterar dados?");
		System.out.println("1- SIM");
		System.out.println("2- NÃO");
		System.out.print("Opção escolhida:");
		
		change = leitor.nextInt();
		
		//--------------------------------------------------------------------------
		//OPÇÃO ALTERAR DADOS SELECIONADA
	    //--------------------------------------------------------------------------
		   if (change == 1) {
			   int order = 0;
			   System.out.println("\n-----------------------");
			   System.out.println("Selecione o animal:");
			   System.out.println("-----------------------");
			   System.out.println("1- Cachorro 1");
			   System.out.println("2- Cachorro 2");
			   System.out.println("-----------------------");
			   
			   order = leitor.nextInt();
		 //--------------------------------------------------------------------------
		 //ALTERAR DADOS CACHORRO 1
		 //--------------------------------------------------------------------------	   
			   if (order == 1 ) {
				   
				   int ordem;
				   
				   System.out.println("\n-----------------------");
				   System.out.println("1- Alterar idade");
				   System.out.println("2- Alterar peso");
				   System.out.println("-----------------------");
				   System.out.println("Selecione o objeto:");
				   System.out.println("-----------------------");		   
				   ordem = leitor.nextInt();
				   
		//***********************
		//ALTERAR IDADE CACHORRO 1
		//***********************
				   
				   if (ordem == 1){
				   int newIdade;
				   
				   System.out.println("Digite a nova idade: ");
				   newIdade = leitor.nextInt();
				   
				   c1.setIdade(newIdade);
				   
				   System.out.println("A idade foi atualizada: " + newIdade);
				   }
				   
		//***********************
		//ALTERAR PESO CACHORRO 1
		//***********************	
				   
			   if (ordem == 2) {
				   int newPeso;
				   
				   System.out.println("Digite o novo peso ");
				   newPeso = leitor.nextInt();
				   
				   c1.setPeso(newPeso);
				   
				   System.out.println("O peso foi atualizado: " + newPeso);
			   }
			   
		//--------------------------------------------------------------------------
		//ALTERAR DADOS CACHORRO 2
		//--------------------------------------------------------------------------	   
			 }
             if (order == 2 ) {
				   
				   int ordem;
				   
				   System.out.println("\n-----------------------");
				   System.out.println("1- Alterar idade");
				   System.out.println("2- Alterar peso");
				   System.out.println("-----------------------");
				   System.out.println("Selecione o objeto:");
				   System.out.println("-----------------------");
				   
				   ordem = leitor.nextInt();
				   
		    //***********************
			//ALTERAR IDADE CACHORRO 2
			//***********************
				   
				   if (ordem == 1){
				   int newIdade;
				   
				   System.out.println("Digite a nova idade: ");
				   newIdade = leitor.nextInt();
				   
				   c2.setIdade(newIdade);
				   
				   System.out.println("A idade foi atualizada: " + newIdade);
				   }
				   
			//***********************
			//ALTERAR PESO CACHORRO 2
			//***********************
				   
			   if (ordem == 2) {
				   int newPeso;
				   
				   System.out.println("Digite o novo peso ");
				   newPeso = leitor.nextInt();
				   
				   c2.setPeso(newPeso);
				   
				   System.out.println("O peso foi atualizado: " + newPeso);
			   }
			   
			   
			 }
		   }
		}
		
		//--------------------------------------------------------------------------
		//OPÇÃO 2 MENU
		//--------------------------------------------------------------------------
		
		if (command == 2) {
			int x;
			System.out.println("Deseja listar qual cachorro?");
			System.out.println("1- Cachorro 1");
			System.out.println("1- Cachorro 1");
			x = leitor.nextInt();
			
			if (x == 1) {
				System.out.println("\n-----------------------");
				System.out.println("Cachorro 1");
				System.out.println("-----------------------");
				System.out.println("Nome: " + c1.getNome());
				System.out.println("-----------------------");
				System.out.println("Idade: " + c1.getIdade());
				System.out.println("-----------------------");
				System.out.println("Comprimento pelos: " + c1.getCompPelos());
				System.out.println("-----------------------");
				System.out.println("Cor dos pelos: " + c1.getCorPelos());
				System.out.println("-----------------------");
				System.out.println("Cor dos olhos: " + c1.getCorOlhos());
				System.out.println("-----------------------");
				System.out.println("Peso: " + c1.getPeso());
				System.out.println("-----------------------");
			}
			if (x == 2) {

				System.out.println("\n-----------------------");
				System.out.println("Cachorro 2");
				System.out.println("-----------------------");
				System.out.println("Nome: " + c2.getNome());
				System.out.println("-----------------------");
				System.out.println("Idade: " + c2.getIdade());
				System.out.println("-----------------------");
				System.out.println("Comprimento pelos: " + c2.getCompPelos());
				System.out.println("-----------------------");
				System.out.println("Cor dos pelos: " + c2.getCorPelos());
				System.out.println("-----------------------");
				System.out.println("Cor dos olhos: " + c2.getCorOlhos());
				System.out.println("-----------------------");
				System.out.println("Peso: " +c2.getPeso());
				System.out.println("-----------------------");
			}
}
}
}
