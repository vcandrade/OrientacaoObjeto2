/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19.thread.exercicio;

import javax.swing.JOptionPane;

public class CronometroThread extends Thread {

    private CronometroWindow cronometroWindow;
    
    public CronometroThread(CronometroWindow cronometroWindow) {
        
        this.cronometroWindow = cronometroWindow;
    }

    @Override
    public void run() {
        
        try {
            
            while(true) {

                this.cronometroWindow.getLblContador().setText(String.valueOf(cronometroWindow.getContador()));
                this.cronometroWindow.setContador(cronometroWindow.getContador() + 1);

                this.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
        
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
