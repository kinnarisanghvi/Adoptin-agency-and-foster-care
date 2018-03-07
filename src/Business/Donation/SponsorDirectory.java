/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class SponsorDirectory {
 
    private ArrayList<Sponsor> sponsorDirectory;
    
    public SponsorDirectory() {
        sponsorDirectory = new ArrayList<Sponsor>();
    }

    public ArrayList<Sponsor> getSponsorDirectory() {
        return sponsorDirectory;
    }

    public void setSponsorDirectory(ArrayList<Sponsor> sponsorDirectory) {
        this.sponsorDirectory = sponsorDirectory;
    }
    
    //add sponsor
    public Sponsor addSponsor(){
        Sponsor s = new Sponsor();
        sponsorDirectory.add(s);
        return s;
    }
    
}
