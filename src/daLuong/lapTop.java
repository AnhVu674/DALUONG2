package daLuong;

public class lapTop {
private String hang;
private boolean dangSD;
public lapTop(String hang, boolean dangSD) {
	this.hang = hang;
	this.dangSD = dangSD;
}
public String getHang() {
	return hang;
}
public void setHang(String hang) {
	this.hang = hang;
}
public boolean isDangSD() {
	return dangSD;
}
public void setDangSD(boolean b) {
	this.dangSD = b;
}
}
