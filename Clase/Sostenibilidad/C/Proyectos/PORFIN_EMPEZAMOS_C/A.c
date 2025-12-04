#include <stdio.h>
#include <stdlib.h>

#define FISEC -1.0

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	int high = 0;
	
	scanf("%d", &high);
	
	int sum = 0;
	
	for (int i = 1; i <= high; i += 1) {
		if (i % high == 0) {
			sum += i;
		}
	}
	
	if (sum == high) {
		printf("Numero perfecto: %d", high);
	}
	
	return 0;
}
