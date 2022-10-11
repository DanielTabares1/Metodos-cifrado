using System;

public class Test
{
    static string simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";
    
	public static void Main()
	{
		string mensaje = ",P?IJNW.DZNWZWOJ.JN";
		Console.WriteLine(decodificarMensaje(mensaje));
	}
	
	public static string decodificarMensaje(string s){
        string decoded_message = "";
        for (int i = 0; i < s.Length; i++) {
            /*int indice = Math.floorMod(simbolos.indexOf(s.charAt(i)) * 13 + 21, 30);*/
            int indice = (simbolos.IndexOf(s[i]) + 5) % 30;
            decoded_message += simbolos[indice];
        }
        return decoded_message;
    }
}
