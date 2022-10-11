import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static String simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";

    
	public static void main (String[] args) throws java.lang.Exception
	{
	    //Se realiza el cifrado afin con la fórmula y = (7x+3) mod 30 y con llave de descifrado x = (13y +21) mod 30 
	    String mensaje = "KXBELJMY?DJMDMQLYLJ";
            System.out.println(decodificarMensaje(mensaje));
	}
	
	public static String decodificarMensaje(String s){
        String decoded_message = "";
        for (int i = 0; i < s.length(); i++) {
            /*int indice = Math.floorMod(simbolos.indexOf(s.charAt(i)) * 13 + 21, 30);*/
            int indice = (simbolos.indexOf(s.charAt(i)) * 13 + 21) % 30;

            decoded_message += simbolos.charAt(indice);
        }
        return decoded_message;
    }
	
}
