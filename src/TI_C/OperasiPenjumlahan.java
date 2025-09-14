/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI_C;

/**
 *
 * @author pc
 */
public class OperasiPenjumlahan extends OperasiBilanganAbs{
    OperasiPenjumlahan(String jumlah){
        jumlah = null;
    }
    protected double a=5.5,b=0.5,c = a+b;
    
    protected void set_a(double a){
        this.a = a; 
        
    }
    protected void set_b(double b){
        this.b = b;
        
    }
    protected void set_c(){
        this.c = a + b ;
    }
    protected double get_a(){
        return a;
    }
    protected double get_b(){
        return b;    
    }
    protected double get_c(){
        return c;
    }
    protected void tampil(){
        System.out.println(get_a()+" + "+get_b()+" = "+get_c());
    }

}
