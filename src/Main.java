import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		
		System.out.println("Jorge, Carlos, Samanta e Marcos sempre foram grandes amigos. Mesmo ap�s sua ascen��o econ�mica ainda continuaram com \n"
						 + "sua amizade. Cansados da monotonia e dos burocratas decidiram realizar uma excurs�o ao espa�o, ora, eles precisavam gastar \n"
						 + "seu dinheiro com alguma coisa, n�o � mesmo? Por�m algo atrapalhou seus planos de uma viagem perfeita, Marcos havia sido \n"
						 + "assassinado! Mas os �nicos presentes naquela nave eram os 4 amigos e voc�, o piloto. Vasculhe a nave, busque por pistas e \n"
						 + "descubra quem � o assassino antes que ele pegue voc�... \n");
		
		while(menu!= 0) {
			System.out.println("---Menu---");
			
			System.out.println("1- Sal�o Principal");
			System.out.println("2- Gerador");
			System.out.println("3- El�trica");
			System.out.println("4- �rea M�dica");
			System.out.println("5- Definir quem � o impostor");
			
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
						System.out.println("\nParab�ns, voc� descobriu o impostor!");
						menu = 0;
					}
					else {
						System.out.println("\nVoc� n�o descobriu o impostor. Tente novamente.");
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
			System.out.println("---Sal�o Principal---");
			
			System.out.println("1- Checar painel principal");
			System.out.println("2- Checar lixeira");
			System.out.println("3- Olhar de baixo da mesa");
			System.out.println("0- Sair desse c�modo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("O relat�ria da nave diz que Samanta � inocente.");
					break;
				}
				case 2:{
					System.out.println("N�o h� nada para ver aqui...");
					break;
				}
				case 3:{
					System.out.println("De baixo da mesa h� um bilhete que diz: 'Se jorge for inocente, ent�o Carlos n�o matou ningu�m na �rea m�dica.'");
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
			System.out.println("2- Checar a ventila��o");
			System.out.println("3- Olhar para o teto");
			System.out.println("0- Sair desse c�modo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("S� h� n�meros por aqui...");
					break;
				}
				case 2:{
					System.out.println("Acho que vi um rato passando por aqui...");
					break;
				}
				case 3:{
					System.out.println("No teto est� pichado: 'Se Samanta � inocente, ent�o ningu�m sabotou o gerador.'");
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
			System.out.println("---Sala da El�trica---");
			
			System.out.println("1- Checar o amontoado de fios");
			System.out.println("2- Verificar atr�s do maquin�rio");
			System.out.println("3- Abrir o disjuntor");
			System.out.println("0- Sair desse c�modo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("A disposi��o dos fios forma uma frase! 'Se ningu�m sabotou o gerador, ent�o Jorge estava aqui.'");
					break;
				}
				case 2:{
					System.out.println("Nada al�m de sujeira.");
					break;
				}
				case 3:{
					System.out.println("Voc� abre o disjuntor e toma um choque... Ai!");
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
			System.out.println("---�rea M�dica---");
			
			System.out.println("1- Checar o scanner");
			System.out.println("2- Olhar no painel m�dico");
			System.out.println("3- Verificar de baixo da cama");
			System.out.println("0- Sair desse c�modo.");
			
			System.out.println("Digite o local que deseja ir: ");
			
			menu = sc.nextInt();			
			
			switch(menu) {
				case 1:{
					System.out.println("Sua temperatura est� dentro do padr�o.");
					break;
				}
				case 2:{
					System.out.println("Ao inv�s de mostrar dados de pacientes, o painel diz: 'Carlos matou algu�m aqui ou Jorge n�o estava na el�trica.'");
					break;
				}
				case 3:{
					System.out.println("S� artefatos m�dicos por aqui...");
					break;
				}
				case 0:{
					
				}

				
			}
			System.out.println("");
		}
	}
	
}
