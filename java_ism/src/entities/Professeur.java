/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author MOUHAMED NIANG
 */
import entities.*;
public class Professeur  extends User{
    private String nci;
    private String grade;
    private final String ROLE="Professeur";
    public Professeur() {
        this.role=ROLE;
    }

    public Professeur(String nci, String grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.nci = nci;
        this.grade = grade;
        this.role=ROLE;
    }

    public Professeur(String nci, String grade, String nomComplet) {
        super(nomComplet);
        this.nci = nci;
        this.grade = grade;
        this.role=ROLE;
    }
    
    
    
    
}
