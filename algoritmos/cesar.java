import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    //Se realiza el cifrado cesar con +25 mod 30 como unidad de desplazamiento, la llave para descifrar es +5 mod 30 
    static String simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";

    public static void main(String[] args) {
        String mensaje = ",P?IJNW.DZNWZWOJ.JN";
        System.out.println(decodificarMensaje(mensaje));
    }
    
     public static String decodificarMensaje(String s){
        String decoded_message = "";
        for (int i = 0; i < s.length(); i++) {
            int indice = (simbolos.indexOf(s.charAt(i))+5) % 30;
            decoded_message += simbolos.charAt(indice);
        }
        return decoded_message;
    }
}
