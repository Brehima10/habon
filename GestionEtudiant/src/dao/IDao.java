/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author user
 */
public interface IDao<T> {
    /*
       public int insert(Classe classe)
       public int insert(Details detail)
       public int insert(Personne pers)
      //Genericité : Argument dont le type est variable
    */ 
      public int insert(T objet);
    
}
