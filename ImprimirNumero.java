import java.util.Scanner;

public class ImprimirNumero {
	
	public static void main(String[] args) {
		DibujarNumero dibujarNumero = new DibujarNumero();
		
		try (Scanner lector = new Scanner(System.in)) {

            System.out.print("Ingrese numero a imprimir: ");
            dibujarNumero.setStrCadena(lector.next());
            dibujarNumero.imprimirNumero();
                    
        }catch (Exception ex){
        	System.out.println("Error: "+ex.getMessage());
        }
	}

}
