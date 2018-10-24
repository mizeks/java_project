package BTtrenLop;

import java.util.*;

public class List_LinkedList {
	
	ArrayList<DSLK> d = new ArrayList<DSLK>();
	//Tạo 1 mảng gồm n phần tử, mỗi phần tử chứa 1 đối tượng là 1 DSLK đơn
	int n; // số phần tử của mảng ArrayList 
	int m; // số phần tử của DSLK;
	Scanner input = new Scanner(System.in);
	
	
	//Tạo mảng DSLK
	public void createListLinkedList()
	{
		System.out.print("Nhập số dòng của ma trận muốn tạo: ");
		n = input.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Nhập số phần tử của dòng thứ "+(i+1)+": ");
			m = input.nextInt();
			DSLK dslk = new DSLK();
			dslk.createLinkedList(m);
			d.add(dslk);
		System.out.println();	
		}
	}
	
	//Xuất mảng DSLK
	public void showListLinkedList()
	{
		DSLK dslk = new DSLK();
		System.out.println("The matrix: ");
		for(int i = 0; i < d.size(); i++)
		{
			d.get(i).showLinkedList();
		}
	}
	
	public void showListAgain()
	{
		DSLK dslk = new DSLK();
		System.out.println("The matrix just sorted is: ");
		for(int i = 0; i < d.size(); i++)
		{
			d.get(i).showLinkedList();
		}
	}
	
	
	//Câu 1:
	//Tìm max trong mảng DSLK
	public int findMaxElement()
	{
		int a = -1100;
		for(int i = 0; i < n; i++)
			if(a < d.get(i).findMaxElement())
			{
				a=	d.get(i).findMaxElement();
			}
		return a;
	}

	//Câu 2:
	//Tính tổng dòng thứ i của mảng DSLK
	public int sumRowi(int x)
	{
		int sum = 0;
		for(int i = 0; i < d.size(); i++) {
			if (x == i)
				sum += d.get(i).sumInrow();
		}
		return sum;
	}

	//Câu 3:
	//Tính tổng tất cả phần tử trên mảng DSLK
	public int sumListLinkedList()
	{
		int sum = 0;
		for(int i = 0; i < d.size(); i++)
			sum += d.get(i).sumInrow();
		return sum;
	}

	//Câu 4:
	//Đếm số lần xuất hiện của một phần tử x bất kỳ!
	public int countElementAppearInAL()
	{
		System.out.print("Nhập vào phần tử muốn tìm kiếm: ");
		int x = input.nextInt();
		int count = 0;
		for(int i = 0; i <d.size(); i++)
			count += d.get(i).countElementAppear(x);
		return count;
	}

	
	//Câu 5:
	//sắp xếp tăng theo tổng từng dòng trên mảng DSLK
	public void sortSumRow()
	{

		for(int i = 0; i < n-1; i++)
			for(int j = i+1; j< n; j++)
			if(d.get(i).sumInrow()> d.get(j).sumInrow())
			{
				DSLK temp = d.get(i);
				d.set(i, d.get(j)); // set là gán giá trị trong arraylist
				d.set(j, temp);
			}
	}
	
	//câu 6

	public void sortZicZac()
	{

//		for(int i = 0; i < d.size()-1; i ++)
//			for(int j = i+1; j < d.size(); j ++)
//				if(d.get(i).getA() > d.get(j).getA())
//				{
//					DSLK temp = d.get(i);
//					d.set(i, d.get(j)).getA();
//					d.set(j, temp).getA();
//				}


	}




		
	}
	




	


