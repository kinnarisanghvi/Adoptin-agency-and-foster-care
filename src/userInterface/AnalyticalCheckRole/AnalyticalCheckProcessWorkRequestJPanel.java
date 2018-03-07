/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AnalyticalCheckRole;

import Business.WorkQueue.AnalyticalCheckWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinnari
 */
public class AnalyticalCheckProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyticalCheckProcessWorkRequestJPanel
     */
    JPanel userProcessContainer;
    AnalyticalCheckWorkRequest request;

    AnalyticalCheckProcessWorkRequestJPanel(JPanel userProcessContainer, AnalyticalCheckWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        
    }
    
    public String AnalyticalProcess(AnalyticalCheckWorkRequest request) throws IOException{
     
        String result = null;
        int index=0;
        Integer p1Age[]=new Integer[50];
        Integer p2Age[]=new Integer[50];
        Boolean mom_graduated[]=new Boolean[50];
        Boolean dad_graduated[]=new Boolean[50];
        Integer sourceOfIncome[]=new Integer[50];
        String adoption[]=new String[50];
        Scanner sc=new Scanner(System.in);
        FileInputStream in = null;
         try {
         in = new FileInputStream("/Users/MACBOOK/Downloads/inputData.txt");
         BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/MACBOOK/Downloads/inputData.txt"), "ASCII"));
         while(true)
        {
            String line = fr.readLine();
            if(line==null)
                break;
            String[] words = line.split(",");//those are your words
            p1Age[index]=Integer.parseInt(words[0]);
            p2Age[index]=Integer.parseInt(words[1]);
            mom_graduated[index]=Boolean.parseBoolean(words[2]);
            dad_graduated[index]=Boolean.parseBoolean(words[3]);
            sourceOfIncome[index]=Integer.parseInt(words[4]);
            adoption[index]=words[5];
            index++;
            
             for (String word : words) {
                 System.out.println(word);
             }
                System.out.println("Arrays");
            
             for (Integer p1Age1 : p1Age) {
                 System.out.print("" + p1Age1 + "\t");
             }
                System.out.println("");
            
             for (Boolean mom_graduated1 : mom_graduated) {
                 System.out.println("" + mom_graduated1 + "\t");
             }
                System.out.println("");
            
             for (Boolean dad_graduated1 : dad_graduated) {
                 System.out.println("" + dad_graduated1 + "\t");
             }
                System.out.println("");
            
             for (Integer sourceOfIncome1 : sourceOfIncome) {
                 System.out.println("" + sourceOfIncome1 + "\t");
             }
                System.out.println("");
            
             for (String adoption1 : adoption) {
                 System.out.println("" + adoption1 + "\t");
             }
                System.out.println("");
            }
         }
          
        catch (FileNotFoundException e) {
       }
       
         //Calculating number of mom_graduated and mom_not_graduated
        int mng=0,mg=0;
        for (Boolean mom_graduated1 : mom_graduated) {
            if (mom_graduated1.equals(true)) {
                mg++;
            } else {
                mng++;
            }
        }
        System.out.println("mom_not_graduated\t"+mng+"\tmom_graduated\t"+mg);
       
 
         //Calculating number of dad_graduated and dad_not_graduated
        int dng=0,dg=0;
        for (Boolean dad_graduated1 : dad_graduated) {
            if (dad_graduated1.equals(true)) {
                dg++;
            } else {
                dng++;
            }
        }
        System.out.println("dad_not_graduated\t"+dng+"\tdad_graduated\t"+dg);
       
        //Calculating  number of parents eligible for adoption
         int yes=0,no=0;
        for (String adoption1 : adoption) {
            if (adoption1.equals("Yes")) {
                yes++;
            } else {
                no++;
            }
        }
        System.out.println("Yes\t"+yes+"\tNo\t"+no);
        
        //SourcrOfIncome ranges
        int range1=0,range2=0,range3=0,range4=0,range5=0;
        for (Integer sourceOfIncome1 : sourceOfIncome) {
            if ((sourceOfIncome1 >= 0) && (sourceOfIncome1 <= 200000)) {
                range1++;
            } else if ((sourceOfIncome1 >= 210000) && (sourceOfIncome1 <= 400000)) {
                range2++;
            } else if ((sourceOfIncome1 >= 410000) && (sourceOfIncome1 <= 600000)) {
                range3++;
            } else if ((sourceOfIncome1 >= 610000) && (sourceOfIncome1 <= 800000)) {
                range4++;
            } else {
                range5++;
            }
        }
        System.out.println("Ranges\tr1\t"+range1+"\tr2\t"+range2+"\tr3\t"+range3+"\tr4\t"+range4+"\tr5\t"+range5);
        
        //Age ranges
        int parange1=0, parange2=0, parange3=0, parange4=0;
        
        for(int y=0,z=0; y<p1Age.length&&z<p2Age.length; y++,z++)
        {
            if(p1Age[y]>=25 && p2Age[z]>=25)
                parange1++;
            
            else if((p1Age[y]>=25)&&(p2Age[z]<=30))
                    parange2++;
            
            else if((p1Age[y]>=30)&&(p2Age[z]<=40))
                    parange3++;
            
            else if((p1Age[y]>=40)&&(p2Age[z]<=50))
                    parange4++;
            
            else if((p1Age[y]>60) && (p2Age[z]>60)){
                System.out.println("Not eligible for adoption");
           }
        }
        System.out.println("Ranges\tr1\t"+parange1+"\tr2\t"+parange2+"\tr3\t"+parange3+"\tr4\t"+parange4);

         //Calculating Probabilities for mom_graduation
        
        int mg_And_Ad=0,mng_And_Ad=0, mg_And_NAd=0,mng_And_NAd=0;
        for(int z=0;z<mom_graduated.length;z++)
        {
            if(mom_graduated[z].equals(true)&&(adoption[z].equals("Yes")))
                mg_And_Ad++;
            
            if(mom_graduated[z].equals(true)&&(adoption[z].equals("No")))
                mg_And_NAd++;
            
            if(mom_graduated[z].equals(false)&&(adoption[z].equals("Yes")))
                mng_And_Ad++;
            
            if(mom_graduated[z].equals(false)&&(adoption[z].equals("No")))
                mng_And_NAd++;
        }					
        System.out.println("mom_graduated_and_adopted\t"+mg_And_Ad+
                "mom_notGraduated_and_adopted\t"+mng_And_Ad+
                "mom_graduated_and_notAdopted\t"+mg_And_NAd+
                "mom_notGraduated_and_notAdopted\t"+mng_And_NAd);
        
        double prob_mom_graduated_adopted=(double)mg_And_Ad/(double)yes; //Mom_graduated and adopted
        System.out.println("Prob_mom_graduated_adopted\t"+prob_mom_graduated_adopted);
        
        double prob_mom_graduated_andNotAdopted=(double)mg_And_NAd/(double)no; //Mom_graduated and not adopted
        System.out.println("prob_mom_graduated_andNotAdopted\t"+prob_mom_graduated_andNotAdopted);
        
        double prob_mom_not_graduated_andNotAdopted=(double)mng_And_NAd/(double)no; //Mom_notGraduated and not adopted
        System.out.println("prob_mom_not_graduated_andNotAdopted\t"+prob_mom_not_graduated_andNotAdopted);
 
        double prob_mom_not_graduated_adopted=(double)mng_And_Ad/(double)yes;  //Mom_not_graduated and adopted
        System.out.println(" prob_mom_not_graduated_adopted\t"+prob_mom_not_graduated_adopted);
        
        
           //Calculating Probabilities for dad_graduation
        
        int dg_And_Ad=0, dng_And_Ad=0, dg_And_NAd=0, dng_And_NAd=0;
        for(int z=0;z<dad_graduated.length;z++)
        {
            if(dad_graduated[z].equals(true)&&(adoption[z].equals("Yes")))
                dg_And_Ad++;
            
            if(dad_graduated[z].equals(true)&&(adoption[z].equals("No")))
                dg_And_NAd++;
            
            if(dad_graduated[z].equals(false)&&(adoption[z].equals("Yes")))
                dng_And_Ad++;
            
            if(dad_graduated[z].equals(false)&&(adoption[z].equals("No")))
                dng_And_NAd++;
        }					
        System.out.println("dad_graduated_and_adopted\t"+dg_And_Ad+
                "dad_notGraduated_and_adopted\t"+dng_And_Ad+
                "dad_graduated_and_notAdopted\t"+dg_And_NAd+
                "dad_notGraduated_and_notAdopted\t"+dng_And_NAd);
        
        double prob_dad_graduated_adopted=(double)dg_And_Ad/(double)yes; //Dad_graduated and adopted
        System.out.println("Prob_dad_graduated_adopted\t"+prob_dad_graduated_adopted);
        
        double prob_dad_graduated_andNotAdopted=(double)dg_And_NAd/(double)no; //Dad_graduated and not adopted
        System.out.println("prob_dad_graduated_andNotAdopted\t"+prob_dad_graduated_andNotAdopted);
        
        double prob_dad_not_graduated_andNotAdopted=(double)dng_And_NAd/(double)no; //Dad_notGraduated and not adopted
        System.out.println("prob_mom_not_graduated_andNotAdopted\t"+prob_dad_not_graduated_andNotAdopted);
 
        double prob_dad_not_graduated_adopted=(double)dng_And_Ad/(double)yes;  //Dad_not_graduated and adopted
        System.out.println(" prob_dad_not_graduated_adopted\t"+prob_dad_not_graduated_adopted);
      
        
       double p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0;
      
        for(int z=0;z<sourceOfIncome.length;z++)
        {
            if((sourceOfIncome[z]>=0)&&(sourceOfIncome[z]<=200000)&&(adoption[z].equals("Yes")))
                p++;
            else if((sourceOfIncome[z]>=0)&&(sourceOfIncome[z]<=200000)&&(adoption[z].equals("No")))
                q++;
            else if((sourceOfIncome[z]>=210000)&&(sourceOfIncome[z]<=400000)&&(adoption[z].equals("Yes")))
                r++;
            else if((sourceOfIncome[z]>=210000)&&(sourceOfIncome[z]<=400000)&&(adoption[z].equals("No")))
                s++;
            else if((sourceOfIncome[z]>=410000)&&(sourceOfIncome[z]<=600000)&&(adoption[z].equals("Yes")))
                t++;
            else if((sourceOfIncome[z]>=410000)&&(sourceOfIncome[z]<=600000)&&(adoption[z].equals("No")))
                u++;
            else if((sourceOfIncome[z]>=610000)&&(sourceOfIncome[z]<=800000)&&(adoption[z].equals("Yes")))
                v++;
            else if((sourceOfIncome[z]>=610000)&&(sourceOfIncome[z]<=800000)&&(adoption[z].equals("No")))
                w++;
            else if((sourceOfIncome[z]>800000)&&(adoption[z].equals("Yes")))
                x++;
            else
                y++;
        }
        
        
        double r1I=(double)p/(double)yes;
        double r2I=(double)r/(double)yes;
        double r3I=(double)t/(double)yes;
        double r4I=(double)v/(double)yes;
        double r5I=(double)x/(double)yes;
        System.out.println("\t"+r1I+"\t"+r2I+"\t"+r3I+"\t"+r4I+"\t"+r5I);
        double r1NI=(double)q/(double)no;
        double r2NI=(double)s/(double)no;
        double r3NI=(double)u/(double)no;
        double r4NI=(double)w/(double)no;
        double r5NI=(double)y/(double)no;
        System.out.println(""+r1NI+""+r2NI+""+r3NI+""+r4NI+""+r5NI);
        
        //Calculating Probabilities for age 
       double pa=0,qa=0,ra=0,sa=0,ta=0,ua=0,va=0,wa=0,xa=0,ya=0;
      
        for(int y1=0,z1=0; y1<p1Age.length && z1<p2Age.length;y1++,z1++)
        {
            if((p1Age[y1]>=25)&&(p2Age[z1]>=25)&&(adoption[z1].equals("Yes")))
                pa++;
            else if((p1Age[y1]>=25)&&(p2Age[z1]>=25)&&(adoption[z1].equals("No")))
                qa++;
            else if(((p1Age[y1]>=25)&&(p2Age[z1]<=30))&&(adoption[z1].equals("Yes")))
                ra++;
            else if(((p1Age[y1]>=25)&&(p2Age[z1]<=30))&&(adoption[z1].equals("No")))
                sa++;
            else if((p1Age[y1]>=30)&&(p2Age[z1]<=40)&&(adoption[z1].equals("Yes")))
                ta++;
            else if((p1Age[y1]>=30)&&(p2Age[z1]<=40)&&(adoption[z1].equals("No")))
                ua++;           
            else if((p1Age[y1]>=40)&&(p2Age[z1]<=40)&&(adoption[z1].equals("Yes")))
                va++;
            else if((p1Age[y1]>=40)&&(p2Age[z1]<=40)&&(adoption[z1].equals("No")))
                wa++;
        }
                
        double par1Ad =(double)pa/(double)yes;
        double par2Ad=(double)ra/(double)yes;
        double par3Ad=(double)ta/(double)yes;
        double par4Ad=(double)va/(double)yes;
        
        System.out.println("\t"+par1Ad+"\t"+par2Ad+"\t"+par3Ad+"\t"+par4Ad);
        
        double par1NAd=(double)qa/(double)no;
        double par2NAd=(double)sa/(double)no;
        double par3NAd=(double)ua/(double)no;
        double par4NAd=(double)wa/(double)no;
        
        System.out.println(""+par1NAd+""+par2NAd+""+par3NAd+""+par4NAd+"");
        
        //Probability of adopted over the training set
        double p_Adopted=(double)yes/(double)adoption.length;
        double p_not_Adopted=(double)no/(double)adoption.length;
        
        System.out.println("issue\t"+p_Adopted+"not issue"+p_not_Adopted);
     
        //get Parent1 age
        int c_p1Age = request.getParent().getParent1Age();
        
        //get Parent2 age
        int c_p2Age = request.getParent().getParent2Age();
        
        //get graduation details of mom and dad
        boolean c_mom_graduated = request.getParent().isMother_graduated();
        boolean c_dad_graduated = request.getParent().isFather_graduated();
        
        //get source of income
        double c_source_of_income = request.getParent().getTotalIncome();
        
        int result1 = 1;
        double adopted=0, not_adopted=0;
        
        //first age range with all range of ranges of source_of_income and mom_graduated== true
        if((c_p1Age >=25) && (c_p2Age>=25) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == true)
            result1 = 1;
         
        else if((c_p1Age >=25) && (c_p2Age>=25) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == true)
            result1 = 2;
        
        else if((c_p1Age >=25) && (c_p2Age>=25) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == true)
            result1 = 3;
         
        else if((c_p1Age >=25) && (c_p2Age>=25) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == true)
            result1 = 4;
        
        else if((c_p1Age >=25) && (c_p2Age>=25) && (c_source_of_income>800000) && c_mom_graduated == true)
            result1 = 5;
        
        
           //first age range with all range of ranges of source_of_income and mom_graduated == false 
         if((c_p1Age >=25) && (c_p2Age>=25) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == false)
            result1 = 6;
         
        else if((c_p1Age >=25) && (c_p2Age>=25) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == false)
            result1 = 7;
        
        else if((c_p1Age >=25) && (c_p2Age>=25) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == false)
            result1 = 8;
         
        else if((c_p1Age >=25) && (c_p2Age>=25) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == false)
            result1 = 9;
        
        else if((c_p1Age >=25) && (c_p2Age>=25) && (c_source_of_income>800000) && c_mom_graduated == false)
            result1 = 10;
       
        
        //second age range with all range of ranges of source_of_income and mom_graduated== true
         if((c_p1Age >=25) && (c_p2Age<=30) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == true)
            result1 = 11;
         
        else if((c_p1Age >=25) && (c_p2Age<=30) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == true)
            result1 = 12;
        
        else if((c_p1Age >=25) && (c_p2Age<=30) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == true)
            result1 = 13;
         
        else if((c_p1Age >=25) && (c_p2Age<=30) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == true)
            result1 = 14;
        
        else if((c_p1Age >=25) && (c_p2Age<=30) && (c_source_of_income>800000) && c_mom_graduated == true)
            result1 = 15;
        
         
          //second age range with all range of ranges of source_of_income and mom_graduated== false
         if((c_p1Age >=25) && (c_p2Age<=30) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == false)
            result1 = 16;
         
        else if((c_p1Age >=25) && (c_p2Age<=30) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == false)
            result1 = 17;
        
        else if((c_p1Age >=25) && (c_p2Age<=30) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == false)
            result1 = 18;
         
        else if((c_p1Age >=25) && (c_p2Age<=30) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == false)
            result1 = 19;
        
        else if((c_p1Age >=25) && (c_p2Age<=30) && (c_source_of_income>800000) && c_mom_graduated == false)
            result1 = 20;
        
        
             
         //Third age range with all range of ranges of source_of_income and mom_graduated == true
        else if((c_p1Age >=30) && (c_p2Age<=40) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == true)
            result1 = 21;
         
        else if((c_p1Age >=30) && (c_p2Age<=40) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == true)
            result1 = 22;
        
        else if((c_p1Age >=30) && (c_p2Age<=40) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == true)
            result1 = 23;
         
        else if((c_p1Age >=30) && (c_p2Age<=40) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == true)
            result1 = 24;
        
        else if((c_p1Age >=30) && (c_p2Age<=40) && (c_source_of_income>800000) && c_mom_graduated == true)
            result1 = 25;   
        
     
        //Third age range with all range of ranges of source_of_income and mom_graduated == false
        else if((c_p1Age >=30) && (c_p2Age<=40) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == false)
            result1 = 26;
         
        else if((c_p1Age >=30) && (c_p2Age<=40) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == false)
            result1 = 27;
        
        else if((c_p1Age >=30) && (c_p2Age<=40) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == false)
            result1 = 28;
         
        else if((c_p1Age >=30) && (c_p2Age<=40) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == false)
            result1 = 29;
        
        else if((c_p1Age >=30) && (c_p2Age<=40) && (c_source_of_income>800000) && c_mom_graduated == false)
            result1 = 30; 
        
     
        //Fourth age range with all range of ranges of source_of_income and mom_graduated == true
        else if((c_p1Age >=40) && (c_p2Age<=50) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == true)
            result1 = 31;
         
        else if((c_p1Age >=40) && (c_p2Age<=50) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == true)
            result1 = 32;
        
        else if((c_p1Age >=40) && (c_p2Age<=50) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == true)
            result1 = 33;
         
        else if((c_p1Age >=40) && (c_p2Age<=50) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == true)
            result1 = 34;
        
        else if((c_p1Age >=40) && (c_p2Age<=50) && (c_source_of_income>800000) && c_mom_graduated == true)
            result1 = 35;  
        

           //Fourth age range with all range of ranges of source_of_income and mom_graduated == false
        else if((c_p1Age >=40) && (c_p2Age<=50) && (0<=c_source_of_income && c_source_of_income<=200000) && c_mom_graduated == false)
            result1 = 36;
         
        else if((c_p1Age >=40) && (c_p2Age<=50) && (2100000<=c_source_of_income && c_source_of_income<=400000) && c_mom_graduated == false)
            result1 = 37;
        
        else if((c_p1Age >=40) && (c_p2Age<=50) && (400000<=c_source_of_income && c_source_of_income<=600000) && c_mom_graduated == false)
            result1 = 38;
         
        else if((c_p1Age >=40) && (c_p2Age<=50) && (6100000<=c_source_of_income && c_source_of_income<=800000) && c_mom_graduated == false)
            result1 = 39;
        
        else if((c_p1Age >=40) && (c_p2Age<=50) && (c_source_of_income>800000) && c_mom_graduated == false)
            result1 = 40;   
         
         
         
         switch(result1)
        {
            case 1:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par1Ad * r1I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par1NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par1Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par1NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
                
            case 2:
                if((c_dad_graduated==true))
                {
                    adopted= par1Ad*r2I*prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par1NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par1Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par1Ad*r2NI*prob_dad_not_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
                
            case 3: 
                if(c_dad_graduated == true)
                {
                  adopted= par1Ad*r3I*prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                  not_adopted= par1NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                adopted=par1Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                not_adopted=par1Ad*r3NI*prob_dad_not_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                 System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
                
            case 4:
                if(c_dad_graduated == true)
                {
                  adopted= par1Ad*r4I*prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                  not_adopted= par1NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                adopted=par1Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                not_adopted=par1Ad*r4NI*prob_dad_not_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
                
            case 5:
               if(c_dad_graduated == true)
                {
                  adopted= par1Ad*r5I*prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                  not_adopted= par1NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                adopted=par1Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                not_adopted=par1Ad*r4NI*prob_dad_not_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
          
            case 6:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par1Ad * r1I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par1NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par1Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par1NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
                
            case 7:
                if((c_dad_graduated==true))
                {
                    adopted= par1Ad*r2I*prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par1NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par1Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par1Ad*r2NI*prob_dad_not_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
                
            case 8: 
                if(c_dad_graduated == true)
                {
                  adopted= par1Ad*r3I*prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                  not_adopted= par1NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                adopted=par1Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                not_adopted=par1Ad*r3NI*prob_dad_not_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                 System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
                
            case 9:
                if(c_dad_graduated == true)
                {
                  adopted= par1Ad*r4I*prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                  not_adopted= par1NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                adopted=par1Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                not_adopted=par1Ad*r4NI*prob_dad_not_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
                
            case 10:
               if(c_dad_graduated == true)
                {
                  adopted= par1Ad*r5I*prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                  not_adopted= par1NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                adopted=par1Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                not_adopted=par1Ad*r4NI*prob_dad_not_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                       result = "Parent is eligible for adoption.";
                       return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                     result = "Parent is not eligible for adoption.";
                break;
       
            case 11:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r1I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
               
            case 12:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r2I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r2NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;     
                
            case 13:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r3I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r3NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;       
      
            case 14:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r4I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r4NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;    
                
            case 15:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r5I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r5NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r5NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;    
                
            case 16:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r1I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;         
                
            case 17:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r2I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r2NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;        
                
            case 18:
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r3I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r3NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;     
                
            case 19:
               
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r4I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r4NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
                
            case 20:
                
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par2Ad * r5I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par2NAd*r5NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par2Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par2NAd*r5NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
                         
                
        case 21:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r1I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
         
        case 22:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r2I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par1NAd*r2NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                     result = "Parent is eligible for adoption.";
                     return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;          
        
        case 23:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r3I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r3NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;        
        
           case 24:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r4I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r4NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;           
         
            case 25:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r5I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r5NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r5NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
         
            case 26:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r1I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
         
         
            case 27:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r2I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r2NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 28:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r3I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r3NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
                
            case 29:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r4I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r4NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
                
            case 30:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par3Ad * r5I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par3NAd*r5NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par3Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par3NAd*r5NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;
            
                
            case 31:  
                if((c_dad_graduated==true)) 
                        
                {
                    adopted= par4Ad * r1I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 32:  
                if((c_dad_graduated==true)) 
                        
                {
                    adopted= par4Ad * r2I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r2NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 33:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r3I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r3NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 34:  
                if((c_dad_graduated==true)) 
                        
                {
                    adopted= par4Ad * r4I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r4NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 35:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r5I * prob_dad_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r5NI* prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r5NI*prob_dad_graduated_andNotAdopted*prob_mom_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 36:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r1I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r1NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r1I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r1NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 37:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r2I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r2NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r2I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r2NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 38:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r3I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r3NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r3I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r3NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 39:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r4I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r4NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r4I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r4NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                
            case 40:  
                if((c_dad_graduated==true) ) 
                        
                {
                    adopted= par4Ad * r5I * prob_dad_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted= par4NAd*r5NI* prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                else
                {
                    adopted=par4Ad*r5I*prob_dad_not_graduated_adopted*prob_mom_not_graduated_adopted*p_Adopted;
                    not_adopted=par4NAd*r5NI*prob_dad_graduated_andNotAdopted*prob_mom_not_graduated_andNotAdopted*p_not_Adopted;
                }
                System.out.println("adopted\t"+adopted+"\tnot_adopted\t"+not_adopted);
                if(adopted>not_adopted){
                    System.out.println("Parent eligible for adoption.");
                    result = "Parent is eligible for adoption.";
                    return result;
                }
                else
                    System.out.println("Parent is not eligible for adoption.");
                       result = "Parent is not eligible for adoption.";
                break;  
                     
         
         }
        //Input tuple
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Input tuples");
                
        System.out.println("Enter the age");
        int a1=scanner.nextInt();
        System.out.println("Enter the salary in figures");
        int a2=scanner.nextInt();
        System.out.println("Enter the marital status");
        String a3=scanner.next();
        System.out.println("Enter account balance");
        int a4=scanner.nextInt();
        int result=1;
        double finI=0,finNI=0;
        if((a2>=0)&&(a2<=20000))
            result=1;
        else if((a2>=21000)&&(a2<=40000))
            result=2;
        else if((a2>=41000)&&(a2<=60000))
            result=3;
        else if((a2>=61000)&&(a2<=80000))
            result =4;
        else
            result=5;
        switch(result)
        {
            case 1:
                if(a3.equalsIgnoreCase("Married"))
                {
                    finI=pmandI*r1I*pissue;
                    finNI=pmandNI*r1NI*pnotIssue;
                }
                else
                {
                    finI=puandI*r1I*pissue;
                    finNI=puandNI*r1NI*pnotIssue;
                }
                System.out.println("finI\t"+finI+"\tfinNI\t"+finNI);
                if(finI>finNI)
                    System.out.println("Loan Issued.");
                else
                    System.out.println("Loan Not Issued.");
                break;
            case 2:
                if(a3.equalsIgnoreCase("Married"))
                {
                    finI=pmandI*r2I*pissue;
                    finNI=pmandNI*r2NI*pnotIssue;
                }
                else
                {
                    finI=puandI*r2I*pissue;
                    finNI=puandNI*r2NI*pnotIssue;
                }
                System.out.println("finI\t"+finI+"\tfinNI\t"+finNI);
                if(finI>finNI)
                    System.out.println("Loan Issued.");
                else
                    System.out.println("Loan Not Issued.");
                break;
            case 3:
                if(a3.equalsIgnoreCase("Married"))
                {
                    finI=pmandI*r3I*pissue;
                    finNI=pmandNI*r3NI*pnotIssue;
                }
                else
                {
                    finI=puandI*r3I*pissue;
                    finNI=puandNI*r3NI*pnotIssue;
                }
                System.out.println("finI\t"+finI+"\tfinNI\t"+finNI);
                if(finI>finNI)
                    System.out.println("Loan Issued.");
                else
                    System.out.println("Loan Not Issued.");
                break;
            case 4:
                if(a3.equalsIgnoreCase("Married"))
                {
                    finI=pmandI*r4I*pissue;
                    finNI=pmandNI*r4NI*pnotIssue;
                }
                else
                {
                    finI=puandI*r4I*pissue;
                    finNI=puandNI*r4NI*pnotIssue;
                }
                System.out.println("finI\t"+finI+"\tfinNI\t"+finNI);
                if(finI>finNI)
                    System.out.println("Loan Issued.\t");
                else
                    System.out.println("Loan Not Issued.");
            break;
            case 5:
                if(a3.equalsIgnoreCase("Married"))
                {
                    finI=pmandI*r5I*pissue;
                    finNI=pmandNI*r5NI*pnotIssue;
                }
                else
                {
                    finI=puandI*r5I*pissue;
                    finNI=puandNI*r5NI*pnotIssue;
                }
                System.out.println("finI\t"+finI+"\tfinNI\t"+finNI);
                if(finI>finNI)
                    System.out.println("Loan Issued.");
                else
                    System.out.println("Loan Not Issued.");
        }
                
        
    */
        return result;
    
    

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Result");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(submitJButton)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AnalyticalCheckWorkAreaJPanel mcjp = (AnalyticalCheckWorkAreaJPanel) component;
        mcjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        
        try {
            String result = AnalyticalProcess(request);
            resultJTextField.setText(result);
            request.setMessage(resultJTextField.getText());
            request.setStatus(result);
        } catch (IOException ex) {
            Logger.getLogger(AnalyticalCheckProcessWorkRequestJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(null, "Request sent to Training management office");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
