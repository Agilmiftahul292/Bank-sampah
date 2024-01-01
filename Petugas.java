//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList();
    private ArrayList<String> alamat = new ArrayList();
    private ArrayList<String> telepon = new ArrayList();
    private ArrayList<Integer> jabatan = new ArrayList();

    public Petugas() {
        this.namaPetugas.add("yuwan");
        this.alamat.add("magelang");
        this.telepon.add("081112223333");
        this.jabatan.add(0);
        this.namaPetugas.add("disya");
        this.alamat.add("seleman");
        this.telepon.add("081117221332");
        this.jabatan.add(1);
        this.namaPetugas.add("aria");
        this.alamat.add("sidokabul");
        this.telepon.add("083217251322");
        this.jabatan.add(2);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int id) {
        return (Integer)this.jabatan.get(id);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    public String getNama(int idPetugas) {
        return (String)this.namaPetugas.get(idPetugas);
    }

    public String getAlamat(int idPetugas) {
        return (String)this.alamat.get(idPetugas);
    }

    public String getTelepon(int idPetugas) {
        return (String)this.telepon.get(idPetugas);
    }
}
