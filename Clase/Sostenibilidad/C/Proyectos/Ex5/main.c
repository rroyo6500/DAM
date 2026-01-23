#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

#define FISEQ -1

int main(int argc, char *argv[]) {
	
	int numTelefon;
	int numTrucades, numTrucadesAltresOperadors, tempsTotal;
	char operadorPropi, operadorTrucat, espai;
	int i, diaI, horaI, minutI, segonI;
	int diaF, horaF, minutF, segonF;
	
	scanf("%d", &numTelefon);
	
	while(numTelefon != FISEQ) {
		
		printf("%d", numTelefon);
		
		scanf("%c", &espai);
		scanf("%c", &operadorPropi);
		
		scanf("%d", &numTrucades);
		numTrucadesAltresOperadors = 0;
		tempsTotal = 0;
		
		for(i = 1; i <= numTrucades; i+=1) {
			
			scanf("%d", &numTelefon);
			scanf("%c", &espai);
			scanf("%c", &operadorTrucat);
			scanf("%d", &diaI);
			scanf("%d", &horaI);
			scanf("%d", &minutI);
			scanf("%d", &segonI);
			
			scanf("%d", &diaF);
			scanf("%d", &horaF);
			scanf("%d", &minutF);
			scanf("%d", &segonF);
			
			if (numTrucadesAltresOperadors > 0) {
				printf("%f", (float) (tempsTotal) / (float) (numTrucadesAltresOperadors));
			} else {
				printf("%f", 0.0);
			}
			scanf("%d", &numTelefon);
			
		}
		
	}
	
	return 0;
}

int tempsTrucada(){
	
}
