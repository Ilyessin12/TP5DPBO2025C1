public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String faction;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String faction) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.faction = faction;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getFaction() {
        return this.faction;
    }
}
