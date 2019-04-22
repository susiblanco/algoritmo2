package trabajo1;

public class LongestRepetition {
	
	/**
	* Calcula Longestrepetition usando FuerzaBruta.
	*@param text texto a analizar
	*@returns subString de mayor longitud que se repite.
	*/
	public static String repetition ( String text ) {
		int n = text.length(); 
		
		String sr = "";
		
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				if(text.charAt(i)==text.charAt(j)){
					int k=0;
					while((k<(j-i))&&((j+k)<n)){
						if(text.charAt(i+k)==text.charAt(j+k)){
							k++;
							if(((i+k)==j)&&((k)>sr.length())){
								sr = String.valueOf(text.toCharArray(),i,k);
							}
						}
						else{
							break;
						}
					}				
				}						
			}
		}
	  
		return sr;  
	}
	
	/**
	* Calcula Longestrepetition usando D&C.
	*@param text texto a analizar
	*@returns subString de mayor longitud que se repite.
	*/
	public static String repetitionDc ( String text ) {
		
		int n = text.length();
		
		if (n == 1){
			return " ";
		}
		
		int nu = n / 2;
		int nv = n - nu;
		String u = text.substring(0, nu);
		String v = text.substring(nu);
		
		String ru = repetitionDc(u);
		String rv = repetitionDc(v);
		
		return "MainLorentz" ;
	}
	
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int[] z(String s) {
	    int n = s.length();
	    int[] z = new int[n];
	    for (int i = 1, l = 0, r = 0; i < n; ++i) {
	        if (i <= r)
	            z[i] = min (r - i + 1, z[i - l]);
	        while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
	            ++z[i];
	        if (i + z[i] - 1 > r) {
	            l = i;
	        	r = i + z[i] - 1;
	        }
	    }
	    return z;
	}
	
}
