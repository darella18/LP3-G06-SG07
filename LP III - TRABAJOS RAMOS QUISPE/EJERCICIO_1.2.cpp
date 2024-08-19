#include <iostream>
using namespace std;

int sumaArreglo(int arreglo[], int tam) {
    int suma = 0;
    for (int i = 0; i < tam; i++) {
        suma += arreglo[i];
    }
    return suma;
}

int main() {
    int arreglo[] = {1, 2, 3, 4, 5};
    int tam = sizeof(arreglo) / sizeof(arreglo[0]);
    int suma = sumaArreglo(arreglo, tam);
    cout << "Suma del arreglo: " << suma << endl;
    return 0;
}