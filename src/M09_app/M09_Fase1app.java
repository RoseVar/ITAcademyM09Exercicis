package M09_app;

//Author: Roser Vargas

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class M09_Fase1app {

	public static void main(String[] args) {
	//FASE 1
	System.out.println("---- FASE 1 ----");	
	
	
	System.out.println("---Ejercici 1: noms que comencin per A---");
	//• Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una llista de totes 
	//les cadenes que comencen amb la lletra 'a' (mayuscula) i tenen exactament 3 lletres. Imprimeix el resultat.

	//creo la lista (sólo tiene 1 nombre que empiece con "A")
	List<String> nomsPropis = crearListaNombresPropios();
	System.out.println("-Llista de noms original:");
	for (String s: nomsPropis) {
		System.out.print(s+", ");
	}
	
	//ejecuto sobre ella: obtener un stream, filtrarlo obteniendo otro stream e imprimir por consola
	System.out.println("\n-Llista de noms filtrada:");
	nomsPropis.stream()
			.filter(
					(s)->s.startsWith("A")
					&& s.length()==3)
			.forEach(s->System.out.print(s +", "));
	System.out.println("\n");

	
	System.out.println("---Ejercici 2: números parells amb 'e' i números senars amb 'o'---");	
	//• Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers. 
	//Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell, i precedit de la lletra "o" 
	//si el nombre és imparell. Per exemple, si la llista d'entrada és (3,44), la sortida hauria de ser "o3, e44". 
	//Imprimeix el resultat.
	
	//creo la lista de Integers y la instancio via función
	List<Integer> llistaIntegers = crearListaIntegers();
	System.out.println("-Llista de números original:");
	llistaIntegers.forEach(s->System.out.print(s+ ", "));

	//lista de Strings para solución
	List<String> llistaIntegersString= new ArrayList(); 
	
	//ejecuto sobre la original: obtener un stream,  y aplicarle un foreach con un consumidor
	//que hará que por cada número recibido valore si es par/impar y según lo que sea lo añada a la lista nueva pero 
	//con la modificación de añadirle la letra (siendo entonces un String)
	llistaIntegers.stream().forEach(new Consumer<Integer>() {
		@Override
		public void accept(Integer num) {
		    if(num % 2 == 0) {
		    	llistaIntegersString.add("e"+String.valueOf(num));
		    } else {
		    	llistaIntegersString.add("o"+String.valueOf(num));
		    }//			
		}
		
	});
	System.out.println("\n-Llista de números treballada:");
	for (String i:llistaIntegersString ) {
		System.out.print(i + ", ");
	}
	System.out.println("\n");
	

	System.out.println("---Ejercici 3: strings que continguin la lletra 'o'---");
	//• Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les cadenes que continguen 
	//la lletra ‘o’ i imprimeix el resultat.
	
	//creo la lista
	List<String> stringsAmbLletraO = crearListaStringsVariados();
	System.out.println("-Llista de strings original:");
	for (String s: stringsAmbLletraO) {
		System.out.print(s+", ");
	}
	
	//ejecuto sobre ella: obtener un stream, filtrarlo obteniendo otro stream e imprimir por consola
	System.out.println("\n-Llista de strings filtrada:");
	stringsAmbLletraO.stream()
			.filter(
					(s)->s.contains("o"))
			.forEach(s->System.out.print(s+", "));
	System.out.println("\n");

	System.out.println("---Ejercici 4: strings que tinguin més de 5 lletres (farem 5 o més)---");		
	//• Has de fer el mateix que en el punt anterior, però retornant una llista que incloga els elements amb més 
	//de 5 lletres. Imprimeix el resultat.
	
	//Podría usar la lista anterior (la variable), pero creo una nueva
	List<String> stringsVariats = crearListaStringsVariados();
	System.out.println("-Llista de strings original:");
	for (String s: stringsVariats) {
		System.out.print(s+", ");
	}
	
	//ejecuto sobre ella: obtener un stream, filtrarlo obteniendo otro stream e imprimir por consola
	System.out.println("\n-Llista de strings filtrada:");
	stringsAmbLletraO.stream()
			.filter(
					(s)->(s.length()>=5))
			.forEach(s->System.out.print(s + ", "));
	System.out.println("\n");
	
	System.out.println("---Ejercici 5: strings mesos de l'any amb lambda---");		
	//• Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
	
	//crear la llista 
	List<String> stringsMesosAny = crearMesosAny();
	
	//ejecuto sobre ella: obtener un stream e imprimir por consola
	stringsMesosAny.stream().
			forEach(s->System.out.println(s));
	System.out.println();
	
	
	System.out.println("---Ejercici 6: strings mesos de l'any amb method reference---");	
	//• Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference.
	
	//No creo que la lista porque es la misma que en el ejercicio anterior, así que uso esa variable	
	//y mando a imprimir su contenido
	stringsMesosAny.forEach(System.out::println);
	
	
	}

	//-----------Métodos auxiliares
	/**
	 * Método auxiliar para crear una Lista con los meses del año
	 * @return List con los meses del año
	 */
	private static List<String> crearMesosAny() {
		List<String> prov= new ArrayList<String>();
		prov.add("Enero");
		prov.add("Febrero");
		prov.add("Marzo");
		prov.add("Abril");
		prov.add("Mayo");		
		prov.add("Junio");
		prov.add("Julio");
		prov.add("Agosto");
		prov.add("Septiembre");
		prov.add("Octubre");		
		prov.add("Noviembre");
		prov.add("Diciembre");
		return prov;
	}


	/**
	 * Método auxiliar para crear una lista de strings variados
	 * que contengan alguna palabra con la letra 'o' y alguna 
	 * con 5 o más caracteres
	 * @return Lista de strings variados
	 */
	private static List<String> crearListaStringsVariados() {
		List<String> prov= new ArrayList<String>();
		prov.add("Casa");
		prov.add("Silla");
		prov.add("Mesa");
		prov.add("Lampara");
		prov.add("Sofa");		
		prov.add("Cojin");
		return prov;
	}


	/**
	 * Método auxiliar para crear una lista de Integers
	 * que contenga tanto números pares como impares
	 * @return Lista de Integeres variados
	 */
	private static List<Integer> crearListaIntegers() {
		List<Integer> prov= new ArrayList<Integer>();
		prov.add((Integer)1);
		prov.add((Integer)5);
		prov.add((Integer)3);
		prov.add((Integer)2);
		prov.add((Integer)10);		
		return prov;
	}
	
			
	/**
	 * Método auxiliar para crear una lista de nombres, 
	 * alguno de los cuales empiece por la letra "A"
	 * @return lista de nombres propios
	 */
	private static List<String> crearListaNombresPropios() {
		List<String> prov= new ArrayList<String>();
		prov.add("Ana");
		prov.add("Helena");
		prov.add("Marta");
		prov.add("Raquel");
		prov.add("Susana");
		return prov;
	}
}
