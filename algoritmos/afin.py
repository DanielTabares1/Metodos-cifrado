simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";
mensaje = "KXBELJMY?DJMDMQLYLJ";
decoded_message = "";
for i in range(0, len(mensaje)):
    indice = (simbolos.index(mensaje[i]) * 13 + 21) % 30
    decoded_message += simbolos[indice]

print(decoded_message)
