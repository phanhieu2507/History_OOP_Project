import java.util.ArrayList;
import org.json.simple.JSONObject;
public class trieudai {
    private static  int id = 0;
    private String ten;
    private String batdau;
    private String ketthuc;
    private ArrayList<String> nhanvat = new ArrayList<String>();
    private ArrayList<String> sukien = new ArrayList<String>();
    private ArrayList<String> diadiem = new ArrayList<String>();

    protected JSONObject jsonFormat;
    public trieudai() {

    }
    public trieudai(String ten) {
        this.ten = ten;
    }

    public trieudai(String ten, String batdau) {
        this.ten = ten;
        this.batdau = batdau;
    }

    public trieudai(String ten, String batdau, String ketthuc) {
        this.ten = ten;
        this.batdau = batdau;
        this.ketthuc = ketthuc;
    }

    public trieudai(String ten, String batdau, String ketthuc, ArrayList<String> nhanvat) {
        this.ten = ten;
        this.batdau = batdau;
        this.ketthuc = ketthuc;
        this.nhanvat = nhanvat;

    }


    public trieudai(String ten, String batdau, String ketthuc, ArrayList<String> nhanvat, ArrayList<String>sukien) {
        this.ten = ten;
        this.batdau = batdau;
        this.ketthuc = ketthuc;
        this.nhanvat = nhanvat;
        this.sukien = sukien;
    }

    public trieudai(String ten, String batdau, String ketthuc, ArrayList<String> nhanvat, ArrayList<String>sukien
            , ArrayList<String> diadiem) {
        this.ten = ten;
        this.batdau = batdau;
        this.ketthuc = ketthuc;
        this.nhanvat = nhanvat;
        this.sukien = sukien;
        this.diadiem = diadiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBatdau() {
        return batdau;
    }

    public void setBatdau(String batdau) {
        this.batdau = batdau;
    }

    public String getKetthuc() {
        return ketthuc;
    }

    public void setKetthuc(String ketthuc) {
        this.ketthuc = ketthuc;
    }

    public ArrayList<String> getNhanvat() {
        return nhanvat;
    }

    public void setNhanvat(ArrayList<String> nhanvat) {
        this.nhanvat = nhanvat;
    }

    public ArrayList<String> getSukien() {
        return sukien;
    }

    public void setSukien(ArrayList<String> sukien) {
        this.sukien = sukien;
    }

    public ArrayList<String> getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(ArrayList<String> diadiem) {
        this.diadiem = diadiem;
    }
}
