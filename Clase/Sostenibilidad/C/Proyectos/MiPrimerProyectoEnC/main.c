#include <stdio.h> 

int main (int argc, char *argv[] ) {

	int numero;
	printf("Introduce un numero:");
	scanf("%d", &numero);

	for (int i = 1; i <= numero; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			printf("%d\t", j);
		}
		printf("\n");
	}

	return 0;
}
