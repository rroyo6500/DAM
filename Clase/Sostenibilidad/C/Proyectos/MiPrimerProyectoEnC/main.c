#include <stdio.h> 

int main (int argc, char *argv[] ) {
	
	int n1 = 0, n2 = 0, n3 = 0;
	
	printf("introduce el valor del numero 1: ");
	scanf("%d", &n1);
	
	printf("introduce el valor del numero 2: ");
	scanf("%d", &n2);

	printf("introduce el valor del numero 3: ");
	scanf("%d", &n3);
	
	int resultado = n1 + n2 + n3;
	
	printf("El resultado de la suma es: %d", resultado);
	
	return 0;
}
