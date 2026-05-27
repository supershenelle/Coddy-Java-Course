/*

Created by LENOVO on 24/05/2026.
Aims to simulate stack data structure in C (This program assumes all inputs are correct)!

*/


#include <stdio.h>
#define SIZE 5

void Update(int a[], int *top)
{
	printf("Stack: [ ");
    for (int i = 1; i<=*top; i++)
    {
    	printf("%d ", a[i]);
	}
	printf("]\n");
}

// DEFINE MAIN OPERATIONS AS FUNCTIONS
void Push(int a[], int *top)
{
    int x;

    if (*top > SIZE)
        printf("Stack Overflow Error!\n");
 
    
    else
    {
    	printf("Enter value: ");
	    scanf("%d", &x);
	
	    (*top)++;
	    a[*top] = x;
	    Update(a, top);
	}
    
    printf("\n\n");
}

void Pop(int a[], int *top)
{
	int x;
	
	if (*top < 1)
		printf("Stack Underflow Error!\n");
	
	else
	{
		Update(a, top);
		printf("Now initiating pop function...\n");
		
		int temp = a[*top];
		(*top) = (*top) - 1;
		printf("Pop value: %d\n", temp);
		Update(a, top);
	}
	
	printf("\n\n");
}

void Full(int *top)
{
	if (SIZE == *top)
		printf("Stack is full\n");
	
	else
		printf("Stack is not yet full\n");
		
	printf("\n\n");
}

int main() {
    int nChoice;
    int top = 0;
    int exit = 0;

    // Create stack
    int Stack[SIZE+1];

    // Display Interface
    while (exit != 1)
	{
		printf("______________________\n");
	    printf(" 1. Push Stack\n 2. Pop Stack\n 3. Top Stack\n 4. Stack Full\n 5. Stack Empty\n");
	
	    printf("Enter desired operation: ");
	    scanf("%d", &nChoice);
	    printf("______________________\n");
	
	    switch (nChoice)
	    {
	        case 1: 
			{
				Push(Stack, &top);
				break;
			}
	        
			case 2:
			{
				Pop(Stack, &top);
				break;
			}
			
			case 3:
			{
				printf ("Top: %d", top);
				printf("\n\n");
				break;
			}
			
	        case 4:
	        {
	        	Full(&top);
	        	break;
			}
			
	        //case 5: Empty(Stack[]);
	        //default: printf("Invalid Choice. Try again.\n");
	    }
	}
}
