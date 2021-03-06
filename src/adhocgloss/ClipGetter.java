/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

/**
 *
 * @author User
 */

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.win32.StdCallLibrary;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ClipGetter implements ClipboardOwner {
    public interface CustomUser32 extends StdCallLibrary {
        CustomUser32 INSTANCE = (CustomUser32) Native.loadLibrary("user32", CustomUser32.class);
        HWND GetForegroundWindow();
        void keybd_event(byte bVk, byte bScan, int dwFlags, int dwExtraInfo);
    }

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        // dummy: needed for `ClipboardOwner`
    }

    void controlC(CustomUser32 customUser32) {
        /*try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_C);
            robot.keyPress(KeyEvent.VK_CONTROL);
            
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            System.out.println("w cntr c");

        } catch (AWTException e) {
            e.printStackTrace();
        }*/
        
        customUser32.keybd_event((byte) 0x11 /* VK_CONTROL*/, (byte) 0, 0, 0);
        customUser32.keybd_event((byte) 0x43 /* 'C' */, (byte) 0, 0, 0);
        customUser32.keybd_event((byte) 0x43 /* 'C' */, (byte) 0, 2 /* KEYEVENTF_KEYUP */, 0);
        customUser32.keybd_event((byte) 0x11 /* VK_CONTROL*/, (byte) 0, 2 /* KEYEVENTF_KEYUP */, 0);// 'Left Control Up
    
    }

    String getClipboardText() throws Exception {
        return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
    }

    void setClipboardText(String data) throws Exception {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(data), this);
    }

    String getSelectedText(User32 user32, CustomUser32 customUser32) throws Exception {
        HWND hwnd = customUser32.GetForegroundWindow();
        char[] windowText = new char[512];
        user32.GetWindowText(hwnd, windowText, 512);
        String windowTitle = Native.toString(windowText);
        System.out.println("Will take selected text from the following window: [" + windowTitle + "]");
        String before = getClipboardText();
        controlC(customUser32); // emulate Ctrl C
        Thread.sleep(100); // give it some time
        String text = getClipboardText();
        System.out.println("Currently in clipboard: " + text);
        // restore what was previously in the clipboard
        setClipboardText(before);
        return text;
    }

}