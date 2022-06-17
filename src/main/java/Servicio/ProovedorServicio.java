/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import MOdelo.Proovedor;
import java.util.List;

/**
 *
 * @author alexb
 */
public class ProovedorServicio {
    
    private final List<Proovedor> proovedorList = new Arraylist<>();
    
    public Proovedor crear(Proovedor proovedor){
        this.proovedorList.add(proovedor);
        return proovedor;
    }
    public List<Proovedor> listar(){
        return this.proovedorList;
    }
}
