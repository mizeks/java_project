package BTBalo;


import java.util.*;

public class BaiToanBaLo{
	ArrayList<DoVat> dsdv = new ArrayList<>();
	ArrayList<DoVat> balo = new ArrayList<>();
	int n; 		//sluong dvat
	double W; 	//trg luong balo
	
	public void nhapdsdv(){
    	Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhập số loại đồ vật: ");
            n = sc.nextInt();
        }while(n<0);
        for(int i=0; i<n; i++){
            System.out.println("-----Nhập loại đồ vật thứ "+(i+1)); 
            DoVat dv = new DoVat();
            dv.nhapDoVat();
            dsdv.add(dv);
        }
    }
	
	public void xuatdsdv() {
        for(int i=0; i<dsdv.size();i++){
            dsdv.get(i).xuatDoVat();
        }
    }
	
	public void chonDoVat() {
		
		//sx giam
    	Collections.sort(dsdv, DoVat.DVReal);
    	Collections.reverse(dsdv);
    	
    	//chon vat co don gia ca nhat cho vao balo
    	//Đk dung W=0 or het vat;
    	int i = 0;
    	while(W != 0 && i < n) {
    		
    		String tenvati = dsdv.get(i).tendv;
    		double trongluongi = dsdv.get(i).trongluong;
    		double soluongi = dsdv.get(i).soluong;
    		double giatrii = dsdv.get(i).giatri;
    		
    		int chonduocmax = (int)(W/trongluongi);
    		//Nếu chọn được tối đa lớn hơn số lượng vật đang có 
    		//ta chỉ được đúng bằng số lượng vật đang có
    		int soluonglay = (int) ((chonduocmax<soluongi)?chonduocmax:soluongi);
    		
    		//nếu số lượng lấy = 0 thì ko chọn vật loại đó
    		if(soluonglay != 0) {
    			DoVat dovatchon = new DoVat();
    			dovatchon.tendv = tenvati;
    			dovatchon.trongluong = trongluongi;
    			dovatchon.soluong = soluonglay;
    			dovatchon.giatri = giatrii;
    			balo.add(dovatchon);
    		}
    		
    		//cập nhật W mới
    		W -= soluonglay*trongluongi;
    		i++;
    		//reset lại !!
    		chonduocmax = 0;
    		soluonglay = 0;
    	}
	}
	
	public void xuatCacVatDuocChon() {
		for (DoVat dvchon : balo) {
			dvchon.xuatDoVat();
		}
	}
	
	public double tongGiaTriBaLo() {
		double tong = 0;
		for (DoVat dvchon : balo) {
			tong += (dvchon.soluong*dvchon.giatri);
		}
		return tong;
	}
	
	public void thucThiBaLo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập trọng lượng tối đa của balo: ");
		W = sc.nextDouble();
		System.out.println("Nhập danh sách các vật sẽ được chọn vào balo ");
		nhapdsdv();
		System.out.println("Danh sách vật: ");
		xuatdsdv();
		System.out.println("-------------------------------------------------");
		chonDoVat();
		System.out.println("Các vật được chọn vào balo: ");
		xuatCacVatDuocChon();
		System.out.println("Tổng giá trị các vật trong balo: "+tongGiaTriBaLo());
		System.out.println("Trọng lượng còn lại của balo: "+W);
	}
}

