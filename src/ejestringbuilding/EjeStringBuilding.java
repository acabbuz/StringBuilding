package ejestringbuilding;

import java.util.Scanner;


public class EjeStringBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = new String("Cadena de texto");
		System.out.println(String.format("la variable cadena tiene id %s y contenido \'%s'",
		System.identityHashCode(cadena),cadena));
		
	cadena+=(".");
	
	System.out.println(String.format("la variable cadena tiene id %s y contenido \'%s'",
			System.identityHashCode(cadena),cadena));
	StringBuilder cadenaStringBuilder = new StringBuilder("");
	
	cadenaStringBuilder.append("shame ");
	System.out.println(String.format("la variable cadena tiene id %s y contenido \'%s'",
			System.identityHashCode(cadenaStringBuilder),cadenaStringBuilder));
	
	cadenaStringBuilder.append("on ");
	System.out.println(String.format("la variable cadena tiene id %s y contenido \'%s'",
			System.identityHashCode(cadenaStringBuilder),cadenaStringBuilder));
	
	cadenaStringBuilder.append("you!");
	System.out.println(String.format("la variable cadena tiene id %s y contenido \'%s'",
			System.identityHashCode(cadenaStringBuilder),cadenaStringBuilder));
	
	
	StringBuilder builder1 = new StringBuilder();
	StringBuilder builder2 = new StringBuilder(80);
	StringBuilder builder3 = new StringBuilder("Con contenido");
	builder1.append(builder3);
	System.out.println(builder1);
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Escriba su cadena: ");
	StringBuilder CadenaBuilder = new StringBuilder();
	CadenaBuilder.append(scanner.nextLine());
	
	System.out.println(StringBuildingFor(CadenaBuilder));
	}
	
	
	
public static StringBuilder StringBuildingFor(StringBuilder BuildCadena) {
	StringBuilder NewCadenaBuilder = new StringBuilder("");
	
	for (int i = 0; i< BuildCadena.length();i++) {
		NewCadenaBuilder.append(BuildCadena.charAt(i));
		System.out.println("Recorriendo cadena ........    " + NewCadenaBuilder);
	}
	System.out.println(
			"1. - Modificar cadena: \n"
			+ "2. - Borrar Cadena con .delete: \n" 
			+ "3. - Borrar Cadena con .setlength: \n");
	
	Scanner scanner = new Scanner(System.in);
	
	int selec = Integer.valueOf(scanner.nextLine());
	
	
	if(selec == 1) {
		System.out.println("¿Qué quieres introducir? : ");
		BuildCadena = BuildCadena.append(" " + scanner.nextLine());
		
	}else if(selec== 2){
		System.out.println("Borrando Cadena .......");
		BuildCadena = BuildCadena.delete(0, BuildCadena.length());
		System.out.println("Cadena Borrada");
	}else {
		System.out.println("Borrando Cadena .......");
		BuildCadena.setLength(0);
		System.out.println("Cadena Borrada");
		
	}
	return  BuildCadena;
	
}
}
