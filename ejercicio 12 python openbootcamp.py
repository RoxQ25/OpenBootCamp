
# Online Python - IDE, Editor, Compiler, Interpreter

def anobisiesto():
  ano: int = int(input(" Introduce un año "))

  if(ano % 4 == 0 and (ano % 100 != 0 or ano % 400 == 0)):
      print(f"El {ano} es bisiesto")
  else:
      print(f" El {ano} no es bisiesto")

print({anobisiesto()})
