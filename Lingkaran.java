/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maingas;

/**
 *
 * @author Gaharu Winanggya B / 123210155
 */
class Lingkaran {
   private double jariJari;
  
  public Lingkaran(double j) {
    jariJari = j;
  }
  
  public double getJariJari() {
    return jariJari;
  }
  
  public double hitungLuas() {
    return Math.PI * jariJari * jariJari;
  }
  
}
