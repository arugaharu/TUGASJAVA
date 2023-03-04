/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maingas;

/**
 *
 * @author Gaharu Winanggya B / 123210155
 */
class Tabung extends Lingkaran {
    
    private double tinggi;
  
  public Tabung(double j, double t) {
    super(j);
    tinggi = t;
  }
  
    public double getTinggi() {
    return tinggi;
  }
  
  public double hitungVolume() {
    return super.hitungLuas() * tinggi;
  }
  
  public double hitungLuasL() {
    return super.hitungLuas();
  }

  public double hitungKelilingL() {
    return 2 * Math.PI * super.getJariJari();
  }
  
  public double hitungLuasPermukaan() {
    return 2 * super.hitungLuas() + 2 * Math.PI * super.getJariJari() * tinggi;
  }
  
    @Override
    public String toString() {
    return "Tabung dengan jari-jari " + super.getJariJari() + " dan tinggi " + tinggi;
  }
}
