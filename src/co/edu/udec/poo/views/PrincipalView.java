/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.udec.poo.views;

import co.edu.udec.poo.modelos.entidades.User;
import javax.swing.JOptionPane;

/**
 *
 * @author redhood
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        BarraMenu = new javax.swing.JMenuBar();
        menuBook = new javax.swing.JMenu();
        itemSearchBook = new javax.swing.JMenuItem();
        itemAddBook = new javax.swing.JMenuItem();
        itemEditBook = new javax.swing.JMenuItem();
        itemDeleteBook = new javax.swing.JMenuItem();
        menuSearchBook = new javax.swing.JMenu();
        itemSearchBookByAuthor = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuLoans = new javax.swing.JMenu();
        menuSearchLoan = new javax.swing.JMenu();
        itemSearchLoanByDate = new javax.swing.JMenuItem();
        itemSearchLoanByUser = new javax.swing.JMenuItem();
        itemAddLoan = new javax.swing.JMenuItem();
        itemEditLoan = new javax.swing.JMenuItem();
        itemDeleteLoan = new javax.swing.JMenuItem();
        menuUsers = new javax.swing.JMenu();
        itemSearchUser = new javax.swing.JMenuItem();
        itemAddUser = new javax.swing.JMenuItem();
        itemEditUser = new javax.swing.JMenuItem();
        itemDeleteUser = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemReportesTodosUsers = new javax.swing.JMenuItem();
        itemReportesUsersByName = new javax.swing.JMenuItem();
        itemReportesUsersByID = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        itemHelp = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Digital");

        menuBook.setText("Books");
        menuBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBookActionPerformed(evt);
            }
        });

        itemSearchBook.setText("Search Book");
        itemSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchBookActionPerformed(evt);
            }
        });
        menuBook.add(itemSearchBook);

        itemAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-add-24.png"))); // NOI18N
        itemAddBook.setText("Add Book");
        itemAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddBookActionPerformed(evt);
            }
        });
        menuBook.add(itemAddBook);

        itemEditBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-editar-24.png"))); // NOI18N
        itemEditBook.setText("Edit Book");
        itemEditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditBookActionPerformed(evt);
            }
        });
        menuBook.add(itemEditBook);

        itemDeleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-basura-24.png"))); // NOI18N
        itemDeleteBook.setText("Delete Book");
        itemDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteBookActionPerformed(evt);
            }
        });
        menuBook.add(itemDeleteBook);

        menuSearchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icons-reports.png"))); // NOI18N
        menuSearchBook.setText("Reports Books");

        itemSearchBookByAuthor.setText("By Title");
        menuSearchBook.add(itemSearchBookByAuthor);

        jMenuItem3.setText("By Author");
        menuSearchBook.add(jMenuItem3);

        menuBook.add(menuSearchBook);

        BarraMenu.add(menuBook);

        menuLoans.setText("Loans");

        menuSearchLoan.setText("Search Loan");

        itemSearchLoanByDate.setText("By Date");
        menuSearchLoan.add(itemSearchLoanByDate);

        itemSearchLoanByUser.setText("By User");
        menuSearchLoan.add(itemSearchLoanByUser);

        menuLoans.add(menuSearchLoan);

        itemAddLoan.setText("Add Loan");
        itemAddLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddLoanActionPerformed(evt);
            }
        });
        menuLoans.add(itemAddLoan);

        itemEditLoan.setText("Edit Loan");
        itemEditLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditLoanActionPerformed(evt);
            }
        });
        menuLoans.add(itemEditLoan);

        itemDeleteLoan.setText("Delete Loan");
        menuLoans.add(itemDeleteLoan);

        BarraMenu.add(menuLoans);

        menuUsers.setText("Users");

        itemSearchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-busqueda-24.png"))); // NOI18N
        itemSearchUser.setText("Search User");
        itemSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchUserActionPerformed(evt);
            }
        });
        menuUsers.add(itemSearchUser);

        itemAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-add-24.png"))); // NOI18N
        itemAddUser.setText("Add User");
        itemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddUserActionPerformed(evt);
            }
        });
        menuUsers.add(itemAddUser);

        itemEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-editar-24.png"))); // NOI18N
        itemEditUser.setText("Edit User");
        itemEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditUserActionPerformed(evt);
            }
        });
        menuUsers.add(itemEditUser);

        itemDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icon-basura-24.png"))); // NOI18N
        itemDeleteUser.setText("Delete User");
        menuUsers.add(itemDeleteUser);

        menuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/views/icons/icons-reports.png"))); // NOI18N
        menuReportes.setText("Reportes");

        itemReportesTodosUsers.setText("All");
        itemReportesTodosUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesTodosUsersActionPerformed(evt);
            }
        });
        menuReportes.add(itemReportesTodosUsers);

        itemReportesUsersByName.setText("By Name");
        itemReportesUsersByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesUsersByNameActionPerformed(evt);
            }
        });
        menuReportes.add(itemReportesUsersByName);

        itemReportesUsersByID.setText("By ID");
        menuReportes.add(itemReportesUsersByID);

        menuUsers.add(menuReportes);

        BarraMenu.add(menuUsers);

        menuHelp.setText("Help");

        itemHelp.setText("About");
        menuHelp.add(itemHelp);

        BarraMenu.add(menuHelp);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddUserActionPerformed
        ViewUsuarios view = new ViewUsuarios(this, true);
        view.setLocationRelativeTo(this);
        view.setVisible(true);
    }//GEN-LAST:event_itemAddUserActionPerformed

    private void itemEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditUserActionPerformed

    private void itemAddLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAddLoanActionPerformed

    private void itemEditLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditLoanActionPerformed

    private void itemEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditBookActionPerformed

    private void itemAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddBookActionPerformed
        ViewBooks viewBooks = new ViewBooks(this, true);
        viewBooks.setLocationRelativeTo(this);
        viewBooks.setVisible(true);
    }//GEN-LAST:event_itemAddBookActionPerformed

    private void itemDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDeleteBookActionPerformed

    private void itemSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchUserActionPerformed
        itemAddUserActionPerformed(evt);
    }//GEN-LAST:event_itemSearchUserActionPerformed

    private void itemReportesUsersByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesUsersByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesUsersByNameActionPerformed

    private void itemReportesTodosUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesTodosUsersActionPerformed
        if(User.usersDB == null || User.usersDB.isEmpty()) {
          JOptionPane.showMessageDialog(this, "No existen usuarios en el sistema.", "Resultado Negativo", JOptionPane.WARNING_MESSAGE);
          return;
        }
        
        ViewReportsUsers viewReports = new ViewReportsUsers(this, true);
        viewReports.setLocationRelativeTo(this);
        viewReports.setVisible(true);
    }//GEN-LAST:event_itemReportesTodosUsersActionPerformed

    private void itemSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSearchBookActionPerformed

    private void menuBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBookActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem itemAddBook;
    private javax.swing.JMenuItem itemAddLoan;
    private javax.swing.JMenuItem itemAddUser;
    private javax.swing.JMenuItem itemDeleteBook;
    private javax.swing.JMenuItem itemDeleteLoan;
    private javax.swing.JMenuItem itemDeleteUser;
    private javax.swing.JMenuItem itemEditBook;
    private javax.swing.JMenuItem itemEditLoan;
    private javax.swing.JMenuItem itemEditUser;
    private javax.swing.JMenuItem itemHelp;
    private javax.swing.JMenuItem itemReportesTodosUsers;
    private javax.swing.JMenuItem itemReportesUsersByID;
    private javax.swing.JMenuItem itemReportesUsersByName;
    private javax.swing.JMenuItem itemSearchBook;
    private javax.swing.JMenuItem itemSearchBookByAuthor;
    private javax.swing.JMenuItem itemSearchLoanByDate;
    private javax.swing.JMenuItem itemSearchLoanByUser;
    private javax.swing.JMenuItem itemSearchUser;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuBook;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuLoans;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuSearchBook;
    private javax.swing.JMenu menuSearchLoan;
    private javax.swing.JMenu menuUsers;
    // End of variables declaration//GEN-END:variables
}
