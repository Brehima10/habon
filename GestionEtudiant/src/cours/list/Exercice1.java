/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
           1-creer une liste String
           2-ajouter des elements
           3-affichage de la liste
           4-supprimer des elts 
          
           modifier un element de la liste
           rechercher un element de la liste
        */
        //1-creer une liste String
        List<String> lString=new ArrayList();
       // 2-ajouter des elements
        lString.add("Bonjour");
        lString.add("Au Revoir");
        lString.add("les Etudiants de la Liage 3");
        //3-affichage de la list
          //Methode1
            for(String elt:lString){
                System.out.println(elt);
            }
         lString.add(0, "Debut");
         lString.forEach((elt) -> {
             System.out.println(elt);
        });
         
         // 4-supprimer des elts 
         lString.remove("Debut");
         lString.remove(2);
         System.out.println("Affichage apres Supression");
         lString.forEach((elt) -> {
             System.out.println(elt);
        });
         
         //modifier un element de la liste
         lString.set(0, "Bonsoir");
          System.out.println("Affichage apres Modification");
         lString.forEach((elt) -> {
             System.out.println(elt);
        });
         
        //rechercher un element de la liste
        if(lString.contains("Bonjour")==true){
            System.out.println("Element exite ");
        }else{
              System.out.println("Element Pas exite ");
        }
    }
    
}
