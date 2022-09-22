
# Online Python - IDE, Editor, Compiler, Interpreter
def numeroprimo():
  numero: int = int(input('Introduce un número entero: '))

  if numero > 1:

    for i in range (2,int(numero)):
        if (int (numero) % i) == 0:
            print (f"el número {numero} no es primo. Es divisible entre {i}")
            break
        else:
            print (f"el número {numero} es primo")
  else:
    print (f"el {numero} no es primo. Los números primos son mayores que 1")

print ({numeroprimo ()})
     
  
