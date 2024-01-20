#include<stdio.h>

int main(void)
{
	int A, B, C;
	scanf("%d %d\n %d", &A, &B, &C);
	if ((A + (B + C) / 60) <24)
		printf("%d %d", A + (B + C) / 60, (B+C)%60);
	if ((A + (B + C) / 60) > 23)
		printf("%d %d", (A + (B + C) / 60) - 24, (B + C) % 60);
	return 0;
}