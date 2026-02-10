#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


#define EPSILON 0.001

typedef enum {false, true} bool;


float distancia2Puntos (float p1x, float p1y, float p2x, float p2y);
void raizCuadrada (float valor, float *raiz);
float valorAbsoluto (float valor);

int main(int argc, char *argv[]) {
	
	int numLados;
	float px, py, px1, py1, px2, py2, lado, perimetro;
	bool finalPoligono;
	
	printf("PX1: ");
	scanf("%f", &px1);
	printf("PY1: ");
	scanf("%f", &py1);
	px = px1;
	py = py1;
	
	finalPoligono = false;
	numLados = 0;
	perimetro = 0.0;
	
	while (!finalPoligono) {
		
		printf("PX2: ");
		scanf("%f", &px2);
		printf("PY2: ");
		scanf("%f", &py2);
		
		lado = distancia2Puntos(px1, py1, px2, py2);
		perimetro = perimetro + lado;
		numLados = numLados + 1;
		
		px1 = px2;
		py1 = py2;
		finalPoligono = px == px2 && py == py2;
		
	}
	
	printf("%.3f\n", perimetro);
	printf("%d\n", numLados);
	
	return 0;
}

float distancia2Puntos (float p1x, float p1y, float p2x, float p2y) {
	float modulo, raiz;
	
	modulo = (p2x - p1x) * (p2x - p1x) + (p2y - p1y) * (p2y - p1y);
	raizCuadrada(modulo, &raiz);
	
	return raiz;
}

void raizCuadrada (float valor, float *raiz) {
	bool final;
	
	*raiz = valor / 2.0;
	final = valorAbsoluto((*raiz) * (*raiz) - valor) < EPSILON;
	
	while (final) {
		
		*raiz = (*raiz + valor / *raiz) / 2.0;
		final = valorAbsoluto((*raiz) * (*raiz) - valor) < EPSILON;
		
	}
}

float valorAbsoluto (float valor) {
	if (valor < 0.0) {
		valor = -valor;
	}
	return valor;
}

