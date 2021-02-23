package operaciones;

public class Operaciones2AVA {
    
    /**
     * Multiplica dos n�meros.
     * @param num1 Primer operando
     * @param num2 Segundo operando
     * @return La multiplicaci�n de ambos operandos
     */
    public int multiplica(int num1, int num2)
    {
        int res=0;
        
        for(int i=0; i< num2; i++)
            res +=num1;
        
        return res;
    }
    
    /**
     * Invierte una cadena
     * @param cad Cadena a invertir
     * @return La cadena invertida
     */
    public String invierteCadena(String cad)
    {
        String cadInvertida="";
        for (int i = cad.length() -1; i >=0 ;i--)
		cadInvertida = cadInvertida + cad.charAt(i);
        return cadInvertida;
        
    }
    
    /**
     * Dado dos n�meros enteros, indica si el primero es divisible por el segundo
     * @param num1 Primer n�mero
     * @param num2 Segundo n�mero
     * @return True si es divisible, false si no lo es
     */
    public boolean isDivisble(int num1, int num2)
    {
        if (num1%num2==0)
            return true;
        else
            return false;
    }
    
    /**
     * Calcula el per�metro de un rect�ngulo.
     * @param base Base del rect�ngulo
     * @param altura Altura del rect�ngulo
     * @return El per�metro del rect�ngulo con las caracter�sticas dadas
     */
    public static int perimetroRectangulo(int base, int altura)
    {
        return base+altura*2;
    }
    
    /**
     * Devuelve un n�mero al azar de un vector dado
     * @param vector Vector con n�meros enteros
     * @return N�mero aleatorio del vector
     */
    public static int sacaNumeroAlAzar(int vector[])
    {
        return vector[(int)Math.floor(Math.random()* (vector.length-1))]-1;
    }   
    
}