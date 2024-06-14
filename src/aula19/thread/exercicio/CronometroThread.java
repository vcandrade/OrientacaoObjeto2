/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19.thread.exercicio;

public class CronometroThread extends Thread {

    private CronometroWindow cronometroWindow;
    
    public CronometroThread(CronometroWindow cronometroWindow) {
        
        this.cronometroWindow = cronometroWindow;
    }

    @Override
    public void run() {
        
        try {
            
            while(!isInterrupted()) {

                this.cronometroWindow.getLblContador().setText(String.valueOf(cronometroWindow.getContador()));
                this.cronometroWindow.setContador(cronometroWindow.getContador() + 1);

                Thread.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
        
            Thread.currentThread().interrupt();
        }
    }
}
