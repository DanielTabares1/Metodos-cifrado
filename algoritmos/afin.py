#Se realiza el cifrado afin con la fórmula y = (7x+3) mod 30 y con llave de descifrado x = (13y +21) mod 30 
simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,_.?";
mensaje = "KXBELJMY?DJMDMQLYLJ";
decoded_message = "";
for i in range(0, len(mensaje)):
    indice = (simbolos.index(mensaje[i]) * 13 + 21) % 30
    decoded_message += simbolos[indice]

print(decoded_message)
