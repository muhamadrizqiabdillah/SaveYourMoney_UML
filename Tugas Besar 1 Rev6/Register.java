
/**
 * Write a description of class Register here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Register
{
    // instance variables - replace the example below with your own
    
    //ArrayList<Pengguna> listPengguna = new ArrayList<Pengguna>();
    ListPengguna objlistpengguna = new ListPengguna();
    //ArrayList<Register> listPengguna = new ArrayList<Pengguna>();
    /**
     * Constructor for objects of class Register
     */
    public Register()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void newUser(){
        Pengguna objpengguna = new Pengguna();
        objlistpengguna.arrayPengguna.add(objpengguna);
    };
}
