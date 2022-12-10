
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Pengguna extends User{
    // instance variables - replace the example below with your own
    ArrayList<cashflow> listCashflow = new ArrayList<cashflow>();
    private int idPengguna;
    private double pendapatan;
    private double goals;
    /**
     * Constructor for objects of class User
     */

    financialRecomendation objfR = new financialRecomendation();
    public Pengguna() {
           //panggil tambah pengguna (dimasukan kedalam list pengguna yang ada di dalam admin)
    }
    
    //non-fungsional
    //melakukan login
    public  void Login(){};

    
    // bagian fungsional 
    //menambahkan cashflow dengan menggunakan kategori (user memilih kategori)
    public void addCashflow(){};
    //menambahkan rencana belanja (belum tentu akan dilakukan/dibelanjakan)
    public void addPlan(){};
    //melakukan validasi agar user mengisi semua pengeluaran
    public void validate(){};
    
    public void deleteAccount(){};
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
}
