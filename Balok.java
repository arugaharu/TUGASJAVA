/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maingas;

/**
 *
 * @author Gaharu Winanggya B / 123210155
 */
class Balok extends PersegiPanjang{
    private double tinggi;
  
    public Balok(double p, double l, double t) {
    super(p, l);
    tinggi = t;
  }
    
    public double getTinggi() {
    return tinggi;
  }
  
  public double hitungVolume() {
    return super.hitungLuas() * tinggi;
  }
  
  public double hitungLuasPP() {
    return super.hitungLuas();
  }
  
  public double hitungKelilingPP() {
    return 2 * (super.getPanjang() + super.getLebar());
  }
  
  public double hitungLuasPermukaan() {
    return 2 * (super.getPanjang() * super.getLebar() + super.getPanjang() * tinggi + super.getLebar() * tinggi);
  }
  
    @Override
    public String toString() {
    return "Balok dengan panjang " + super.getPanjang() + ", lebar " + super.getLebar() + ", dan tinggi " + tinggi;
  }
    
    
}
