
#include <stdio.h>
#include <conio.h>

void radix(int array[], int n);
void main()
{
    int array[100], n, i;

    printf("What's Your Limit ? ");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("Enter %d Data ", i + 1);
        scanf("%d", &array[i]);
    }

    radix(&array[0], n);

    printf("Sorted Successfully\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
}

void radix(int arr[], int n)
{
    int bucket[10][5], buck[10], b[10];
    int i, j, k, l, num, div, large, pass;

    div = 1;
    num = 0;
    large = arr[0];

    for (i = 0; i < n; i++)
    {
        if (arr[i] > large)
        {
            large = arr[i];
        }

        while (large > 0)
        {
            num++;
            large = large / 10;
        }

        for (pass = 0; pass < num; pass++)
        {
            for (k = 0; k < 10; k++)
            {
                buck[k] = 0;
            }
            for (i = 0; i < n; i++)
            {
                l = ((arr[i] / div) % 10);
                bucket[l][buck[l]++] = arr[i];
            }

            i = 0;
            for (k = 0; k < 10; k++)
            {
                for (j = 0; j < buck[k]; j++)
                {
                    arr[i++] = bucket[k][j];
                }
            }
            div *= 10;
        }
    }
}
