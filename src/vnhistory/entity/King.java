package vnhistory.entity;

public class King extends Figure{
	private String father;
	private String mother;
	private String thoiGianTriVi;
	private String tienNhiem;
	private String keNhiem;
	private String noiAnNghi;
	
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getThoiGianTriVi() {
		return thoiGianTriVi;
	}
	public void setThoiGianTriVi(String thoiGianTriVi) {
		this.thoiGianTriVi = thoiGianTriVi;
	}
	public String getTienNhiem() {
		return tienNhiem;
	}
	public void setTienNhiem(String tienNhiem) {
		this.tienNhiem = tienNhiem;
	}
	public String getKeNhiem() {
		return keNhiem;
	}
	public void setKeNhiem(String keNhiem) {
		this.keNhiem = keNhiem;
	}
	public String getNoiAnNghi() {
		return noiAnNghi;
	}
	public void setNoiAnNghi(String noiAnNghi) {
		this.noiAnNghi = noiAnNghi;
	}
	
	
	@Override
	public String toString() {
		return this.getTen() + ": " + this.getDynasty() + "," + thoiGianTriVi;
	}
}
