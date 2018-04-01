package br.com.redes.trab.view;

import br.com.redes.trab.p2p.Client;
import br.com.redes.trab.p2p.Server;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author RenatoYuzo
 */
public class MainView extends javax.swing.JFrame {

    ServerSocket serverSocket;
    Server newServer;
    Socket client;
    Client myClient;
    String fileName;

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        listFiles = new java.awt.List();
        tfCommand = new javax.swing.JTextField();
        btnServer = new javax.swing.JButton();
        tfIP = new javax.swing.JTextField();
        tfPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textArea = new java.awt.List();
        textError = new java.awt.List();
        btnClient = new javax.swing.JButton();
        cbCommand = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P2P");
        setResizable(false);

        tfCommand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCommandKeyReleased(evt);
            }
        });

        btnServer.setText("Server");

        tfIP.setText("localhost");

        tfPort.setText("5555");

        jLabel1.setText("IP Address:");

        jLabel2.setText("Port:");

        textArea.setBackground(new java.awt.Color(204, 204, 204));

        textError.setBackground(new java.awt.Color(255, 204, 204));

        btnClient.setText("Client");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        cbCommand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Get Available Files", "Download File", "Item 3", "Item 4", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCommand)
                    .addComponent(textError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnServer, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(261, 261, 261))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCommandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCommandKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            switch (tfCommand.getText()) {
                case "Download File":
                    tfCommand.setText("");
                    openClient();
                    break;
                case "My Files":
                    tfCommand.setText("");
                    getFiles();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Command not supported.");
                    break;
            }

        }
    }//GEN-LAST:event_tfCommandKeyReleased

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        if (cbCommand.getSelectedIndex() == 0) {
            getFiles();
        }
        else if (cbCommand.getSelectedIndex() == 1) {
            
            if (getSelectedFile()!=null) {
                fileName = getSelectedFile();
                openClient();
            }
            else {
                JOptionPane.showMessageDialog(null, "Select one file to download.");
            }
        }
        
    }//GEN-LAST:event_btnClientActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainView main = new MainView();
                main.setVisible(true);
                main.openServer();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnServer;
    private javax.swing.JComboBox<String> cbCommand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List listFiles;
    private java.awt.List textArea;
    private java.awt.List textError;
    private javax.swing.JTextField tfCommand;
    private javax.swing.JTextField tfIP;
    private javax.swing.JTextField tfPort;
    // End of variables declaration//GEN-END:variables

    public void getFiles() {

        try {
            File directory = new File("D:\\Desktop\\Shared Files");
            File[] listOfFiles = directory.listFiles();

            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    listFiles.add(listOfFile.getName());
                }
            }
        } catch (Exception e) {
            textError.add("Error: " + e.getMessage());
        }

    }
    
    public String getSelectedFile() {
        
            for (int i=0; i<listFiles.getItemCount(); i++) {
                if (listFiles.isIndexSelected(i)) {
                    return listFiles.getItem(i);
                }
            }
            return null;
        
    }

    public void openServer() {
        Thread myServer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket();
                    serverSocket.bind(new InetSocketAddress(tfIP.getText(), Integer.parseInt(tfPort.getText())));

                    textArea.add("Server port: " + serverSocket.getLocalPort());
                    textArea.add("Server HostAddress = " + serverSocket.getInetAddress().getHostAddress());
                    textArea.add("Server HostName = " + serverSocket.getInetAddress().getHostName());

                    while (true) {
                        textArea.add("====== Main Server waiting for Client ======");
                        client = serverSocket.accept();

                        textArea.add("Server connected with Client " + client.getPort());
                        textArea.add("Client HostAddress = " + client.getInetAddress().getHostAddress());
                        textArea.add("Client HostName = " + client.getInetAddress().getHostName());

                        newServer = new Server(serverSocket, client, textArea, textError, listFiles);
                        Thread threadServer = new Thread(newServer);
                        threadServer.start();
                    }

                } catch (IOException ex) {
                    textError.add("Error: " + ex.getMessage());
                }
            }
        });
        myServer.start();
    }

    public void openClient() {
        myClient = new Client(textArea, textError, listFiles, fileName);
        Thread threadClient = new Thread(myClient);
        threadClient.start();
    }
}
