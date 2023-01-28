package vnhistory.entity;

public class Dynasty extends Base{
	
	private String thoiGianBatDau;
    private String thoiGianKetThuc; 
    private String thoiKy; 
    private String kinhDo;
    
	public Dynasty(int id, String ten, String moTa, String kieu) {
		super(id, ten, moTa, kieu);
		// TODO Auto-generated constructor stub
	}
	public Dynasty(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public Dynasty(int id, String ten, String moTa, String kieu, String thoiGianBatDau, String thoiGianKetThuc, String thoiKy, String kinhDo) {
		super(id, ten, moTa, kieu);
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.thoiKy = thoiKy;
		this.kinhDo = kinhDo;
	} 
    
    
}
