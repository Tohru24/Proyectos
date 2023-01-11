operacionA= 2
operacionB= 5
suma= operacionA + operacionB
#Print con Format
print(f'Resultado suma: { suma }')
multiplicacion= operacionA * operacionB
print(f'Resultado multiplicacion: { multiplicacion }')
divisionEntera= operacionB//operacionA
print(f'Resultado division Entera: { divisionEntera }')
modulo=operacionB%operacionA
print(f'Resultado modulo: { modulo }')
exponente=operacionA**operacionB
print(f'Resultado Exponente: { exponente }')

ancho=int(input("Ingrese el ancho del rectangulo: "))
largo=int(input("Ingrese el largo del rectangulo: "))
perimetro=largo*2+ancho*2
print(f'El perimetro del rectangulo es: { perimetro }')
area=largo*ancho
print(f'El area del rectangulo es: { area }')
d = {'k1':[1,2,3,{'difícil':['que','significa','esto',{'casi':[0,1,2,3,'hola']}]}]}