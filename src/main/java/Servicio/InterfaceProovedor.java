/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import MOdelo.Proovedor;
import java.util.List;

/**
 *
 * @author alexb
 */
public interface InterfaceProovedor {
    public Proovedor crear(Proovedor proovedor);
    public List<Proovedor>listar();
}
