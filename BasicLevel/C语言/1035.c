﻿/*
 * 1. 插入排序的重要特征：
 *		未排序部分和初始序列一定相同
 * 2. 归并排序的重要特征：
 *		末尾不足数量的子序列同样需要排序
 * 3. 利用 qsort() 函数，对部分元素的排序
 * 4. 显然 是否为插入排序 更容易判断，将其作为判断排序类型的切入点
 */
#include <stdio.h>
#include <stdlib.h>

int cmp(const void *a,const void *b) {
	return *(int *)a - *(int *)b;//升序 
}
int main() {
	int N;
	scanf("%d", &N);
	int arr[2][N];
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < N; j++) {
			scanf("%d", &arr[i][j]);
		}
	}
	int cnt_order =  1;//有序的数量
	for (int i = 0; arr[1][i] <= arr[1][i+1] && i < N - 1; i++) {//统计中间序列有序的数量 
		cnt_order++;
	} 
	int isInsert = 1;//是否为插入排序 
	for (int i = cnt_order; i < N; i++) {//抓住插入排序的特点 ：未排序部分和初始序列一定相同！
		if (arr[0][i] != arr[1][i]) {
			isInsert = 0;
			break;
		} 
	} 
	if (isInsert) {//插入排序 
		printf("Insertion Sort\n");
		qsort(arr[0], ++cnt_order, sizeof(int), cmp); 
	} else {//归并排序 
		printf("Merge Sort\n");
		int k = 1, flag = 1;//有序子序列中的元素数量，循环的标记 
        while(flag) {//循环直到 初始序列变为中间序列后，再归并一次 
            flag = 0;
            for (int i = 0; i < N; i++) {//遍历两个序列 
                if (arr[0][i] != arr[1][i]) {//如果有元素不同，令flag为1 
                    flag = 1;
                    break; 
                }
            }
            k *= 2;//有序子序列的元素个数 
            int i;
            for (i = 0; i < N / k; i++) {//需要归并的次数 
				qsort(arr[0]+ i * k, k, sizeof(int), cmp);//对数组部分元素 归并排序 
			} 
            qsort(arr[0]+ i * k, N - i * k, sizeof(int), cmp);//对末尾 不足有序子序列数量的元素排序 
        }
	}
	for(int i = 0; i < N-1; i++) {//输出数组 
		printf("%d ", arr[0][i]);
	}
	printf("%d\n", arr[0][N-1]);
	return 0;
}