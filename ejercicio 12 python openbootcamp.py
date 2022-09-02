
# Online Python - IDE, Editor, Compiler, Interpreter

año = int(input ("dime un año"))

if año % 4 == 0 and (año % 100 or not año % 400):
    print ("es bisiesto")
else:
    print ("no es bisiesto")
