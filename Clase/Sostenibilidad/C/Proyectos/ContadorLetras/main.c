#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

#define FISEQ '.'


int main(int argc, char *argv[]) {
	
	char actual, anterior;
	int repeticiones;
	
	repeticiones = 0;
	
	scanf(" %c", &actual);
	anterior = actual;
	
	while (actual != FISEQ) {
		
		if (actual == anterior) {
			repeticiones+=1;
		} else {
			printf("%c %d\n", anterior, repeticiones);
			repeticiones = 1;
			anterior = actual;
		}
		
		scanf(" %c", &actual);
		
	}
	
	printf("%c %d\n", anterior, repeticiones);
	
	return 0;
}
