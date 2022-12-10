
/**
 * Write a description of class Admin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Admin extends User
{
    /**
     * Constructor for objects of class Admin
     */

    public Admin()
    {
        // initialise instance variables

    }

    ListPengguna listPengguna;
    ListReport listReport;
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    //melakukan login (jika user terdaftar maka akan dilakukan login)
    public void Login(){
    };
    //melakukan create laporan yang ditujukan kepada akun manager
    public void report(){
        Report objr = new Report();
    };
    
    //melakukan read terhadap data list user misal. namanya, umurnya, dll
    public void display(){
    };
    //melakukan update attruibute password user
    public void change(){
        //algoritma ganti password berdasarkan username yang diperlukan
    };
    //melakukan delete objek user yang ada pada list user (menghapus akun pengguna)
    public void remove(){
    };
    //memberikan report kepada manager 
    public void submitReport(){
    };


    
}
