public class TReptil {
    private int jumlahkaki;
    private String nama;
    
    //konstruktor
    public TReptil(){
        this.jumlahkaki=0;
        this.nama="nama reptil";
    }
    public TReptil(int j, String n){
        this.jumlahkaki = j;
        this.nama = n;
    }    
    public void setjumlahkaki(int j){
        this.jumlahkaki=j;
    }
    public void setnama(String n){
        this.nama = n;        
    }
    public int getjumlahkaki(){
        return this.jumlahkaki;
    }
    public String getnama(){
        return this.nama;
    }    
}