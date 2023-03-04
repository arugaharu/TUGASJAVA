/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maingas;

/**
 *
 * @author Gaharu Winanggya B / 123210155
 */
class PersegiPanjang {
    private double panjang;
    private double lebar;
            
    public PersegiPanjang(double p, double l) {
    panjang = p;
    lebar = l;
  }
  
  public double getPanjang() {
    return panjang;
  }
  
  public double getLebar() {
    return lebar;
  }
  
  public double hitungLuas() {
    return panjang * lebar;
  } 
}
