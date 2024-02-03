import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.println("Para prosseguir responda sim ou não");
			 String resposta = sc.nextLine();
			  
			  if(resposta.equals("sim")) {
				  System.out.println("Obrigada pelo feedback!");
				  break;
			  }else if(resposta.equals("não")) {
				  System.out.println("Vamos aprimorar!");
				  break;
			  }else{
				  System.out.println("Resposta Invalida.");

			  }
		}
		sc.close();
    }
}
