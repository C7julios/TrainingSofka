public class DibujarNumero {

	private int[][] uno = {{0,0,0}, {0,0,1}, {0,0,1}};
    private int[][] dos = {{0,1,0}, {0,1,1}, {1,1,0}};
    private int[][] tres = {{0,1,0}, {0,1,1}, {0,1,1}};
    private int[][] cuatro = {{0,0,0}, {1,1,1}, {0,0,1}};
    private int[][] cinco = {{0,1,0}, {1,1,0}, {0,1,1}};
    private int[][] seis = {{0,1,0}, {1,1,0}, {1,1,1}};
    private int[][] siete = {{0,1,0}, {0,0,1}, {0,0,1}};
    private int[][] ocho = {{0,1,0}, {1,1,1}, {1,1,1}};
    private int[][] nueve = {{0,1,0}, {1,1,1}, {0,1,1}};
    private int[][] cero = {{0,1,0}, {1,0,1}, {1,1,1}};
    private String strCadena;

    /**
     *
     * Es el Metodo encargado de converir el digito de la cadena en valor del display
     *
     */
        public void imprimirNumero() {
        	final int size = this.strCadena.length(); 
        	final int[][][] chars = new int[size][3][3]; 
        	int i, j, k;
        	
        	 for(i=0; i<size; i++){
                 if(getStrCadena().charAt(i)=='1') chars[i] = uno;
                 else if(getStrCadena().charAt(i)=='2') chars[i] = dos;
                 else if(getStrCadena().charAt(i)=='3') chars[i] = tres;
                 else if(getStrCadena().charAt(i)=='4') chars[i] = cuatro;
                 else if(getStrCadena().charAt(i)=='5') chars[i] = cinco;
                 else if(getStrCadena().charAt(i)=='6') chars[i] = seis;
                 else if(getStrCadena().charAt(i)=='7') chars[i] = siete;
                 else if(getStrCadena().charAt(i)=='8') chars[i] = ocho;
                 else if(getStrCadena().charAt(i)=='9') chars[i] = nueve;
                 else if(getStrCadena().charAt(i)=='0') chars[i] = cero;
                 else {
                	 throw new IllegalArgumentException("Cadena " + this.strCadena
                             + " no es un entero");
                 }
             }        	 
        	
        	 for (j = 0; j < 3; j++) {
                 for (i = 0; i < size; i++) {
                     for (k = 0; k < 3; k++) {
                         if (chars[i][j][k] == 1) {
                             if (k == 1) System.out.print("_");
                             else System.out.print("|");
                         }
                         else System.out.print(" ");
                     }
                     System.out.print(" ");
                 }
                 System.out.print("\n");
             }
        }
        
        public String getStrCadena() {
    		return strCadena;
    	}

    	public void setStrCadena(String strCadena) {
    		this.strCadena = strCadena;
    	}      
}
        
