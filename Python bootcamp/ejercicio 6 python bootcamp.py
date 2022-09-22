Python 3.10.6 (tags/v3.10.6:9c7b4bd, Aug  1 2022, 21:53:49) [MSC v.1932 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
peso = float(input("ingrese su peso en kg: \n"))
altura = float(input("ingrese su altura en m: \n"))

indice = float(peso/altura**2)

print ("su indice de masa corporal es ",(indice))
