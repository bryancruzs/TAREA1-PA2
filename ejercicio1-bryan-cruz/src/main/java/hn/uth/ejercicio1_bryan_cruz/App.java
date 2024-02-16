package hn.uth.ejercicio1_bryan_cruz;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ){
 	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);  
 	 
     double base=0,altura=0;
     boolean salir=false;
while(!salir) {
     System.out.println( "Menu" );
     System.out.println("1.-Calcular Area de un Circulo \n2.-Calcular Area de un Cuadrado \n3.-Calcular el área de un rectángulo \n4.-Calcular el área de un Triangulo\n5.-Salir" );
     System.out.println( "Digite una Opcion");
     int opcion=scanner.nextInt();
     switch(opcion) {
     case 1:
    	 System.out.println("Ingrese la Radio");
    	  base=scanner.nextInt();
//    	 System.out.println("El area de un circulo es:"+AreaCirculo(base));
    	 break;
     case 2:
    	 System.out.println("Ingrese la Un lado altura o base");
    	 base=scanner.nextInt();

       	System.out.println("El area de un Cuadrado es:"+AreaCuadrado(base));
    	 break;
     case 3:
    	 System.out.println("Ingrese la base");
    	 base=scanner.nextInt();
       	 System.out.println("Ingrese la altura");
       	 altura=scanner.nextInt();
       	System.out.println("El area de un Rectangulo es:"+AreaRectangulo(base,altura));
    	 break;
     case 4:
    	 System.out.println("Ingrese la base");
    	 base=scanner.nextInt();
       	 System.out.println("Ingrese la altura");
       	 altura=scanner.nextInt();
       	System.out.println("EL area de un triangulo es:"+AreaTriangulo(base,altura));
     break;
     case 5:
    	 salir=true;
    	 break;
    	 default:
    		 System.out.println("Las opciones son de 1 a 5");
     }
   
}  
System.out.println("FIN DEL MENU");
    }
/**
 * Este metodo calcula el areade un circulo
 * @param radio
 * @return
*/ 
    static void  suma() {
    	
    }
	public static double AreaCirculo(double radio ) {
	
		double area=(3.14*(Math.pow(radio, 2)));
		return area;
	}

	public static double AreaCuadrado(double lado1) {		
			return lado1*lado1;
		}

	public static double AreaRectangulo(double base,double altura) {		
		return base*altura;
	}
	
	public static double AreaTriangulo(double base,double altura) {		
		return (base*altura)/2;
	}
	
public static double restar(double d, double e) {
	// TODO Auto-generated method stub
	return d-e;
}
public static double Multiplicar(int i, int j) {
	// TODO Auto-generated method stub
	return i*j;
}
public static double Dividir(int i, int j) {
	// TODO Auto-generated method stub
	return i/j;
}

}
