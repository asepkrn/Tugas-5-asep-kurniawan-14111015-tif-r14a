public class panggil{
	public static void main(String []args){
	TurunanReptil a = new TurunanReptil();
	System.out.println("INI ABSTARCTION");
	System.out.println("+++++++++++++++");
	a.printnama();
	a.printmakanan();
	
	TReptil pgl = new TReptil();
    pgl.setjumlahkaki(4);
    pgl.setnama("cicak");     
	System.out.println();
	System.out.println("INI ENCAPSULATION");
	System.out.println("+++++++++++++++++");
    System.out.println("jumlah kaki reptil  = "+pgl.getjumlahkaki());
    System.out.println("nama reptil         = "+pgl.getnama());
	}
}