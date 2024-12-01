/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpl2_pert2_51421418;

/**
 *
 * @author SHINTA MP
 */
public class Mahasiswa extends Student {
    
    public Mahasiswa(){
        super();
    }
    
    @Override
    public String toString(){
        return "Nama = " + getName() + "\n" +
                " NPM = " + getNpm() + "\n" +
                "Kelas = " + getClassNumber() + "\n" +
                "Tahun Lahir = " + getBirthYear() + "\n" +
                "umur = " + calculateAge() + "\n" +
                "Alamat = " + getAlamat();
    }
}
