import time

hora = time.strftime ("%H%")
minutos = time.strftime ("%M")

if int (hora) >= 19:
	print ("Es hora de irse a casa") 
else:
	print ("Quedan {} horas y {} minutos para irnos a casa".format(18- int(hora), 59-int(minutos)))
