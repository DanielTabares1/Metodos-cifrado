using System;

public class Test
{
    static string simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";
    
	public static void Main()
	{
	        //Se realiza el cifrado afin con la fórmula y = (7x+3) mod 30 y con llave de descifrado x = (13y +21) mod 30 
		string mensaje = "KXBELJMY?DJMDMQLYLJ";
		Console.WriteLine(decodificarMensaje(mensaje));
	}
	
	public static string decodificarMensaje(string s){
        string decoded_message = "";
        for (int i = 0; i < s.Length; i++) {
            /*int indice = Math.floorMod(simbolos.indexOf(s.charAt(i)) * 13 + 21, 30);*/
            int indice = (simbolos.IndexOf(s[i]) * 13 + 21) % 30;
            decoded_message += simbolos[indice];
        }
        return decoded_message;
    }
}
