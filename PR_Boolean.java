/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pr_boolean;

/**
 *
 * @author ASUS
 */
public class PR_Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 21;
        boolean cantik = false;
        
        if (umur > 23 && cantik == true){
            System.out.println("MAU BANGET");
        }
        else if (umur > 23 ){
            System.out.println("PIKIR-PIKIR DULU");
        }
        else{
            System.out.println("NO WAY !!!!");
        }
    }
}
