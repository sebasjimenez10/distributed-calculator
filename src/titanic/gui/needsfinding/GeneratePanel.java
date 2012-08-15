/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package titanic.gui.needsfinding;

import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Menes
 */
public class GeneratePanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneratePanel
     */
    public GeneratePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        msPaintButton = new javax.swing.JButton();
        msPowerPntButton = new javax.swing.JButton();
        cmapToolButton = new javax.swing.JButton();
        returnBackButton = new javax.swing.JLabel();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        setLayout(layout);

        msPaintButton.setText("MS Paint");
        msPaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msPaintButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(msPaintButton, gridBagConstraints);

        msPowerPntButton.setText("MS PowerPoint");
        msPowerPntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msPowerPntButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(msPowerPntButton, gridBagConstraints);

        cmapToolButton.setText("CMapTools");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        add(cmapToolButton, gridBagConstraints);

        returnBackButton.setText("<- Back");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        add(returnBackButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void msPaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msPaintButtonActionPerformed
        String command =  "cmd /C start mspaint";
        try {
            Process process = Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "MS Paint no se pudo iniciar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_msPaintButtonActionPerformed

    private void msPowerPntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msPowerPntButtonActionPerformed
        String command =  "cmd /C start powerpnt";
        try {
            Process process = Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "MS PowerPoint no se pudo iniciar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_msPowerPntButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmapToolButton;
    private javax.swing.JButton msPaintButton;
    private javax.swing.JButton msPowerPntButton;
    private javax.swing.JLabel returnBackButton;
    // End of variables declaration//GEN-END:variables

    public JButton getCmapToolButton() {
        return cmapToolButton;
    }

    public void setCmapToolButton(JButton cmapToolButton) {
        this.cmapToolButton = cmapToolButton;
    }

    public JButton getMsPaintButton() {
        return msPaintButton;
    }

    public void setMsPaintButton(JButton msPaintButton) {
        this.msPaintButton = msPaintButton;
    }

    public JButton getMsPowerPntButton() {
        return msPowerPntButton;
    }

    public void setMsPowerPntButton(JButton msPowerPntButton) {
        this.msPowerPntButton = msPowerPntButton;
    }

    public JLabel getReturnBackButton() {
        return returnBackButton;
    }

    public void setReturnBackButton(JLabel returnBackButton) {
        this.returnBackButton = returnBackButton;
    }
}
