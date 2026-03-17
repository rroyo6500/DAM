#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

typedef enum {FALSE, TRUE} bool;

void comprueba(int n1, int n2, char res, char op);

int main(int argc, char *argv[]) {
	
	int n1, n2, res;
	char sp, op;
	
	scanf("%c ", &op);
	
	while (op != '.') {
		
		scanf("%d", &n1);
		scanf("%d", &n2);
		scanf("%d", &res);
		
		// comprueba(n1, n2, res, op);
		
		scanf("%c ", &sp);
		scanf("%c ", &op);
		
	}
	
	
	return 0;
}

void comprueba(int n1, int n2, char res, char op) {
	bool ok;
	
	if (op == '+') {
		ok = 
	}
	
}
