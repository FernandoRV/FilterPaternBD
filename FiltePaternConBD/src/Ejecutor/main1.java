/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.Controlador.ProductoCrtl;
import mx.edu.uttt.Filter.Concrete.CriteriaNombre;
import mx.edu.uttt.Filter.Concrete.CriteriaProveedor;
import mx.edu.uttt.Filter.Criteria.Criterial;
import mx.edu.uttt.Filter.Entidad.Modelo.BD;

/**
 *
 * @author hp
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoCrtl crtlP= new ProductoCrtl();
      List<BD> lista = (ArrayList<BD>) (crtlP.ConsultarPorNombre());
        Criterial nombre = new CriteriaNombre();
        Criterial proveedor=new CriteriaProveedor();
    
    
    
    printpersona(proveedor.meetCriteria(lista));
   //     printpersona(nombre.meetCriteria(lista));

    }
     public static void printpersona(List<BD> producto)
        {
            
            for (BD prod : producto) {
                System.out.println("Producto : [ \nID  :"+prod.getId()+"\nNombre  :"+ prod.getNombre()+"\nDescripcion  :"+prod.getDescripcion()
                +"\nStock  :"+prod.getStock()+"\nProveedor :"+prod.getProveedor());
            }
        }

}
