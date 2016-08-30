package br.com.logicaoo.aula3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Estimativa {

	public static void main(String[] args){
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o n�mero de estimativa");
		int numeroDeEstimativas = sc.nextInt();
		for(int i=0;i<numeroDeEstimativas;i++){
			System.out.println("Digita a "+ i +" Estimativa");
			int estimativa = sc.nextInt();
			linkedList.add(estimativa);
		}
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		Integer maxima = null;
		Integer media = null;
		Integer minima = null;
		Integer soma = 0;
		for (Integer estimativa : linkedList){
			
		if (minima == null){
			minima = estimativa;
		}
		
		else{
			minima = Math.min(estimativa, minima);
		}
		
		if (maxima == null){
			maxima = estimativa;
		}
		
		else{
			maxima = Math.max(estimativa, maxima);
		}
		
		soma += estimativa;
		media = soma / numeroDeEstimativas ;
		}
		
		hashmap.put("maxima", maxima);
		hashmap.put("minima", minima);
		hashmap.put("media", media);
		
		for (String key : hashmap.keySet()){
			System.out.println("A"+key+" � : "+hashmap.get(key));
			//A classe e 
			//A interface Collection � a interface ra�z na hierarquia de cole��es. As interfaces Set e List estendem Collection.
			//A Interface Collection cont�m opera��es de adi��o, Limpeza e Compara��o e reten��o de objetos em uma cole��o, e o m�todo
			// iterator para obter uma cole��o iterator
			// A classe fornece os m�todos static para manipular cole��es
			
		}
	}
	
}
