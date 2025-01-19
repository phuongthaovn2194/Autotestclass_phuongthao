package day5_BTVN_1;


class HinhChuNhat extends HinhHoc {
    public int chieuDai;
    public int chieuRong;
    
    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhDienTich() {
        int dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
    }

}

