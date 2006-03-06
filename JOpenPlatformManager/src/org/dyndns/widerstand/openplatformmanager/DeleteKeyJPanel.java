/*
 * DeleteKeyJPanel.java
 *
 * Created on 23. Februar 2005, 11:34
 */

package org.dyndns.widerstand.openplatformmanager;

import java.awt.Dimension;
import org.dyndns.widerstand.OpenPlatform.*;
import java.awt.GridBagConstraints;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author  Widerstand
 */
public class DeleteKeyJPanel extends javax.swing.JPanel {
    
    private MainJFrame parent;
    private SwingUtil swingUtil;
    private JButton jButtonGetKeyInformationTemplates;
    private JPanel jPanelAvailableKeys;
    private JPanel jPanelKeyInformationTemplates;
    
    /** Creates new form DeleteKeyJPanel */
    public DeleteKeyJPanel(MainJFrame parent) {
        this.parent = parent;
        swingUtil = new SwingUtil();
        initComponents();
    }
    
    private void initConditionalComponents() {
        if (jPanelKeyInformationTemplates != null)
            jPanel8.remove(jPanelKeyInformationTemplates);
        java.awt.GridBagConstraints gridBagConstraints;
        jButtonGetKeyInformationTemplates = new javax.swing.JButton();
        jPanelKeyInformationTemplates = new javax.swing.JPanel();
        jPanelAvailableKeys = new javax.swing.JPanel();

        jButtonGetKeyInformationTemplates.setText("Get Key Information");
        jButtonGetKeyInformationTemplates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetKeyInformationTemplatesActionPerformed(evt);
            }
        });
        
        jPanelKeyInformationTemplates.setLayout(new java.awt.GridBagLayout());
        
        jPanelAvailableKeys.setLayout(new java.awt.GridLayout(0, 4));
        jPanelAvailableKeys.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Available Keys"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jPanelAvailableKeys.setMinimumSize(new java.awt.Dimension(600, 36));
        jPanelAvailableKeys.setPreferredSize(new java.awt.Dimension(600, 36));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelKeyInformationTemplates.add(jPanelAvailableKeys, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelKeyInformationTemplates.add(jButtonGetKeyInformationTemplates, gridBagConstraints);
                
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel8.add(jPanelKeyInformationTemplates, gridBagConstraints);
    }
    
    private void removeConditionalComponents() {
        if (jPanelKeyInformationTemplates != null)
            jPanel8.remove(jPanelKeyInformationTemplates);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabelKeySetVersion = new javax.swing.JLabel();
        jTextFieldKeySetVersion = new javax.swing.JTextField();
        jLabelKeyIndex = new javax.swing.JLabel();
        jTextFieldKeyIndex = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Delete Key"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Key Set Version Parameters"), new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
        jLabelKeySetVersion.setText("Key Set Version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jLabelKeySetVersion, gridBagConstraints);

        jTextFieldKeySetVersion.setColumns(4);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jTextFieldKeySetVersion, gridBagConstraints);

        jLabelKeyIndex.setText("Key Index");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jLabelKeyIndex, gridBagConstraints);

        jTextFieldKeyIndex.setColumns(4);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jTextFieldKeyIndex, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel8.add(jPanel7, gridBagConstraints);

        jButton1.setText("Delete Key");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel8.add(jButton1, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel8);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
    
    private void jButtonGetKeyInformationTemplatesActionPerformed(java.awt.event.ActionEvent evt) {
        refresh();
    }
    
    public void refresh() {
        if (Arrays.equals(parent.session.selectedApplication, OPSPApplet.OPSP_CARD_MANAGER_AID)) {
            initConditionalComponents();
            byte keyInformationTemplate = 0;
            OPSPKeyInformation keyInfos[] = null;
            try {
                Class parameterTypes[] = new Class[] {Long.TYPE, OPSPSecurityInfo.class,
                        OPSPCardConnectionInfo.class, Byte.TYPE};
                        Object parameters[] = new Object[] {parent.session.cardHandle,
                                parent.session.secInfo, parent.session.cardInfo, keyInformationTemplate};
                                
                                keyInfos = (OPSPKeyInformation [])WaitForMethodJDialog.showDialog(parent,
                                        "org.dyndns.widerstand.OpenPlatform.OPSPWrapper",
                                        "getKeyInformationTemplates", null, parameterTypes, parameters);
                                
            } catch (OPSPException e) {
//                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(),
//                        "Open Platform Error", javax.swing.JOptionPane.ERROR_MESSAGE);
//                return;
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Generel Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            jPanelAvailableKeys.removeAll();
            if (keyInfos != null && keyInfos.length > 0) {
                jPanelAvailableKeys.setPreferredSize(null);
                jPanelAvailableKeys.setMinimumSize(null);
            } else {
                Dimension dim = new Dimension(600, 36);
                jPanelAvailableKeys.setPreferredSize(dim);
                jPanelAvailableKeys.setMinimumSize(dim);
            }
            GridBagConstraints gridBagConstraints;
            JLabel jLabel1;
            JPanel jPanel1;
            JTextField jTextField1;
            if (keyInfos != null) {
                for (int h=0; h < keyInfos.length; h++) {
                    OPSPKeyInformation keyInfo = keyInfos[h];
                    jPanel1 = new JPanel();
                    jPanel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder("Key"),
                            new javax.swing.border.EmptyBorder(new java.awt.Insets(5, 5, 5, 5))));
                    jPanel1.setLayout(new java.awt.GridBagLayout());
                    jLabel1 = new JLabel("Key Set Version");
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = 0;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jLabel1, gridBagConstraints);
                    
                    jLabel1 = new JLabel("Key Index");
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = 1;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jLabel1, gridBagConstraints);
                    
                    jLabel1 = new JLabel("Key Type");
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = 2;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jLabel1, gridBagConstraints);
                    
                    jLabel1 = new JLabel("Key Length");
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = 3;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jLabel1, gridBagConstraints);
                    
                    jTextField1 = new JTextField(Byte.toString(keyInfo.keySetVersion));
                    jTextField1.setColumns(4);
                    jTextField1.setEnabled(false);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = 0;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jTextField1, gridBagConstraints);
                    
                    jTextField1 = new JTextField(Byte.toString(keyInfo.keyIndex));
                    jTextField1.setColumns(4);
                    jTextField1.setEnabled(false);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = 1;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jTextField1, gridBagConstraints);
                    
                    if (keyInfo.keyType == OPSPKeyInformation.OPSP_KEY_TYPE_3DES) {
                        jTextField1 = new JTextField("3DES");
                    } else if (keyInfo.keyType == OPSPKeyInformation.OPSP_KEY_TYPE_RSA) {
                        jTextField1 = new JTextField("RSA");
                    } else {
                        jTextField1 = new JTextField(
                                Integer.toString(((int)keyInfo.keyType) & 0x000000ff, 16).toUpperCase());
                    }
                    jTextField1.setEnabled(false);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = 2;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jTextField1, gridBagConstraints);
                    
                    jTextField1 = new JTextField(Byte.toString(keyInfo.keyLength));
                    jTextField1.setColumns(4);
                    jTextField1.setEnabled(false);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = 3;
                    gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
                    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                    jPanel1.add(jTextField1, gridBagConstraints);
                    Dimension d1 = jTextField1.getSize();
                    Dimension d2 = jLabel1.getSize();
                    jPanelAvailableKeys.add(jPanel1);
                }
            }
            jPanel8.revalidate();
        }
        else {
            removeConditionalComponents();
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        swingUtil.resetJComponentColor();
        Short dummy;
        byte keySetVersion;
        try {
            dummy = Short.decode(jTextFieldKeySetVersion.getText());
            if (dummy > 255 || dummy < 0)
                throw new NumberFormatException();
            keySetVersion = dummy.byteValue();
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jTextFieldKeySetVersion,
                    "Colored text field cannot be understood as a correct Number", "Wrong Number Format");
            return;
        }
        byte keyIndex;
        try {
            dummy = Short.decode(jTextFieldKeyIndex.getText());
            if (dummy > 255 || dummy < 0)
                throw new NumberFormatException();
            keyIndex = dummy.byteValue();
        } catch (NumberFormatException e) {
            swingUtil.errorInJComponent(this, jTextFieldKeyIndex,
                    "Colored text field cannot be understood as a correct Number", "Wrong Number Format");
            return;
        }
        int approve = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want delete the key(s)?",
                "Delete confirmation", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (approve != javax.swing.JOptionPane.YES_OPTION)
            return;
        try {
            Class parameterTypes[] = new Class[] {Long.TYPE, OPSPSecurityInfo.class,
                    OPSPCardConnectionInfo.class, Byte.TYPE, Byte.TYPE};
                    Object parameters[] = new Object[] {parent.session.cardHandle, parent.session.secInfo,
                            parent.session.cardInfo, keySetVersion, keyIndex};
                            
                            OPSPReceiptData receiptData = (OPSPReceiptData)WaitForMethodJDialog.showDialog(parent,
                                    "org.dyndns.widerstand.OpenPlatform.OPSPWrapper",
                                    "deleteKey", null, parameterTypes, parameters);
        } catch (OPSPException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Open Platform Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Generel Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Key deleted.", "Open Platform Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        refresh();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelKeyIndex;
    private javax.swing.JLabel jLabelKeySetVersion;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldKeyIndex;
    private javax.swing.JTextField jTextFieldKeySetVersion;
    // End of variables declaration//GEN-END:variables
    
}
