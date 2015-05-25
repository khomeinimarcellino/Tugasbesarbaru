
package tugas.besar;


public interface View {
    
    void identitasruang();        
    public void hasil(String NamaRuang, String LokasiRuang, int Fakultas);
    void KondisiRuangKelas();
    public void hasil (int PanjangRuang, int LebarRuang, int JumlahKursi, int JumlahPintu, int JumlahJendela, String lengkap);
    void InputJumlahPosisiKondisi();
    public void hasil (int JumlahStopKontak,int KondisiStopKontak,int PosisiStopKontak,int JumlahKabelLCD,int KondisiKabelLCD,int PosisiKabelLCD,int JumlahLampu,int KondisiLampu,int PosisiLampu,int JumlahKipasAngin,int KondisiKipasAngin,int PosisiKipasAngin,int JumlahAC,int KondisiAC,int PosisiAC,int JumlahCCTV,int KondisiCCTV,int PosisiCCTV,String SSID, int Bandwidth);
    void InputKebersihanRuangKelas();
    public void hasil (int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu);
    void InputLingkunganKelas();
    public void hasil (int KondisiLantai, int KondisiDinding, int KondisiAtap, int KondisiPintu, int KondisiJendela, int bersih3);
    void InputKenyamanan();
    public void hasil(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan);
    void InputKeamanan();
    public void hasil(int kokoh,int kuncipj,int bahaya);  
   
}
