/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Concrete;

import java.util.List;
import mx.edu.uttt.Filter.Criteria.Criterial;
import mx.edu.uttt.Filter.Entidad.Modelo.BD;

/**
 *
 * @author moy-c
 */
public class AddCriteria implements Criterial{
   private Criterial criteria;
    private Criterial otherCriteria;
    
public  AddCriteria(Criterial criteria, Criterial othCriteria){
    this.criteria=criteria;
    this.otherCriteria= othCriteria;
}
    @Override
    public List<BD> meetCriteria(List<BD> Producto) {
         List<BD> firsCriteriaProducto = criteria.meetCriteria(Producto);
        return otherCriteria.meetCriteria(firsCriteriaProducto);
    }
   
    }
    

