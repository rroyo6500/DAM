#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

#define FISEQ -1
#define SEGONS_DIA 86400

int main(int argc, char *argv[]) {
	
	int numTelefon;
	int numTrucades, numTrucadesAltresOperadors, tempsTotal;
	char operadorPropi, operadorTrucat, espai;
	int i, diaI, horaI, minutI, segonI;
	int diaF, horaF, minutF, segonF;
	
	printf("Numero de telefon: ");
	scanf("%d", &numTelefon);
	
	while(numTelefon != FISEQ) {
		
		printf("%d\n", numTelefon);
		
		printf("Espai: ");
		scanf("%c ", &espai);
		printf("Operador propi: ");
		scanf("%c ", &operadorPropi);
		
		fflush(stdin);
		
		printf("Numero de trucades: ");
		scanf("%d", &numTrucades);
		numTrucadesAltresOperadors = 0;
		tempsTotal = 0;
		
		for(i = 1; i <= numTrucades; i+=1) {
			
			printf("Numero de telefon: ");
			scanf("%d", &numTelefon);
			printf("Espai: ");
			scanf("%c ", &espai);
			printf("Operador trucat: ");
			scanf("%c ", &operadorTrucat);
			printf("Dia I: ");
			scanf("%d", &diaI);
			printf("Hora I: ");
			scanf("%d", &horaI);
			printf("Minut I: ");
			scanf("%d", &minutI);
			printf("Segon I: ");
			scanf("%d", &segonI);
			
			printf("Dia F: ");
			scanf("%d", &diaF);
			printf("Hora F: ");
			scanf("%d", &horaF);
			printf("Minut F: ");
			scanf("%d", &minutF);
			printf("Segon F: ");
			scanf("%d", &segonF);
			
			if (operadorPropi != operadorTrucat) {
				numTrucadesAltresOperadors = numTrucadesAltresOperadors + 1;
				tempsTotal = tempsTotal + tempsTrucada(diaI, horaI, minutI, segonI, diaF, horaF, minutF, segonF);
			}
			
		}
		
		if (numTrucadesAltresOperadors > 0) {
			printf("%f", (float) (tempsTotal) / (float) (numTrucadesAltresOperadors));
		} else {
			printf("%f", 0.0);
		}
		printf("Numero de telefon: ");
		scanf("%d", &numTelefon);	
	}
	
	return 0;
}

int tempsTrucada(int diaI, int horaI, int minutI, int segonI, int diaF, int horaF, int minutF, int segonF){
	
	int segons1, segons2, segons;
	
	segons1 = horaI * 3600 + minutI * 60 + segonI;
	segons2 = horaF * 3600 + minutF * 60 + segonF;
	
	if (diaI = diaF) {
		segons = segons2 - segons1;
	} else if (diaI < diaF) {
		if (diaI < diaF) {
			segons = SEGONS_DIA - segons1 + segons2 + SEGONS_DIA * (diaF - diaI - 1);
		} else {
			segons = SEGONS_DIA - segons1 + segons2 + SEGONS_DIA * (364 - diaI + diaF);
		}
	}
	
	return segons;
	
}
