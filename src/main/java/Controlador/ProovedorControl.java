/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MOdelo.Proovedor;
import Servicio.ProovedorServicio;
import java.util.List;

/**
 *
 * @author alexb
 */
public class ProovedorControl {
      private final ProovedorServicio proovedorServicio = new ProovedorServicio();
    
    public Proovedor crear(String [] params){
        var Proovedor = new Proovedor(params[0],params[1],params[2],params[3]); 
        this.proovedorServicio.crear(Proovedor);
        return Proovedor;
    }
   
    public List<Proovedor> listar()
    {
        return this.proovedorServicio.listar();
    } 
    
}
