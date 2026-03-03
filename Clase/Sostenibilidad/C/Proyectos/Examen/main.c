#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void sumarPares (int n, int *suma);

int main(int argc, char *argv[]) {
	
	int n;
	int resultado;
	int suma;
	
	suma = 0;
	printf("n: ");
	scanf("%d", &n);
	
	sumarPares(n, &suma);
	
	printf("Resultado: ");
	scanf("%d", &resultado);
	
	if (suma == resultado) {
		printf("S\n");
	} else {
		printf("N\n");
	}
	
	return 0;
}

void sumarPares (int n, int *suma) {
	int i;
	i = 1;
	
	while (i <= n) {
		if (i % 2 == 0) {
			*suma = *suma + i;
		}
		i = i + 1;
	}
	
}
