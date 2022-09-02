
# Online Python - IDE, Editor, Compiler, Interpreter
class Alumno:
    def inicializar(self,nombre,nota):
        self.nombre=nombre
        self.nota=nota

    def imprimir(self):
               print("Nombre: ",self.nombre)
               print("Nota: ",self.nota)
 
    def resultado(self):
            if self.nota < 5:
                print("El alumno ha suspendido")
            else:
                print("El alumno ha aprobado")
 
alumno1=Alumno()
alumno2=Alumno()
 
alumno1.inicializar("Verónica",6)
alumno2.inicializar("Iago",8)
 
alumno1.imprimir()
alumno1.resultado()

alumno2.imprimir()
alumno2.resultado()