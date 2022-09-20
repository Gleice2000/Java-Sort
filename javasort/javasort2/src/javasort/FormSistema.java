package javasort;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {

    ArrayList<Dados> lista = new ArrayList<>();
    Comparator<Dados> compareNome = (Dados a1, Dados a2) -> a1.getNome().compareTo(a2.getNome());
    Comparator<Dados> compareClube = (Dados a1, Dados a2) -> a1.getClube().compareTo(a2.getClube());
    Comparator<Dados> compareLiga = (Dados a1, Dados a2) -> a1.getLiga().compareTo(a2.getLiga());
    Comparator<Dados> comparePosicao = (Dados a1, Dados a2) -> a1.getPosicao().compareTo(a2.getPosicao());
    Comparator<Dados> compareNivel = (Dados a1, Dados a2) -> a1.getNivel().compareTo(a2.getNivel());

    public FormSistema() {
        initComponents();
        carregaArquivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        opBin = new javax.swing.JRadioButton();
        opSeq = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Clube", "Liga", "Posição", "Nível", " ", " " }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        txtBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(opBin);
        opBin.setText("Binária");
        opBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBinActionPerformed(evt);
            }
        });

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");
        opSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSeqActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Clube", "Liga", "Posição", "Nível"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/giphy.gif"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opBin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 210, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opSeq)
                            .addComponent(opBin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/fifa.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 929, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregaArquivo() {
        String csvFile = "FIFA19.csv";
        String line = "";
        String[] leitura = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados comp = new Dados();
                leitura = line.split(",");

                comp.setNome(leitura[0]);
                comp.setClube(leitura[1]);
                comp.setLiga(leitura[2]);
                comp.setPosicao(leitura[3]);
                comp.setNivel(leitura[4]);

                System.out.println(leitura[0] + "\n");
                System.out.println(leitura[1] + "\n");
                System.out.println(leitura[2] + "\n");
                System.out.println(leitura[3] + "\n");
                System.out.println(leitura[4] + "\n");

                lista.add(comp);
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra() {
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"Nome", "Clube", "Liga", "Posição", "Nível"}));

        DefaultTableModel model
                = (DefaultTableModel) tabelaDados.getModel();
        Object rowData[] = new Object[5];// qtd colunas
        for (Dados d : lista) {
            rowData[0] = d.getNome();
            rowData[1] = d.getClube();
            rowData[2] = d.getLiga();
            rowData[3] = d.getPosicao();
            rowData[4] = d.getNivel();
            model.addRow(rowData);

        }// fim preenche modelo
    }// fim mostra


    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                lista.sort(compareNome);
                break;
            case 1:
                lista.sort(compareClube);
                break;
            case 2:
                lista.sort(compareLiga);
                break;
            case 3:
                lista.sort(comparePosicao);
                break;
            case 4:
                lista.sort(compareNivel);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Em construção!");
        }
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        int cont = 0;
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getNome().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Jogador encontrado " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();

                    d.setNome(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, compareNome);
                    JOptionPane.showMessageDialog(null, "Jogador encontrado, posicao " + pos);
                }
                break;

            case 1:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getClube().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Clube encontrado " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();

                    d.setClube(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, compareClube);
                    JOptionPane.showMessageDialog(null, "Clube encontrado, posicao " + pos);
                }
                break;
            case 2:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getLiga().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Liga encontrada " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();

                    d.setLiga(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, compareLiga);
                    JOptionPane.showMessageDialog(null, "Liga encontrada, posicao " + pos);
                }
                break;
            case 3:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getPosicao().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Posicao do jogador em campo encontrada " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();

                    d.setClube(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, comparePosicao);
                    JOptionPane.showMessageDialog(null, "Posicao do jogador em campo, posicao " + pos);
                }
                break;
            case 4:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getNivel().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, " Nivel do jogador encontrado " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();

                    d.setNivel(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, compareNivel);
                    JOptionPane.showMessageDialog(null, "Nível do jogador encontrado, posicao " + pos);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Em construção!");
        }


    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void opBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opBinActionPerformed

    private void opSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opSeqActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
