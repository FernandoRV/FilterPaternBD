/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Concrete;

import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.Filter.Criteria.Criterial;
import mx.edu.uttt.Filter.Entidad.Modelo.BD;

/**
 *
 * @author moy-c
 */
public class CriteriaNombre implements Criterial{

//    public List<BD> meetCriteria(List<BD> producto,String nombre) {
//        List<BD> nomProd = new ArrayList<BD>();
//        for (BD produc : producto){
//            if(produc.getNombre().equalsIgnoreCase(nombre)){
//                nomProd.add(produc);
//            }
//        }
//        return nomProd;
//    }
  
      public List<BD> meetCriteria(List<BD> producto) {
        List<BD> nomProd = new ArrayList<BD>();
        for (BD produc : producto){
            if(produc.getNombre().equalsIgnoreCase("Galletas")){
                nomProd.add(produc);
            }
        }
        return nomProd;
    }
        
    }
    

