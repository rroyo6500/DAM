#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	int n, m, i, high;
	
	m = 0;
	i = 1;
	
	scanf("%d", &high);
	
	while (i <= high) {
		scanf("%d", &n);
		if (n > m) {
			m = n;
		}
		i += 1;
	}
	printf("%d es el maxim valor del enters llegits.", m);
	
	return 0;
}
