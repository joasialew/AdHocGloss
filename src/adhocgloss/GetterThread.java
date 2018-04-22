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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class GetterThread implements Runnable{

    @Override
    public void run() {
        ClipGetter cg = new ClipGetter();
        while (true){            
            if (KeyboardUtils.isPressed(VK_CAPS_LOCK) && KeyboardUtils.isPressed(VK_A)){
                try {
                    System.out.println(cg.getSelectedText(User32.INSTANCE, CustomUser32.INSTANCE)); // Ten tekst będzie leciał do 
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
