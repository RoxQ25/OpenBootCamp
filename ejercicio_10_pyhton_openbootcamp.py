
# Online Python - IDE, Editor, Compiler, Interpreter
import math

def area_triangulo (altura: float, base: float) -> float:
    return ((altura*base)/2)

def area_circulo (radio: float) -> float:
    return (math.pi*(radio**2))

print (f"Área de triángulo: {area_triangulo(5,7)}")
print (f"Área del círculo: {area_circulo(4)}")

