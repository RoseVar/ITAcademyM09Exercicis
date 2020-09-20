package M09_app;

//Author: Roser Vargas

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class M09_Fase2app {

	public static void main(String[] args) {
	//FASE 2
	System.out.println("---- FASE 2 ----");	
	
	
	//Crea una Functional Interface que continga un mètode abstracte getPiValue () 
	//que retorna un valor double -> HECHO! M09_Fase2_PiValueInterface
	
	//en una altra classe, instancie la interfície i assigneu-li mitjançant una lambda el valor 3.1415.
	M09_Fase2_PiValueInterface myPiInterface= () -> 3.1415;
	
	//Invoca el mètode getPiValue de la instància d'interfície i imprimeix el resultat.
	System.out.println("El valor que hem donat al retorn del mètode 'getPiValue' es:");
	System.out.println(myPiInterface.getPiValue());
	}
}
