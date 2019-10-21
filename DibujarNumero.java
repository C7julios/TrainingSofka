public class DibujarNumero {

	private int[][] uno = {{0,0,0}, {0,0,1}, {0,0,1}};
    private int[][] two = {{0,1,0}, {0,1,1}, {1,1,0}};
    private int[][] three = {{0,1,0}, {0,1,1}, {0,1,1}};
    private int[][] four = {{0,0,0}, {1,1,1}, {0,0,1}};
    private int[][] five = {{0,1,0}, {1,1,0}, {0,1,1}};
    private int[][] six = {{0,1,0}, {1,1,0}, {1,1,1}};
    private int[][] seven = {{0,1,0}, {0,0,1}, {0,0,1}};
    private int[][] eight = {{0,1,0}, {1,1,1}, {1,1,1}};
    private int[][] nine = {{0,1,0}, {1,1,1}, {0,1,1}};
    private int[][] zero = {{0,1,0}, {1,0,1}, {1,1,1}};
    private String strCadena;

    /**
     *
     * Metodo encargado de converir el digito de la cadena en valor del display
     *
     */
        public void imprimirNumero() {
        	final int size = this.strCadena.length(); 
        	final int[][][] chars = new int[size][3][3]; 
        	int i, j, k;
        	
        	 for(i=0; i<size; i++){
                 if(this.strCadena.charAt(i)=='1') chars[i] = uno;
                 else if(this.strCadena.charAt(i)=='2') chars[i] = two;
                 else if(this.strCadena.charAt(i)=='3') chars[i] = three;
                 else if(this.strCadena.charAt(i)=='4') chars[i] = four;
                 else if(this.strCadena.charAt(i)=='5') chars[i] = five;
                 else if(this.strCadena.charAt(i)=='6') chars[i] = six;
                 else if(this.strCadena.charAt(i)=='7') chars[i] = seven;
                 else if(this.strCadena.charAt(i)=='8') chars[i] = eight;
                 else if(this.strCadena.charAt(i)=='9') chars[i] = nine;
                 else if(this.strCadena.charAt(i)=='0') chars[i] = zero;
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
        
