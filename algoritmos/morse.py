mensaje = "FENDSVTSLHW.EDATS,EULAY"
caracteres = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z _ , . ?"
morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. ..-- .-.- ---. ----".split()
numeros = "";
coded = "";

for i in range(0, len(mensaje)):
    indice = int(caracteres.index(mensaje[i]) / 2)
    numeros += str(len(morse[indice]))
    coded += morse[indice]
    
respuesta = ""

i = len(numeros) - 1

while(i>=0):
    j = int(numeros[i])
    subMorse = coded[0: j]
    coded = coded[j:]
    indice = morse.index(subMorse)
    respuesta += caracteres[indice * 2]
    i-=1
    
print(respuesta)