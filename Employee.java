package day5_BTVN_2;

class Employee {
    private String hoTen;
    private String maNV;
    private String sdt;

    public Employee(String hoTen, String maNV, String sdt) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getSdt() {
        return sdt;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", Ma NV: " + maNV + ", SDT: " + sdt;
    }
}
