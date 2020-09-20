package M09_app;

//Author: Roser Vargas

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class M09_Fase3app {

	public static void main(String[] args) {
	//FASE 2
	System.out.println("---- FASE 3 ----");	
	
	
	//Crea una Functional Interface que continga un mètode abstracte reverse (), 
	//que retorne un valor String --> HECHO! M09_fase3_StringInterface
	
	//en una altra classe, injecta a la interfície creada mitjançant una lambda el cos del mètode, 
	//de manera que torne la mateixa cadena que rep com a paràmetre però a l'inrevés. 	
	M09_Fase3_StringInterface myReverseStringInterface= (cadena) -> { 
        String result = "";
        for(int i = cadena.length()-1; i >= 0; i--) {
           result += cadena.charAt(i);}
        return result;	
     };
			
			
	//Invoca la instància de la interfície passant-li una cadena i comprovant el resultat.
     System.out.println("Provarem quin es el revers de la paraula 'pandemia'.");
     System.out.println("El revers és: "+ myReverseStringInterface.reverse("pandemia") +".");
	}
}
