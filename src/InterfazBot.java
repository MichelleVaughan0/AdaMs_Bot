
import chatbotcontrol.Control;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michelle HV
 */
public class InterfazBot extends javax.swing.JFrame {

    /**
     * Creates new form InterfazBot
     */
    public InterfazBot() {
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

        background = new JPanel();
        banner = new JPanel();
        nombreImg = new JLabel();
        online = new JLabel();
        jLabel1 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTextArea1 = new JTextArea();
        mensaje = new JTextField();
        Enviar = new JPanel();
        enviarLb = new JLabel();
        jScrollPane1 = new JScrollPane();
        texto = new JTextArea();
        barra = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new Color(255, 255, 255));
        background.setLayout(new AbsoluteLayout());

        banner.setBackground(new Color(190, 103, 255));
        banner.setLayout(new AbsoluteLayout());

        nombreImg.setFont(new Font("Lady Nature", 1, 45)); // NOI18N
        nombreImg.setForeground(new Color(255, 255, 255));
        nombreImg.setIcon(new ImageIcon(getClass().getResource("/srcImagenes/OFICIAL ESTE SI.png"))); // NOI18N
        nombreImg.setMaximumSize(new Dimension(160, 160));
        nombreImg.setPreferredSize(new Dimension(160, 160));
        banner.add(nombreImg, new AbsoluteConstraints(40, 50, 180, 180));

        online.setFont(new Font("Champagne & Limousines", 1, 18)); // NOI18N
        online.setForeground(new Color(255, 255, 255));
        online.setText("Online");
        banner.add(online, new AbsoluteConstraints(100, 280, -1, -1));

        jLabel1.setFont(new Font("Lady Nature", 1, 36)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("ADA MS");
        jLabel1.setToolTipText("");
        banner.add(jLabel1, new AbsoluteConstraints(70, 240, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new Color(190, 103, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Philosopher", 1, 14)); // NOI18N
        jTextArea1.setForeground(new Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Hola me llamo Ada y soy una \ngran fan de Adam Sandler. \n\n     ¿Quieres conversar?");
        jTextArea1.setAlignmentX(10.0F);
        jTextArea1.setAlignmentY(10.0F);
        jTextArea1.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleParent(null);

        banner.add(jScrollPane2, new AbsoluteConstraints(40, 330, 190, 80));

        background.add(banner, new AbsoluteConstraints(463, 30, 260, 510));

        mensaje.setFont(new Font("Philosopher", 0, 14)); // NOI18N
        mensaje.setForeground(new Color(153, 153, 153));
        mensaje.setText("Escribe un mensaje para Ada");
        mensaje.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        mensaje.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                mensajeMousePressed(evt);
            }
        });
        mensaje.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                mensajeKeyPressed(evt);
            }
        });
        background.add(mensaje, new AbsoluteConstraints(10, 470, 280, 60));

        Enviar.setBackground(new Color(190, 103, 255));
        Enviar.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        Enviar.setToolTipText("");
        Enviar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Enviar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                EnviarMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                EnviarMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                EnviarMouseExited(evt);
            }
        });
        Enviar.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                EnviarKeyPressed(evt);
            }
        });

        enviarLb.setFont(new Font("Lady Nature", 0, 24)); // NOI18N
        enviarLb.setForeground(new Color(255, 255, 255));
        enviarLb.setHorizontalAlignment(SwingConstants.CENTER);
        enviarLb.setText("Enviar");

        GroupLayout EnviarLayout = new GroupLayout(Enviar);
        Enviar.setLayout(EnviarLayout);
        EnviarLayout.setHorizontalGroup(EnviarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, EnviarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enviarLb, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        EnviarLayout.setVerticalGroup(EnviarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(EnviarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enviarLb, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        background.add(Enviar, new AbsoluteConstraints(300, 470, 150, 60));

        texto.setEditable(false);
        texto.setColumns(20);
        texto.setFont(new Font("Philosopher", 0, 14)); // NOI18N
        texto.setRows(5);
        texto.setBorder(null);
        texto.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        texto.setSelectionColor(new Color(153, 0, 255));
        jScrollPane1.setViewportView(texto);

        background.add(jScrollPane1, new AbsoluteConstraints(10, 40, 440, 420));

        barra.setBackground(new Color(122, 62, 181));

        GroupLayout barraLayout = new GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(barraLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(barraLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background.add(barra, new AbsoluteConstraints(0, 0, 730, 30));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarMouseEntered(MouseEvent evt) {//GEN-FIRST:event_EnviarMouseEntered
        // TODO add your handling code here:
        Enviar.setBackground(new Color(122,62,181));
    }//GEN-LAST:event_EnviarMouseEntered

    private void EnviarMouseExited(MouseEvent evt) {//GEN-FIRST:event_EnviarMouseExited
        // TODO add your handling code here:
        Enviar.setBackground(new Color(190,103,255));
    }//GEN-LAST:event_EnviarMouseExited

    private void mensajeMousePressed(MouseEvent evt) {//GEN-FIRST:event_mensajeMousePressed
        // TODO add your handling code here:
       mensaje.setText("");
    }//GEN-LAST:event_mensajeMousePressed

    private void EnviarKeyPressed(KeyEvent evt) {//GEN-FIRST:event_EnviarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_EnviarKeyPressed

    private void EnviarMouseClicked(MouseEvent evt) {//GEN-FIRST:event_EnviarMouseClicked
        // TODO add your handling code here:
        controlBot();
    }//GEN-LAST:event_EnviarMouseClicked

    private void mensajeKeyPressed(KeyEvent evt) {//GEN-FIRST:event_mensajeKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyChar() == '\n'){
            controlBot();
        }
    }//GEN-LAST:event_mensajeKeyPressed

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
            java.util.logging.Logger.getLogger(InterfazBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazBot().setVisible(true);
            }
        });
        
    }
    
    public void controlBot(){
        texto.setText(texto.getText() + "\n\nUsuario:\n" +  mensaje.getText());
        texto.setText(texto.getText() + "\n\nAda:\n" + Control.contestar(mensaje.getText()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel Enviar;
    private JPanel background;
    private JPanel banner;
    private JPanel barra;
    private JLabel enviarLb;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JTextField mensaje;
    private JLabel nombreImg;
    private JLabel online;
    private JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
