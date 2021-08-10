import java.util.Scanner;
public class AreaRectangulo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Proporciona el alto: ");
		int alto = sc.nextInt(); sc.nextLine();

		System.out.print("Proporciona el ancho: ");
		int ancho = sc.nextInt(); sc.nextLine();

		int area = alto * ancho;
		int perimetro = (alto*2) + (ancho*2);

		System.out.print("El area del rectangulo es: "+area+"\nEl perimetro del rectangulo es: "+perimetro);

	}
	
}