#include <stdio.h>
#include <stdlib.h>

#define FISEC -1.0

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	int n;
	float alt, base, hipotenusa;
	
	n = 0;
	scanf("%f", &alt);
	
	while (alt != FISEC) {	
		scanf("%f", &base);
		scanf("%f", &hipotenusa);
		if (alt*alt + base*base == hipotenusa*hipotenusa) {
			n = n + 1;
		}
		scanf("%f", &alt);
	}
	
	printf("%f", n);
	
	return 0;
}
