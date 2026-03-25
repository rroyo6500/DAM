#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

typedef enum {false, true} bool;

void comprueba(int n1, int n2, char res, char op);
int resto9 (int n);
int sumarDigitos (int n);

int main(int argc, char *argv[]) {
	
	int n1, n2, res;
	char sp, op;
	
	printf("OP: ");
	scanf(" %c", &op);
	
	while (op != '.') {
		
		printf("n1: ");
		scanf("%d", &n1);
		printf("n2: ");
		scanf("%d", &n2);
		printf("res: ");
		scanf("%d", &res);
		
		comprueba(n1, n2, res, op);
		
		printf("sp: ");
		scanf(" %c", &sp);
		printf("op: ");
		scanf(" %c", &op);
		
	}
	
	
	return 0;
}

void comprueba(int n1, int n2, char res, char op) {
	bool ok;
	
	if (op == '+') {
		ok = resto9(resto9(n1) + resto9(n2)) == resto9(res);
	} else if (op == '-') {
		ok = resto9(9 + resto9(n1) - resto9(n2)) == resto9(9 + resto9(res));		
	} else if (op == '*') {
		ok = resto9(resto9(n1) * resto9(n2)) == resto9(res);
	}
	
	printf("%d", n1);
	printf(" %c ", op);
	printf("%d ", n2);
	
	if (!ok) {
		printf("!");
	}
	
	printf("=");
	printf(" %d\n", res);
	
}

int resto9 (int n) {
	while (n > 9) {
		n = sumarDigitos(n);
	}
	return n;
}

int sumarDigitos (int n) {
	int suma, d;
	
	d = n % 10;
	suma = 0;
	
	while (n != 0) {
		suma = suma + d;
		n = n / 10;
		d = n % 10;
	}
	
	return suma;
	
}
