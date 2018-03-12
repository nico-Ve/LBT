package sessions;

import entities.CategorieCarte;
import entities.Emplacement;
import entities.Ingredient;
import entities.Produit;
import entities.Propriete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Manuel_R_cdi113
 */
@Stateless
public class GestionEmplacement implements GestionEmplacementLocal {

     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;
     
    @Override
    public void attribuerTable(Emplacement table) {
        //  Méthode pour affecter à une session 
        //  "tabletteCommandeClient" la table choisie
        //  

    }

    @Override
    public void fusionnerTable(Emplacement table) {
        //  Méthode pour fusionner la commande d'une table à 
        //  la session "tabletteCommandeClient" sur table existante
        //  1°)trouver commande non réglée sur table choisie
        //  2°)for each LdC sur commande récuppérer ==> insert 
        //  into commande table si commande existante else dépôt direct

    }               
         
}
