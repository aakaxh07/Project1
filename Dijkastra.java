package com.hacker.Arraylist1;
import java.util.Scanner;
public class Dijkastra {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=5;
		int src;
		int[][] graph=new int[5][5];
		int[] sptset=new int[5];
		int[] visited=new int [5];
		int [] distance=new int[5];
		int v=0;
		int  inf=999;
		
		
	System.out.println("enter the value");
		for(int i=0;i<n;i++)
		{
			sptset[i]=0;
			visited[i]=0;
			for(int j=0;j<n;j++)
			{
				graph[i][j]=sr.nextInt();
				if(graph[i][j]<=0)
				{
					graph[i][j]=inf;
					
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			visited=new int[] {0,0,0,0,0};
			Diver.dij(graph,i,visited);
		}
	
	}

}
