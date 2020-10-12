
package kbc;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class Question5 extends javax.swing.JFrame {

    /**
     * Creates new form SwingTimer
     */
    int flag=0;
    Timer t;
    public Question5() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnstart = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnstop1 = new javax.swing.JButton();
        btnstop2 = new javax.swing.JButton();
        lblTimer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnstart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnstart.setForeground(new java.awt.Color(255, 102, 0));
        btnstart.setText("100% YES");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        btnstop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnstop.setForeground(new java.awt.Color(0, 255, 0));
        btnstop.setText("50% YES");
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARE YOU WANT TO PLAY MORE?");

        btnstop1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnstop1.setForeground(new java.awt.Color(102, 0, 204));
        btnstop1.setText("NO");
        btnstop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstop1ActionPerformed(evt);
            }
        });

        btnstop2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnstop2.setForeground(new java.awt.Color(102, 102, 0));
        btnstop2.setText("WANT TO THINK");
        btnstop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstop2ActionPerformed(evt);
            }
        });

        lblTimer.setBackground(new java.awt.Color(255, 255, 255));
        lblTimer.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 0, 0));
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("jeeto to Maane");
        lblTimer.setAutoscrolls(true);
        lblTimer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("KNOWLEDGE IS WEALTH, FROM IT BECOME WEALTHY NOW");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DARE TO WIN THIS GAME");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("By Hritik Jain");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(lblTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstop2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnstop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnstop1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstart, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(btnstop))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstop1)
                    .addComponent(btnstop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(127, 127, 127))
        );

        pack();
    }                      
 private int k=60;
    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {                                         
 if(flag==0){ jLabel1.setText("WHAT IS THE MELTING POINT OF ICE IN DEGREE CELCIUS");                                       
btnstart.setText("0 DEGREE");
btnstop.setText("1 DEGREE");
btnstop1.setText("-1 DEGREE");
btnstop2.setText("100 DEGREE");
       Timer t;
    t=new Timer(1000,new ActionListener() {
      
        
              
          public void actionPerformed(ActionEvent ae) {
              lblTimer.setText(String.valueOf(k));
                 k--;
               if(k<0)
             {
              lblTimer.setText("YOU LOSE");
              
             }
             }
      });
      t.start();
      flag=1;}
 else if(flag==1)
     {
          Question6 q2=new Question6();
   q2.setExtendedState(MAXIMIZED_BOTH);    q2.getContentPane().setBackground(Color.CYAN);q2.setVisible(true);
     this.dispose(); }
    }                                        

    private void btnstop2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     if(flag==0){ Lose l=new Lose();
        l.setExtendedState(MAXIMIZED_BOTH);
     l.setVisible(true);
     this.dispose();
     flag=1;
     } if(flag==1)
     {
          Lose q2=new Lose();
   q2.setExtendedState(MAXIMIZED_BOTH);q2.setVisible(true);
     this.dispose();}
    }                                        

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {                                        
 if(flag==0){ Lose l=new Lose();
    l.setExtendedState(MAXIMIZED_BOTH);
     l.setVisible(true);
     this.dispose();
     flag=1;
 } 
 if(flag==1)
     {
          Lose q2=new Lose();
             q2.setExtendedState(MAXIMIZED_BOTH);
q2.setVisible(true);
     this.dispose();}// TODO add your handling code here:
    }                                       

    private void btnstop1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  if(flag==0){ Lose l=new Lose();
     l.setExtendedState(MAXIMIZED_BOTH);
     l.setVisible(true);
     this.dispose();
     flag=1;}   if(flag==1)
     {
          Lose q2=new Lose();
             q2.setExtendedState(MAXIMIZED_BOTH);
q2.setVisible(true);
     this.dispose();}    // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }           
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
            java.util.logging.Logger.getLogger(SwingTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Question5 k=new Question5();
                k.getContentPane().setBackground(Color.CYAN);
                k.setTitle("Question:5");
                   k.setExtendedState(MAXIMIZED_BOTH);
                k.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnstop;
    private javax.swing.JButton btnstop1;
    private javax.swing.JButton btnstop2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTimer;
    // End of variables declaration                   
}
/*   
    Timer t;
    t=new Timer(1000,new ActionListener() {
      
          int k=100;
          public void actionPerformed(ActionEvent ae) {
              lblTimer.setText(String.valueOf(k));
              k--;
          }
      });
      t.start();*/