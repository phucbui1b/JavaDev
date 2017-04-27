/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtcounternamedinnerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnCountListener implements ActionListener {
   AWTCounter frame;
   public BtnCountListener(AWTCounter frame) {
      this.frame = frame;
   }
   
   @Override
   public void actionPerformed(ActionEvent evt) {
      frame.count++;
      frame.tfCount.setText(frame.count + "");
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class AWTCounter {

        public AWTCounter() {
        }
    }
}