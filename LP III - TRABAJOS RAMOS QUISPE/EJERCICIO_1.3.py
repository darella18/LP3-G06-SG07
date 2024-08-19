def suma_arreglo(arreglo):
    suma = 0
    for i in arreglo:
        suma += i
    return suma

arreglo = [1, 2, 3, 4, 5]
suma = suma_arreglo(arreglo)
print("Suma del arreglo:", suma)