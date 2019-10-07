/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugdemo1;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class DebugDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(Integer.SIZE);
        myNums.add(23);
        myNums.add(12);        
        System.out.println(myNums);
        double sum = 0;
        for(Integer n : myNums){
            sum+=n;
        }
        double avg = sum/myNums.size();
        System.out.println("Average: "+avg);
    }
    
}
