/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main2.java
 *
 * Created on 12.02.2010, 17:09:26
 */

package worldtimeclock;

/**
 *
 * @author hansolo
 */
public class Main2 extends javax.swing.JFrame {

    /** Creates new form Main2 */
    public Main2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel1 = new worldtimeclock.BackgroundPanel();
        clockPanelDayNight1 = new worldtimeclock.ClockPanelDayNight();
        clockPanelDayNight2 = new worldtimeclock.ClockPanelDayNight();
        clockPanelDayNight3 = new worldtimeclock.ClockPanelDayNight();
        clockPanelDayNight4 = new worldtimeclock.ClockPanelDayNight();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel1.setName("backgroundPanel1"); // NOI18N

        clockPanelDayNight1.setCity(worldtimeclock.City.HongKong);
        clockPanelDayNight1.setName("clockPanelDayNight1"); // NOI18N

        clockPanelDayNight2.setName("clockPanelDayNight2"); // NOI18N

        clockPanelDayNight3.setCity(worldtimeclock.City.NewYork);
        clockPanelDayNight3.setName("clockPanelDayNight3"); // NOI18N

        clockPanelDayNight4.setCity(worldtimeclock.City.SanFrancisco);
        clockPanelDayNight4.setName("clockPanelDayNight4"); // NOI18N

        org.jdesktop.layout.GroupLayout backgroundPanel1Layout = new org.jdesktop.layout.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(backgroundPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clockPanelDayNight1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clockPanelDayNight2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clockPanelDayNight3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clockPanelDayNight4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(clockPanelDayNight1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(clockPanelDayNight2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(clockPanelDayNight3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(clockPanelDayNight4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 390, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private worldtimeclock.BackgroundPanel backgroundPanel1;
    private worldtimeclock.ClockPanelDayNight clockPanelDayNight1;
    private worldtimeclock.ClockPanelDayNight clockPanelDayNight2;
    private worldtimeclock.ClockPanelDayNight clockPanelDayNight3;
    private worldtimeclock.ClockPanelDayNight clockPanelDayNight4;
    // End of variables declaration//GEN-END:variables

}
