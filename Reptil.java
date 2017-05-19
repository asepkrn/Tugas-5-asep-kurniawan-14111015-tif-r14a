public abstract class Reptil {
    protected String nama  = "cicak";
    protected String makanan = "nyamuk";

    protected String getnama(){
        return nama;
    }
    protected String getmakanan(){
        return makanan;
    }    
    protected abstract void printnama();
	
    protected abstract void printmakanan();
}