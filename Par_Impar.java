/*Escreva uma função banana ordernar(lista) que recebe como parâmetro uma lista de inteiros não negativos. E ordene a lista de forma 
 que os pares fiquem em ordem crescente e depois os ímpares em ordem decrescente. 
 link= https://sandbox.letscode.com.br/exercicio/15eed6ab-11dd-4e32-8fa8-51b80a1cf96a */

package exemplos_diversos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Par_Impar {

	public static void main(String[] args) {
		
		List<Integer> par = Arrays.asList(4, 32, 34, 3456, 654, 98);
		List<Integer> impar = Arrays.asList(543, 567, 87, 6789);
		
		Collections.sort(par);
		Collections.sort(impar, Collections.reverseOrder());
		
		List<Integer> total = Stream.concat(par.stream(), impar.stream()).collect(Collectors.toList());
		System.out.println(total);
		
		
	
		

	}

}
