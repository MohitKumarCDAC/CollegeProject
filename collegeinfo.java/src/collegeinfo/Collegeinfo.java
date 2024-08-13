/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collegeinfo;

/**
 *
 * @author mohit kumar
 */
public class Collegeinfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clgconnection.connect();
        
        
        
        Home ho=new Home();
        ho.setVisible(true);
        
        try {
             for(int i=0; i<=100; i++)
        {
         Thread.sleep(30);
         Home.lblbar.setText(Integer.toString(i)+"%");
         Home.progress.setValue(i);
         
         
        }
             ho.setVisible(false);
             new main().show();
        } catch (Exception e) {
        }
    }
    
}
