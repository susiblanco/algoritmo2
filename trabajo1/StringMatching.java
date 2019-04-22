package trabajo1;

public class StringMatching {
	
	 /**
	 * Calcula String Matching usando Fuerza Bruta .
	 * @param text texto a analizar
	 * @param pattern patron a buscar en el texto
	 * @returns indice de la primera ocurrencia de pattern en text, en caso que exista,
	 * o −1 en caso que no se encuentre .
	 */

	public static int match( String text , String pattern ) {
		
		int textLength = text.length();
		int patternLength = pattern.length();
		
		for(int i=0;i<textLength-patternLength;i++){
			int j=0;
			
			while((j<patternLength) && (text.charAt(i+j) == pattern.charAt(j))){
				j++;
			}
			if(j == patternLength){
				return i;
			}
		}

		return -1; 
	}


	 /**
	 * Calcula String Matching usando Knuth−Morris−Pratt.
	 * @param text texto a analizar
	 * @param pattern patron a buscar en el texto
	 * @returns indice de la primera ocurrencia de pattern en text, en caso que exista,
	 * o −1 en caso que no se encuentre .
	 */
	 
	public static int matchKmp( String text , String pattern ) {
		
		int textLength = text.length();
		int patternLength = pattern.length();
		
		
		// construir vector salto a partir de pattern
		int[] salto = new int[patternLength];
		
        int j = 0; 
        // salto[0] siempre es 0 
        salto[0] = 0; 
        
        int i = 1;     
  
        // calcular salto[i] 
        while (i < patternLength) { 
            if (pattern.charAt(i) == pattern.charAt(j)) { 
                j++; 
                salto[i] = j; 
                i++; 
            } 
            else { 
              
                if (j != 0) { 
                    j = salto[j - 1]; 
                } 
                else { 
                    salto[i] = j; 
                    i++; 
                } 
            } 
        } 
        
        
        // buscar pattern en text
        
        j = 0; // indice pattern  
        i = 0; // indice text
        while (i < textLength) { 
            if (pattern.charAt(j) == text.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == patternLength) { 
                // patron encontrado i-j                
                return i-j;
            } 
  
            else if (i < textLength && pattern.charAt(j) != text.charAt(i)) { 
                if (j != 0){
                    j = salto[j - 1]; 
                }
                else{
                    i = i + 1;
                }     
            } 
        } 
		
		
		return -1; 
	}
	
  
}
