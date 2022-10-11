public class Main {
    public static void main(String[] args) {
        decrypt("FENDSVTSLHW.EDATS,EULAY");
    }

    public static void decrypt(String entrada) {
        String caracteres = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z _ , . ?";
        String[] morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. ..-- .-.- ---. ----".split(" ");
        String numeros = "";
        String coded = "";

        for (int i = 0; i < entrada.length(); i++) {
            int indice = caracteres.indexOf(entrada.charAt(i)) / 2;
            numeros += morse[indice].length();
            coded += morse[indice];
        }

        String respuesta = "";


        for (int i = numeros.length() - 1; i >= 0; i--) {
            int j = Integer.parseInt(String.valueOf(numeros.charAt(i))); //número de caracteres
            String subMorse = coded.substring(0, j);
            coded = coded.substring(j);
            int indice = indice(subMorse);

            respuesta += caracteres.charAt(indice * 2);

        }

        System.out.println(respuesta);
    }

    public static int indice(String letra) {
        String[] morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. ..-- .-.- ---. ----".split(" ");
        for (int i = 0; i < morse.length; i++) {
            if (morse[i].equals(letra)) {
                return i;
            }
        }
        return -1;
    }


}