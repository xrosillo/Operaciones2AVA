package operaciones;

public class Operaciones2AVA {
    
    /**
     * Multiplica dos números.
     * @param num1 Primer operando
     * @param num2 Segundo operando
     * @return La multiplicación de ambos operandos
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
     * Dado dos números enteros, indica si el primero es divisible por el segundo
     * @param num1 Primer número
     * @param num2 Segundo número
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
     * Calcula el perímetro de un rectángulo.
     * @param base Base del rectángulo
     * @param altura Altura del rectángulo
     * @return El perímetro del rectángulo con las características dadas
     */
    public static int perimetroRectangulo(int base, int altura)
    {
        return base+altura*2;
    }
    
    /**
     * Devuelve un número al azar de un vector dado
     * @param vector Vector con números enteros
     * @return Número aleatorio del vector
     */
    public static int sacaNumeroAlAzar(int vector[])
    {
        return vector[(int)Math.floor(Math.random()* (vector.length-1))]-1;
    }   
    
}