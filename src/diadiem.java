import java.util.ArrayList;

import org.json.simple.JSONObject;
public class diadiem {
    private static int id;
    private String ten;
    private ArrayList<String> sukien = new ArrayList<String>();
    private ArrayList<String> nhanvat = new ArrayList<String>();

    public diadiem () {

    }
    public diadiem (String ten) {
        this.ten = ten;
    }

    public diadiem (String ten, ArrayList<String> sukien)
    {
        this.ten = ten;
        this.sukien = sukien;
    }
    public diadiem (String ten, ArrayList<String> sukien, ArrayList<String> nhanvat) {
        this.ten = ten;
        this.sukien = sukien;
        this.nhanvat = nhanvat;
    }
}
