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
	
	
	//Crea una Functional Interface que continga un m�tode abstracte getPiValue () 
	//que retorna un valor double -> HECHO! M09_Fase2_PiValueInterface
	
	//en una altra classe, instancie la interf�cie i assigneu-li mitjan�ant una lambda el valor 3.1415.
	M09_Fase2_PiValueInterface myPiInterface= () -> 3.1415;
	
	//Invoca el m�tode getPiValue de la inst�ncia d'interf�cie i imprimeix el resultat.
	System.out.println("El valor que hem donat al retorn del m�tode 'getPiValue' es:");
	System.out.println(myPiInterface.getPiValue());
	}
}
