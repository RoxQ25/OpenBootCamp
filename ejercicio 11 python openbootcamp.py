
# Online Python - IDE, Editor, Compiler, Interpreter

numero= int(input("Dime un número: "))
valor= range(2,numero)
contador = 0
for n in valor:
  if numero % n == 0:
    contador +=1
 
if contador > 0 :
  print("El número no es primo" )
else:
  print("El nÚmero es primo")

