using System;

public class Test {
    public static void Main() {
        decrypt("FENDSVTSLHW.EDATS,EULAY");
    }

    public static void decrypt(string entrada) {
        string caracteres = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z _ , . ?";
        string[] morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. ..-- .-.- ---. ----".Split(" ");
        string numeros = "";
        string coded = "";

        for (int i = 0; i < entrada.Length; i++) {
            int indice = caracteres.IndexOf(entrada[i]) / 2;
            numeros += morse[indice].Length;
            coded += morse[indice];
        }

        string respuesta = "";


        for (int i = numeros.Length - 1; i >= 0; i--) {
            int j = Convert.ToInt32(Char.GetNumericValue(numeros[i])); //número de caracteres
            string subMorse = coded.Substring(0, j);
            coded = coded.Substring(j);
            int indice = Array.IndexOf(morse, subMorse);
            respuesta += caracteres[indice * 2];

        }
        Console.WriteLine(respuesta);
    }

}