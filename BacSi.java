package day5_BTVN_2;

class BacSi {
    private static final double LUONG_CO_BAN = 10000000; 

    public double tinhLuong(double heSoLuong) {
        return LUONG_CO_BAN * heSoLuong;
    }

    public double tinhLuong(double heSoLuong, int soNamKinhNghiem) {
        return LUONG_CO_BAN * heSoLuong * soNamKinhNghiem;
    }

    public double tinhLuong(double heSoLuong, int soNamKinhNghiem, int loai) {
        double phuCap = 0;
        if (loai == 1) { 
            phuCap = LUONG_CO_BAN * 0.2;
        } else if (loai == 2) { 
            phuCap = LUONG_CO_BAN * 0.45;
        }
        return LUONG_CO_BAN * heSoLuong * soNamKinhNghiem + phuCap;
    }
}
