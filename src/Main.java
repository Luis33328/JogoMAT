import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		
		System.out.println("Jorge, Carlos, Samanta e Marcos sempre foram grandes amigos. Mesmo após sua ascenção econômica ainda continuaram com \n"
						 + "sua amizade. Cansados da monotonia e dos burocratas decidiram realizar uma excursão ao espaço, ora, eles precisavam gastar \n"
						 + "seu dinheiro com alguma coisa, não é mesmo? Porém algo atrapalhou seus planos de uma viagem perfeita, Marcos havia sido \n"
						 + "assassinado! Mas os únicos presentes naquela nave eram os 4 amigos e você, o piloto. Vasculhe a nave, busque por pistas e \n"
						 + "descubra quem é o assassino antes que ele pegue você... \n");
		
		while(menu!= 0) {
			System.out.println("---Menu---");
			
			System.out.println("1- Salão Principal");
			System.out.println("2- Gerador");
			System.out.println("3- Elétrica");
			System.out.println("4- Área Médica");
			System.out.println("5- Definir quem é o impostor");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					salao();
					break;
				}
				case 2:{
					gerador();
					break;
				}
				case 3:{
					eletrica();
					break;
				}
				case 4:{
					medbay();
					break;
					
				}
				case 5:{
					System.out.println("Insira o nome do impostor: ");
					
					String resposta = sc.next().toUpperCase();
					
					if(resposta.equals("JORGE")) {
						System.out.println("\nParabéns, você descobriu o impostor!");
						menu = 0;
					}
					else {
						System.out.println("\nVocê não descobriu o impostor. Tente novamente.");
					}
					break;
			
				}
				case 0:{
					
				}
				
				
			}
			System.out.println("");
		}
		
	}
	
	public static void salao() {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		
		while(menu!= 0) {
			System.out.println("---Salão Principal---");
			
			System.out.println("1- Checar painel principal");
			System.out.println("2- Checar lixeira");
			System.out.println("3- Olhar de baixo da mesa");
			System.out.println("0- Sair desse cômodo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("O relatória da nave diz que Samanta é inocente.");
					break;
				}
				case 2:{
					System.out.println("Não há nada para ver aqui...");
					break;
				}
				case 3:{
					System.out.println("De baixo da mesa há um bilhete que diz: 'Se jorge for inocente, então Carlos não matou ninguém na área médica.'");
					break;
				}
				
				case 0:{
					
				}

				
			}
			System.out.println("");
		}
	}
	
	
	public static void gerador() {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		
		while(menu!= 0) {
			System.out.println("---Sala do Gerador---");
			
			System.out.println("1- Checar painel do gerador");
			System.out.println("2- Checar a ventilação");
			System.out.println("3- Olhar para o teto");
			System.out.println("0- Sair desse cômodo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("Só há números por aqui...");
					break;
				}
				case 2:{
					System.out.println("Acho que vi um rato passando por aqui...");
					break;
				}
				case 3:{
					System.out.println("No teto está pichado: 'Se Samanta é inocente, então ninguém sabotou o gerador.'");
					break;
				}
				case 0:{
					
				}

				
			}
			System.out.println("");
		}
	}
	
	
	public static void eletrica() {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		
		while(menu!= 0) {
			System.out.println("---Sala da Elétrica---");
			
			System.out.println("1- Checar o amontoado de fios");
			System.out.println("2- Verificar atrás do maquinário");
			System.out.println("3- Abrir o disjuntor");
			System.out.println("0- Sair desse cômodo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("A disposição dos fios forma uma frase! 'Se ninguém sabotou o gerador, então Jorge estava aqui.'");
					break;
				}
				case 2:{
					System.out.println("Nada além de sujeira.");
					break;
				}
				case 3:{
					System.out.println("Você abre o disjuntor e toma um choque... Ai!");
					break;
				}
				case 0:{
					
				}

				
			}
			System.out.println("");
		}
	}
	
	public static void medbay() {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		
		while(menu!= 0) {
			System.out.println("---Área Médica---");
			
			System.out.println("1- Checar o scanner");
			System.out.println("2- Olhar no painel médico");
			System.out.println("3- Verificar de baixo da cama");
			System.out.println("0- Sair desse cômodo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("Sua temperatura está dentro do padrão.");
					break;
				}
				case 2:{
					System.out.println("Ao invés de mostrar dados de pacientes, o painel diz: 'Carlos matou alguém aqui ou Jorge não estava na elétrica.'");
					break;
				}
				case 3:{
					System.out.println("Só artefatos médicos por aqui...");
					break;
				}
				case 0:{
					
				}

				
			}
			System.out.println("");
		}
	}
	
}
