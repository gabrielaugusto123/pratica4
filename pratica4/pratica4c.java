package pratica4;
import java.util.Scanner;
public class pratica4c {

	public static void main(String[] args) {
		String Frases;
		char c;
		int op,n,cont=0, numVogal=0, vogais=0, consoante=0;
		
		
		System.out.println("Digite uma frase para ser avaliada: ");
		Frases=ler.nextLine();
		
		do{
			System.out.println("(1) N�mero de senten�as (ponto final, exclama��o e interroga��o) ");
			System.out.println("(2) N�mero de Palavras ");
			System.out.println("(3) N�mero de Vogais ");
			System.out.println("(4) N�mero de Consoantes ");
			System.out.println("(5) Sair ");
			op=ler.nextInt();
		
			switch(op) {
				case 1:
					cont=0;
					n=(Frases.length());
					for(int i=0;i<n;i++) {
						if((Frases.charAt(i) == '.') || (Frases.charAt(i) == '?') || (Frases.charAt(i) == '!'));
						cont++;
					}
					System.out.println(" Numero de Frases � " + cont);
				break;
			
				case 2:
					int var = Frases.split(" ", -1).length - 1;
					System.out.println((var+1) + " palavras");
				break;
			
				case 3:
					vogais=0;
					Frases = Frases.toUpperCase();
					for(int i=0; i < Frases.length(); i++)
					{
						c=Frases.charAt(i);
						if(c == 'A' || c == 'E' || c =='I' || c == 'O' || c == 'U')
						{
							vogais++;
							
						}
					}
					System.out.println(vogais);	
				break;
			
				case 4:
					consoante=0;
					
					Frases = Frases.toUpperCase();
					for(int i=0; i < Frases.length(); i++)
					{
						c=Frases.charAt(i);
						if(c != 'A' || c != 'E' || c !='I' || c != 'O' || c != 'U')
						{
							consoante++;
							
						}
					}
					System.out.println(consoante);	
				break;
				case 5:
				break;
				default:
					System.out.print("Finalizado");
				
			}	
		
		
		}while(op!=5);
		}

	}


