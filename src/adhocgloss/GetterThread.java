/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import adhocgloss.ClipGetter.CustomUser32;
import com.sun.jna.platform.KeyboardUtils;
import com.sun.jna.platform.win32.User32;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_CAPS_LOCK;
import static java.awt.event.KeyEvent.VK_G;
import static java.awt.event.KeyEvent.VK_H;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class GetterThread implements Runnable{

    @Override
    public void run() {
        System.out.println("w watku");
        ClipGetter cg = new ClipGetter();
        String copied = "";
        while (true){            
            if (KeyboardUtils.isPressed(VK_H) && KeyboardUtils.isPressed(VK_A)&& KeyboardUtils.isPressed(VK_G)){
                try {
                    copied = cg.getSelectedText(User32.INSTANCE, CustomUser32.INSTANCE);
                    new EditDisp(copied).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GetterThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GetterThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
}
