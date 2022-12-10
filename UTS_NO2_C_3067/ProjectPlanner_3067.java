/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo.employeeproject_3067;

/**
 *
 * @author asus
 */
public class ProjectPlanner_3067 extends Employee_3067 {
    public float Komisi;
    public float TotalHslProyek;
    public double Totalgaji;
    
    public ProjectPlanner_3067(){
        
    }
            
    public double TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalHslProyek) - (GajiPokok*5/100);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}
