package tugas.besar;

public abstract class InventarisBarang {

    private String NamaRuang;
    private String LokasiRuang;
    private int ProgramStudi;
    private int Fakultas;
    int PanjangRuang;
    private int LebarRuang;
    private int JumlahKursi;
    private int JumlahPintu;
    private int JumlahJendela;
    private int JumlahStopKontak;
    private int KondisiStopKontak;
    private int PosisiStopKontak;
    private int JumlahKabelLCD;
    private int KondisiKabelLCD;
    private int PosisiKabelLCD;
    private int JumlahLampu;
    private int KondisiLampu;
    private int PosisiLampu;
    private int JumlahKipasAngin;
    private int KondisiKipasAngin;
    private int PosisiKipasAngin;
    int JumlahAC;
    private int KondisiAC;
    private int PosisiAC;
    private String SSID;
    private int Bandwidth;
    private int JumlahCCTV;
    private int KondisiCCTV;
    private int PosisiCCTV;
    private int KondisiLantai;
    private int KondisiDinding;
    private int KondisiAtap;
    private int KondisiPintu;
    private int KondisiJendela;
    private int SirkulasiUdara;
    private int NilaiPencahayaan;
    private int Kelembaban;
    private int Suhu;
    private int Kebisingan;
    private int Bau;
    private int Kebocoran;
    private int Kerusakan;
    private int Keausan;
    private int Kekokohan;
    private int KunciPintuJendela;
    private int Bahaya;
    private int Edit;
    int bersih3;
    int nyaman;

    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public int getProgramStudi() {
        return ProgramStudi;
    }

    public void setProgramStudi(int ProgramStudi) {
        this.ProgramStudi = ProgramStudi;
    }

    public int getFakultas() {
        return Fakultas;
    }

    public void setFakultas(int Fakultas) {
        this.Fakultas = Fakultas;
    }

    public int getPanjangRuang() {
        return PanjangRuang;
    }

    public void setPanjangRuang(int PanjangRuang) {
        this.PanjangRuang = PanjangRuang;
    }

    public int getLebarRuang() {
        return LebarRuang;
    }

    public void setLebarRuang(int LebarRuang) {
        this.LebarRuang = LebarRuang;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int getJumlahStopKontak() {
        return JumlahStopKontak;
    }

    public void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak = JumlahStopKontak;
    }

    public int getKondisiStopKontak() {
        return KondisiStopKontak;
    }

    public void setKondisiStopKontak(int KondisiStopKontak) {
        this.KondisiStopKontak = KondisiStopKontak;
    }

    public int getPosisiStopKontak() {
        return PosisiStopKontak;
    }

    public void setPosisiStopKontak(int PosisiStopKontak) {
        this.PosisiStopKontak = PosisiStopKontak;
    }

    public int getJumlahKabelLCD() {
        return JumlahKabelLCD;
    }

    public void setJumlahKabelLCD(int JumlahKabelLCD) {
        this.JumlahKabelLCD = JumlahKabelLCD;
    }

    public int getKondisiKabelLCD() {
        return KondisiKabelLCD;
    }

    public void setKondisiKabelLCD(int KondisiKabelLCD) {
        this.KondisiKabelLCD = KondisiKabelLCD;
    }

    public int getPosisiKabelLCD() {
        return PosisiKabelLCD;
    }

    public void setPosisiKabelLCD(int PosisiKabelLCD) {
        this.PosisiKabelLCD = PosisiKabelLCD;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public int getKondisiLampu() {
        return KondisiLampu;
    }

    public void setKondisiLampu(int KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public int getPosisiLampu() {
        return PosisiLampu;
    }

    public void setPosisiLampu(int PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public int getJumlahKipasAngin() {
        return JumlahKipasAngin;
    }

    public void setJumlahKipasAngin(int JumlahKipasAngin) {
        this.JumlahKipasAngin = JumlahKipasAngin;
    }

    public int getKondisiKipasAngin() {
        return KondisiKipasAngin;
    }

    public void setKondisiKipasAngin(int KondisiKipasAngin) {
        this.KondisiKipasAngin = KondisiKipasAngin;
    }

    public int getPosisiKipasAngin() {
        return PosisiKipasAngin;
    }

    public void setPosisiKipasAngin(int PosisiKipasAngin) {
        this.PosisiKipasAngin = PosisiKipasAngin;
    }

    public int getJumlahAC() {
        return JumlahAC;
    }

    public void setJumlahAC(int JumlahAC) {
        this.JumlahAC = JumlahAC;
    }

    public int getKondisiAC() {
        return KondisiAC;
    }

    public void setKondisiAC(int KondisiAC) {
        this.KondisiAC = KondisiAC;
    }

    public int getPosisiAC() {
        return PosisiAC;
    }

    public void setPosisiAC(int PosisiAC) {
        this.PosisiAC = PosisiAC;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getJumlahCCTV() {
        return JumlahCCTV;
    }

    public void setJumlahCCTV(int JumlahCCTV) {
        this.JumlahCCTV = JumlahCCTV;
    }

    public int getKondisiCCTV() {
        return KondisiCCTV;
    }

    public void setKondisiCCTV(int KondisiCCTV) {
        this.KondisiCCTV = KondisiCCTV;
    }

    public int getPosisiCCTV() {
        return PosisiCCTV;
    }

    public void setPosisiCCTV(int PosisiCCTV) {
        this.PosisiCCTV = PosisiCCTV;
    }

    public int getKondisiLantai() {
        return KondisiLantai;
    }

    public void setKondisiLantai(int KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public int getKondisiDinding() {
        return KondisiDinding;
    }

    public void setKondisiDinding(int KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public int getKondisiAtap() {
        return KondisiAtap;
    }

    public void setKondisiAtap(int KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public int getKondisiPintu() {
        return KondisiPintu;
    }

    public void setKondisiPintu(int KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public int getKondisiJendela() {
        return KondisiJendela;
    }

    public void setKondisiJendela(int KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    public int getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(int SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getKelembaban() {
        return Kelembaban;
    }

    public void setKelembaban(int Kelembaban) {
        this.Kelembaban = Kelembaban;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

    public int getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(int Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public int getBau() {
        return Bau;
    }

    public void setBau(int Bau) {
        this.Bau = Bau;
    }

    public int getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(int Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public int getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(int Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public int getKeausan() {
        return Keausan;
    }

    public void setKeausan(int Keausan) {
        this.Keausan = Keausan;
    }

    public int getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(int Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public int getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(int KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public int getBahaya() {
        return Bahaya;
    }

    public void setBahaya(int Bahaya) {
        this.Bahaya = Bahaya;
    }

    public int getEdit() {
        return Edit;
    }

    public void setEdit(int Edit) {
        this.Edit = Edit;
    }

    public InventarisBarang(String NamaRuang, String LokasiRuang) {
        setNamaRuang(NamaRuang);
        setLokasiRuang(LokasiRuang);
    }

    public InventarisBarang(int PanjangRuang, int LebarRuang, int JumlahKursi, int JumlahPintu, int JumlahJendela) {
        setPanjangRuang(PanjangRuang);
        setLebarRuang(LebarRuang);
        setJumlahKursi(JumlahKursi);
        setJumlahPintu(JumlahPintu);
        setJumlahJendela(JumlahJendela);
    }

    public InventarisBarang(int JumlahStopKontak, int KondisiStopKontak, int PosisiStopKontak, int JumlahKabelLCD, int KondisiKabelLCD, int PosisiKabelLCD, int JumlahLampu, int KondisiLampu, int PosisiLampu, int JumlahKipasAngin, int KondisiKipasAngin, int PosisiKipasAngin, int JumlahAC, int KondisiAC, int PosisiAC, int JumlahCCTV, int KondisiCCTV, int PosisiCCTV, String SSID, int Bandwidth) {
        setJumlahStopKontak(JumlahStopKontak);
        setKondisiStopKontak(KondisiStopKontak);
        setPosisiStopKontak(PosisiStopKontak);
        setJumlahKabelLCD(JumlahKabelLCD);
        setKondisiKabelLCD(KondisiKabelLCD);
        setPosisiAC(PosisiAC);
        setJumlahLampu(JumlahLampu);
        setKondisiLampu(KondisiLampu);
        setPosisiLampu(PosisiLampu);
        setJumlahKipasAngin(JumlahKipasAngin);
        setKondisiKipasAngin(KondisiKipasAngin);
        setPosisiKipasAngin(PosisiKipasAngin);
        setJumlahAC(JumlahAC);
        setKondisiAC(KondisiAC);
        setPosisiAC(PosisiAC);
        setJumlahCCTV(JumlahCCTV);
        setKondisiCCTV(KondisiCCTV);
        setPosisiCCTV(PosisiCCTV);
        setSSID(SSID);
        setBandwidth(Bandwidth);
    }

    public InventarisBarang(int KondisiLantai, int KondisiDinding, int KondisiAtap, int KondisiPintu, int KondisiJendela, int bersih3) {
        setKondisiLantai(KondisiLantai);
        setKondisiDinding(KondisiDinding);
        setKondisiAtap(KondisiAtap);
        setKondisiPintu(KondisiPintu);
        setKondisiJendela(KondisiJendela);
        this.bersih3 = bersih3;
    }

    public InventarisBarang(int SirkulasiUdara, int NilaiPencahayaan, int Kelembaban, int Suhu) {

        setSirkulasiUdara(SirkulasiUdara);
        setNilaiPencahayaan(NilaiPencahayaan);
        setKelembaban(Kelembaban);
        setSuhu(Suhu);
    }

    public InventarisBarang(int Kebisingan, int Bau, int Kebocoran, int Kerusakan, int Keausan, int nyaman, int bersih3) {
        setKebisingan(Kebisingan);
        setBau(Bau);
        setKebocoran(Kebocoran);
        setKerusakan(Kerusakan);
        setKeausan(Keausan);
        this.nyaman = nyaman;
        this.bersih3 = bersih3;
    }

    public InventarisBarang(int Kekokohan, int KunciPintuJendela, int Bahaya) {
        setKekokohan(Kekokohan);
        setKunciPintuJendela(KunciPintuJendela);
        setBahaya(Bahaya);
    }
    
    int programstudi(){
        return 0;
    }

    int BentukKelas() {
        return 0;
    }

    int Rasio() {
        return 0;
    }

    int Analisisjendela() {
        return 0;
    }

    int AnalisisPintu() {
        return 0;
    }

    int AnalisiStopKontak() {
        return 0;
    }

    int AnalisisJumlahstopkontak() {
        return 0;
    }

    int Analisiskondisistopkontak() {
        return 0;
    }

    int analisisposisistopkontak() {
        return 0;
    }

    int analisisLCD() {
        return 0;
    }

    int AnalisiskondisiLCD() {
        return 0;
    }

    int analisisposisiLCD() {
        return 0;
    }

    int analisisLampu() {
        return 0;
    }

    int analisisKipasAngin() {
        return 0;
    }

    int analisiskondisikipasangin() {
        return 0;
    }

    int analisisposisikipasangin() {
        return 0;
    }

    public int analisisAC() {
        return 0;
    }

    public int anlisiskondisiAC() {
        return 0;
    }

    public int analisisposisiAC() {
        return 0;
    }

    public int analisisInternet() {
        return 0;
    }

    int analisislogin() {
        return 0;
    }

    int analisisCCTV() {
        return 0;
    }

    int KondisiCCTV() {
        return 0;
    }

    int posisiCCtv() {
        return 0;
    }

    int AnalisisKebersihan() {
        return 0;
    }

    int Sirkulasiudara() {
        return 0;
    }

    int pencahayaan() {
        return 0;
    }

    int kelembaban() {
        return 0;
    }

    int suhu() {
        return 0;
    }

    int kebisingan() {
        return 0;
    }

    int bau() {
        return 0;
    }

    int kebocoran() {
        return 0;
    }

    int kerusakan() {
        return 0;
    }

    int keausan() {
        return 0;
    }

    int kekokohan() {
        return 0;
    }

    int kuncipintujendela() {
        return 0;
    }

    int bahaya() {
        return 0;
    }

}
