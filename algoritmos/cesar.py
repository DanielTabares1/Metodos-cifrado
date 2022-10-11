simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";
mensaje = ",P?IJNW.DZNWZWOJ.JN";
decoded_message = "";
for i in range(0, len(mensaje)):
    indice = (simbolos.index(mensaje[i])+5) % 30
    decoded_message += simbolos[indice]

print(decoded_message)
