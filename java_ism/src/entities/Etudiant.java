/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.User.*;

/**
 *
 * @author MOUHAMED NIANG
 */
public class Etudiant extends User {
    private String matricule;
    private String tuteur;
    private final String ROLE="ROLE_ETUDIANT";
    
    public Etudiant() {
        this.role=ROLE;
    }

    public Etudiant(String matricule, String tuteur, int id, String nomComplet) {
        super(id, nomComplet);
        this.matricule = matricule;
        this.tuteur = tuteur;
        this.role=ROLE;
    }
    
    
    
}
