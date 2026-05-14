#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

#define MAX_LIBROS 100
#define FINSEQ 0

typedef enum {false, true} bool;

typedef struct {
	int idLibro; 
	int totalDias; 
	int numPrestamos;
} tLibro;

typedef struct {
	tLibro libros[MAX_LIBROS];
	int numLibros;
} tBiblioteca;

void inicializar (tBiblioteca *b);
void tratarPrestamo (int id, tBiblioteca *b);
void mostrarResultado (tBiblioteca b);

float mediaDias (tLibro libro);

int main(int argc, char *argv[]) {
	
	tBiblioteca biblioteca;
	int id;
	
	inicializar (&biblioteca);
	printf("Id Libro: ");
	scanf("%d", &id);
	
	while (id != FINSEQ) {
		tratarPrestamo(id, &biblioteca);
		printf("Id Libro: ");
		scanf("%d", &id);
	}
	
	mostrarResultado(biblioteca);
	
	return 0;
}

void inicializar (tBiblioteca *b) {
	(*b).numLibros = 0;
}

void tratarPrestamo (int id, tBiblioteca *b) {
	
	int i, dias;
	bool encontrado;
	
	scanf("%d", &dias);
	encontrado = false;
	
	i = 1;
	
	while (i <= (*b).numLibros && !encontrado) {
		if ((*b).libros[i].idLibro == id) {
			encontrado = true;
		} else {
			i = i + 1;
		}
	}
	
	if (encontrado) {
		(*b).libros[i].totalDias = (*b).libros[i].totalDias + dias;
		(*b).libros[i].numPrestamos = (*b).libros[i].numPrestamos + dias;
	} else {
		(*b).numLibros = (*b).numLibros + 1;
		(*b).libros[(*b).numLibros].idLibro = id;
		(*b).libros[(*b).numLibros].totalDias = dias;
		(*b).libros[(*b).numLibros].numPrestamos = 1;
	}
	
	
}

void mostrarResultado (tBiblioteca b) {
	
	int i;
	
	for (i = 1; i <= b.numLibros; i=i+1) {
		printf("%d\n", b.libros[i].idLibro);
		printf("%.2f\n", mediaDias(b.libros[i]));
	}
	
}

float mediaDias (tLibro libro) {
	return (float) (libro.totalDias) / (float) (libro.numPrestamos); 
}
