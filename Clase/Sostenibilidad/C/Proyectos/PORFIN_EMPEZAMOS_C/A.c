#include <stdio.h>
#include <stdlib.h>

#define FISEC -1.0

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int low = 0;
	int high = 0;
	
	scanf("%d", &low);
	scanf("%d", &high);
	
	int i;
	for (i = low; i < high; i+=1) {
		int sum = 0;
		
		int x = 1;
		while (x < i) {
			if (i % x == 0) {
				sum += x;
			}
			x += 1;
		}
		
		if (i == sum) {
			printf("%d es un numero enter\n", i);
		}
				
	}
	
	return 0;
}
