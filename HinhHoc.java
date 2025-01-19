package day5_BTVN_1;

abstract class HinhHoc {
    private String tenHinh;

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract void tinhDienTich();

}
