//变种水仙花数
int main()
{
	int i, j, j1, j2;
	int ret = 10;
	for (i = 10000; i < 100000; i++)
	{
		int sum = 0;
		for (j = 1; j < 5; j++)
		{
			j1 = i / (int)pow(ret, j);
			j2 = i % (int)pow(ret, j);
			sum += j1*j2;
		}
		if (sum == i)
		{
			printf("%d\n", i);
		}
	}
	return 0;
}
