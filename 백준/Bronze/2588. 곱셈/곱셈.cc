#include<stdio.h>

int main(void) {
    int A, B, C, D, E, F;
    A<1000;
    B<1000;
    scanf("%d %d", &A, &B);
    C=B/10;
    D=B%C;//1의자리
    E=B%100-D;//10의자리
    F=B-E-D;
    printf("%d\n", A*D);
    printf("%d\n", A*E/10);
    printf("%d\n", A*F/100);
    printf("%d\n", A*D+A*E+A*F);
}