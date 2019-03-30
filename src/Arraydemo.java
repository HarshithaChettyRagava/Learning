/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetty Ragava,Harshitha
 */
public class Arraydemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] grades = new int[5];
        grades[4]=99;
        for(int i=0; i<grades.length;i++){
            System.out.println(grades[i]);
//            grades[i]=Math.sqrt("double j");
//            Math.pow(i, i)
            System.out.println("********************");
         for(int j=0;j<grades.length;j++){
             grades[j]=23*j;
         }
         for(int k=0;k<grades.length;k++){
             System.out.println(grades[k]);
         }
        }
            
    }
    
}
