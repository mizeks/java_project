package BTtrenLop;

import java.util.*;

public class DSLK {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	Scanner input = new Scanner(System.in);
	


	//tạo DSLK
	public void createLinkedList(int n)
	{
		Random rd = new Random();
		for(int i = 0; i < n; i++)
		{
			ll.add(rd.nextInt(100)-50);
//			System.out.print("Input the element "+ (i+1)+": ");
//		 	setA(input.nextInt());
//			ll.add(getA());
		}
		
	}
	
	//xuất DSLK
	public void showLinkedList()
	{
		for(Integer number: ll)
		{
			System.out.print(number+"	");
		}
		System.out.println();
	}
	
	//tìm max trong DSLK
	public int findMaxElement()
	{
		int a = -10000;
		for(Integer number: ll)
			if(a < number)
				a = number;
		return a;
	}
	
	//tính tổng trong DSLK
	public int sumInrow()
	{
		int sum = 0;
		for(Integer number: ll)
			sum+=number;
		return sum;
	}

	//đếm số phần tử xuất hiện
	public int countElementAppear(int x) {
		int count = 0;
		for(Integer number: ll) {
			if (number == x)
				count++;
		}
		return count;

	}




	
	
	public void sortIn() {
		Collections.sort(ll);
	}

}
