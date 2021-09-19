/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreresult;

import java.util.Scanner;
/**
 *
 * @author aomms
 */
public class ScoreResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        ScoreBean mySource = new ScoreBean();
        listener1 listener1  = new listener1();
        listener2 listener2 = new listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        String score;
        do {
            System.out.print("Enter Score ");
            score = inp.nextLine();
            if (!score.isEmpty()) {
                mySource.setScore(score);
            }
        } while (!score.isEmpty());
    }
    
}
