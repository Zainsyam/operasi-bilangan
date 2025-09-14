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
public final class OperasiBilanganAbsCetak {
    private final void tampil (OperasiBilanganAbs[] objek){
        for (int i = 0; i < objek.length;i++){
            objek [i].get_a();
            objek [i].get_b();    
            objek [i].get_c();
            objek [i].tampil();
            System.out.println("----------");
        }
    }  
    public static void main(String[] args) {
        OperasiBilanganAbs[] objek = {
            new OperasiPenjumlahan("penjumlahan "),
            new OperasiPengurangan("Pengurangan "),
            new OperasiPerkalian("Perkalian "),
            new OperasiPembagian("Pembagian ")
        };
        OperasiBilanganAbsCetak obj = new OperasiBilanganAbsCetak();
        obj.tampil(objek);
        
    }
}
