/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import java.util.Date;

/**
 *
 * @author kinnari
 */
public class Sponsor {
    
    private String name;
    private Double amount;
    
   public Sponsor(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

   
     @Override
    public String toString() {
        return this.name;
    }
    
    
}
