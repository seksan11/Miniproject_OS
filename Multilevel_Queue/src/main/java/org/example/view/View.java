package org.example.view;

import org.example.controller.Controller;
import org.example.model.Model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Timer;
import java.util.TimerTask;

public class View extends javax.swing.JFrame {
    Model model;
    Timer mytime = new Timer();
    Controller controller = new Controller();
    private int clock;
    private int timeQuantum = 5;
    private javax.swing.JButton jButton_AddProcess;
    private javax.swing.JButton jButton_Add_IOM;
    private javax.swing.JButton jButton_Add_IOU;
    private javax.swing.JButton jButton_EndTask;
    private javax.swing.JButton jButton_End_IOM;
    private javax.swing.JButton jButton_End_IOU;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_Start;
    /*--------------------------------------EndPanel_Button----------------------------------------------------*/
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel_FCFS;
    private javax.swing.JLabel jLabel3;
    /*---------------------End_ADD_IO---------------------------*/
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Ready_Queue3;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JLabel jLabel_Time1;
    private javax.swing.JLabel jLabel_Time2;
    private javax.swing.JLabel jLabel_TimeQuantum;
    private javax.swing.JLabel jLabel_Time_ms;
    private javax.swing.JLabel jLabel_Time_ms1;
    private javax.swing.JLabel jLabel_Time_ms2;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_avg_waiting;
    private javax.swing.JLabel jLabel_avg_waiting1;
    private javax.swing.JLabel jLabel_clock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_FCFS;
    private javax.swing.JPanel jPanel_IOQueue;
    private javax.swing.JPanel jPanel_Moniter;
    private javax.swing.JPanel jPanel_RR;
    private javax.swing.JPanel jPanel_Terminate;
    private javax.swing.JPanel jPanel_Time;
    private javax.swing.JPanel jPanel_jobQueue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane_jobqueue;
    private javax.swing.JTable jTable_RR;
    private javax.swing.JTable jTable_IO_USB;
    private javax.swing.JTable jTable_Q_Monitor;
    private javax.swing.JTable jTable_Q_USB;
    private javax.swing.JTable jTable_FCFS;
    private javax.swing.JTable jTable_Terminate;
    private javax.swing.JTable jTable_CPU;
    private javax.swing.JTable jTable_IO_Monitor;
    private javax.swing.JTable jTable_job_queue;
    private JTextField jTextField_TimeQuantum;

    public View() {
        //TODO View
        initComponents();
        //ClockTime();
        jButton_AddProcess.setEnabled(false);
        jButton_EndTask.setEnabled(false);
        jButton_Add_IOM.setEnabled(false);
        jButton_Add_IOU.setEnabled(false);
        jButton_End_IOM.setEnabled(false);
        jButton_End_IOU.setEnabled(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    private void initComponents() {

        jLabel_Title = new javax.swing.JLabel();
        jPanel_jobQueue = new javax.swing.JPanel();
        jScrollPane_jobqueue = new javax.swing.JScrollPane();
        jTable_job_queue = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Time = new javax.swing.JPanel();
        jLabel_clock = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();
        jLabel_Time_ms = new javax.swing.JLabel();
        jLabel_avg_waiting = new javax.swing.JLabel();
        jLabel_Time1 = new javax.swing.JLabel();
        jLabel_Time_ms1 = new javax.swing.JLabel();
        jLabel_avg_waiting1 = new javax.swing.JLabel();
        jLabel_Time2 = new javax.swing.JLabel();
        jLabel_Time_ms2 = new javax.swing.JLabel();
        jPanel_RR = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_RR = new javax.swing.JTable();
        jLabel_FCFS = new javax.swing.JLabel();
        jPanel_FCFS = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_FCFS = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel_Terminate = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_Terminate = new javax.swing.JTable();
        jLabel_Ready_Queue3 = new javax.swing.JLabel();
        jPanel_Moniter = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable_IO_Monitor = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable_IO_USB = new javax.swing.JTable();
        jButton_Add_IOM = new javax.swing.JButton();
        jButton_End_IOM = new javax.swing.JButton();
        jButton_Add_IOU = new javax.swing.JButton();
        jButton_End_IOU = new javax.swing.JButton();
        jPanel_IOQueue = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable_Q_Monitor = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable_Q_USB = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_CPU = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton_AddProcess = new javax.swing.JButton();
        jButton_EndTask = new javax.swing.JButton();
        jTextField_TimeQuantum = new javax.swing.JTextField();
        jLabel_TimeQuantum = new javax.swing.JLabel();
        jButton_Reset = new javax.swing.JButton();
        jButton_Start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_Title.setFont(new java.awt.Font("ROG Fonts", 0, 24)); // NOI18N
        jLabel_Title.setText("Multilevel Queue");

        jPanel_jobQueue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable_job_queue.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "PID", "Status", "Arrival Time", "Burst Time", "Waiting Time", "I/O Time"
                }
        ));
        jScrollPane_jobqueue.setViewportView(jTable_job_queue);

        jLabel1.setFont(new java.awt.Font("ROG Fonts", 0, 18)); // NOI18N
        jLabel1.setText("Job Queue");

        javax.swing.GroupLayout jPanel_jobQueueLayout = new javax.swing.GroupLayout(jPanel_jobQueue);
        jPanel_jobQueue.setLayout(jPanel_jobQueueLayout);
        jPanel_jobQueueLayout.setHorizontalGroup(
                jPanel_jobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_jobQueueLayout.createSequentialGroup()
                                .addContainerGap(375, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(362, 362, 362))
                        .addGroup(jPanel_jobQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_jobqueue)
                                .addContainerGap())
        );
        jPanel_jobQueueLayout.setVerticalGroup(
                jPanel_jobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_jobQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane_jobqueue, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jLabel_clock.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_clock.setText("Clock");

        jLabel_Time.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_Time.setText("--");

        jLabel_Time_ms.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_Time_ms.setText("ms");

        jLabel_avg_waiting.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_avg_waiting.setText("AVG Waiting Time");

        jLabel_Time1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_Time1.setText("--");

        jLabel_Time_ms1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_Time_ms1.setText("ms");

        jLabel_avg_waiting1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_avg_waiting1.setText("Turnaround Time");

        jLabel_Time2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_Time2.setText("--");

        jLabel_Time_ms2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel_Time_ms2.setText("ms");

        javax.swing.GroupLayout jPanel_TimeLayout = new javax.swing.GroupLayout(jPanel_Time);
        jPanel_Time.setLayout(jPanel_TimeLayout);
        jPanel_TimeLayout.setHorizontalGroup(
                jPanel_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_TimeLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_clock, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Time_ms)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel_avg_waiting)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Time_ms1)
                                .addGap(127, 127, 127)
                                .addComponent(jLabel_avg_waiting1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Time2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Time_ms2)
                                .addGap(39, 39, 39))
        );
        jPanel_TimeLayout.setVerticalGroup(
                jPanel_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_TimeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_clock)
                                        .addComponent(jLabel_Time)
                                        .addComponent(jLabel_Time_ms)
                                        .addComponent(jLabel_avg_waiting)
                                        .addComponent(jLabel_Time1)
                                        .addComponent(jLabel_Time_ms1)
                                        .addComponent(jLabel_avg_waiting1)
                                        .addComponent(jLabel_Time2)
                                        .addComponent(jLabel_Time_ms2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_RR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable_RR.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "PID", "Status", "Arrival Time", "Burst Time", "Waiting Time"
                }
        ));
        jScrollPane1.setViewportView(jTable_RR);
        if (jTable_RR.getColumnModel().getColumnCount() > 0) {
            jTable_RR.getColumnModel().getColumn(2).setHeaderValue("Arrival Time");
            jTable_RR.getColumnModel().getColumn(3).setHeaderValue("Burst Time");
            jTable_RR.getColumnModel().getColumn(4).setHeaderValue("Waiting Time");
        }

        jLabel_FCFS.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel_FCFS.setText("ROUNDROBIN");

        javax.swing.GroupLayout jPanel_RRLayout = new javax.swing.GroupLayout(jPanel_RR);
        jPanel_RR.setLayout(jPanel_RRLayout);
        jPanel_RRLayout.setHorizontalGroup(
                jPanel_RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_RRLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel_RRLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel_FCFS)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_RRLayout.setVerticalGroup(
                jPanel_RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RRLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_FCFS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel_FCFS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable_FCFS.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "PID", "Status", "Arrival Time", "Burst Time", "Waiting Time"
                }
        ));
        jScrollPane2.setViewportView(jTable_FCFS);
        if (jTable_FCFS.getColumnModel().getColumnCount() > 0) {
            jTable_FCFS.getColumnModel().getColumn(2).setHeaderValue("Arrival Time");
            jTable_FCFS.getColumnModel().getColumn(3).setHeaderValue("Burst Time");
            jTable_FCFS.getColumnModel().getColumn(4).setHeaderValue("Waiting Time");
        }

        jLabel3.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel3.setText("FCFS");

        javax.swing.GroupLayout jPanel_FCFSLayout = new javax.swing.GroupLayout(jPanel_FCFS);
        jPanel_FCFS.setLayout(jPanel_FCFSLayout);
        jPanel_FCFSLayout.setHorizontalGroup(
                jPanel_FCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_FCFSLayout.createSequentialGroup()
                                .addGroup(jPanel_FCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_FCFSLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_FCFSLayout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(jLabel3)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_FCFSLayout.setVerticalGroup(
                jPanel_FCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FCFSLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel_Terminate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable_Terminate.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "PID", "Status"
                }
        ));
        jScrollPane7.setViewportView(jTable_Terminate);

        jLabel_Ready_Queue3.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel_Ready_Queue3.setText("Terminate");

        javax.swing.GroupLayout jPanel_TerminateLayout = new javax.swing.GroupLayout(jPanel_Terminate);
        jPanel_Terminate.setLayout(jPanel_TerminateLayout);
        jPanel_TerminateLayout.setHorizontalGroup(
                jPanel_TerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_TerminateLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TerminateLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Ready_Queue3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))
        );
        jPanel_TerminateLayout.setVerticalGroup(
                jPanel_TerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TerminateLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Ready_Queue3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanel_Moniter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel5.setText("Moniter");

        jLabel6.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel6.setText("USB");

        jTable_IO_Monitor.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "PID", "Status", "I/O Time"
                }
        ));
        jScrollPane9.setViewportView(jTable_IO_Monitor);
        if (jTable_IO_Monitor.getColumnModel().getColumnCount() > 0) {
            jTable_IO_Monitor.getColumnModel().getColumn(2).setHeaderValue("I/O Time");
        }

        jTable_IO_USB.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "PID", "Status", "I/O Time"
                }
        ));
        jScrollPane10.setViewportView(jTable_IO_USB);
        if (jTable_IO_USB.getColumnModel().getColumnCount() > 0) {
            jTable_IO_USB.getColumnModel().getColumn(2).setHeaderValue("I/O Time");
        }

        jButton_Add_IOM.setBackground(new java.awt.Color(102, 255, 51));
        jButton_Add_IOM.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButton_Add_IOM.setText("Add I/O");
        jButton_Add_IOM.setBorderPainted(false);
        jButton_Add_IOM.setSelected(true);
        jButton_Add_IOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_IOMActionPerformed(evt);
            }
        });

        jButton_End_IOM.setBackground(new java.awt.Color(255, 102, 102));
        jButton_End_IOM.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButton_End_IOM.setText("End I/O");
        jButton_End_IOM.setBorderPainted(false);
        jButton_End_IOM.setSelected(true);
        jButton_End_IOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_End_IOMActionPerformed(evt);
            }
        });

        jButton_Add_IOU.setBackground(new java.awt.Color(102, 255, 51));
        jButton_Add_IOU.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButton_Add_IOU.setText("Add I/O");
        jButton_Add_IOU.setBorderPainted(false);
        jButton_Add_IOU.setSelected(true);
        jButton_Add_IOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_IOUActionPerformed(evt);
            }
        });

        jButton_End_IOU.setBackground(new java.awt.Color(255, 102, 102));
        jButton_End_IOU.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButton_End_IOU.setText("End I/O");
        jButton_End_IOU.setBorderPainted(false);
        jButton_End_IOU.setSelected(true);
        jButton_End_IOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_End_IOUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MoniterLayout = new javax.swing.GroupLayout(jPanel_Moniter);
        jPanel_Moniter.setLayout(jPanel_MoniterLayout);
        jPanel_MoniterLayout.setHorizontalGroup(
                jPanel_MoniterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_MoniterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_MoniterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_MoniterLayout.createSequentialGroup()
                                                .addComponent(jButton_Add_IOM)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_End_IOM))
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel_MoniterLayout.createSequentialGroup()
                                                .addComponent(jButton_Add_IOU)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_End_IOU)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MoniterLayout.createSequentialGroup()
                                .addContainerGap(172, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170))
                        .addGroup(jPanel_MoniterLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_MoniterLayout.setVerticalGroup(
                jPanel_MoniterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MoniterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_MoniterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Add_IOM)
                                        .addComponent(jButton_End_IOM))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_MoniterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Add_IOU)
                                        .addComponent(jButton_End_IOU))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel_IOQueue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel8.setText("I/O queue");

        jTable_Q_Monitor.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "PID", "Status", "Waiting Time"
                }
        ));
        jScrollPane11.setViewportView(jTable_Q_Monitor);

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel10.setText("Moniter");

        jTable_Q_USB.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "PID", "Status", "Waiting Time"
                }
        ));
        jScrollPane12.setViewportView(jTable_Q_USB);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabel4.setText("USB");

        javax.swing.GroupLayout jPanel_IOQueueLayout = new javax.swing.GroupLayout(jPanel_IOQueue);
        jPanel_IOQueue.setLayout(jPanel_IOQueueLayout);
        jPanel_IOQueueLayout.setHorizontalGroup(
                jPanel_IOQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_IOQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_IOQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IOQueueLayout.createSequentialGroup()
                                                .addGap(0, 128, Short.MAX_VALUE)
                                                .addGroup(jPanel_IOQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IOQueueLayout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(166, 166, 166))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IOQueueLayout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(123, 123, 123))))
                                        .addGroup(jPanel_IOQueueLayout.createSequentialGroup()
                                                .addGroup(jPanel_IOQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IOQueueLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
        );
        jPanel_IOQueueLayout.setVerticalGroup(
                jPanel_IOQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_IOQueueLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jProgressBar1.setToolTipText("0");
        jProgressBar1.setValue(100);
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setEnabled(false);
        jProgressBar1.setStringPainted(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("ROG Fonts", 0, 16)); // NOI18N
        jLabel7.setText("CPU");

        jTable_CPU.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "PID", "Status"
                }
        ));
        jScrollPane8.setViewportView(jTable_CPU);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()

                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton_AddProcess.setBackground(new java.awt.Color(204, 204, 204));
        jButton_AddProcess.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButton_AddProcess.setText("Add Process");
        jButton_AddProcess.setToolTipText("");
        jButton_AddProcess.setBorderPainted(false);
        jButton_AddProcess.setSelected(true);
        jButton_AddProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddProcessActionPerformed(evt);
            }
        });

        jButton_EndTask.setBackground(new java.awt.Color(255, 51, 51));
        jButton_EndTask.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButton_EndTask.setText("End Task");
        jButton_EndTask.setBorderPainted(false);
        jButton_EndTask.setSelected(true);
        jButton_EndTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EndTaskActionPerformed(evt);
            }
        });


        jLabel_TimeQuantum.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel_TimeQuantum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TimeQuantum.setText("TimeQuantum ");

        jButton_Reset.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Reset.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButton_Reset.setText("RESET");
        jButton_Reset.setBorderPainted(false);
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_Start.setBackground(new java.awt.Color(102, 255, 51));
        jButton_Start.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButton_Start.setText("Start");
        jButton_Start.setBorderPainted(false);
        jButton_Start.setSelected(true);
        jButton_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StartActionPerformed(evt);

            }
        });

        jTextField_TimeQuantum.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jTextField_TimeQuantum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_TimeQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TimeQuantumActionPerformed(evt);
            }
        });
        jTextField_TimeQuantum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TimeQuantumKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jTextField_TimeQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel_TimeQuantum))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jButton_AddProcess)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton_EndTask, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                        .addComponent(jButton_Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_AddProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_EndTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel_TimeQuantum)
                                                        .addComponent(jButton_Start, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                                .addGap(11, 11, 11))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jTextField_TimeQuantum)
                                                .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel_jobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jPanel_Moniter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jPanel_Terminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jPanel_RR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jPanel_FCFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(398, 398, 398)
                                                .addComponent(jLabel_Title)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel_IOQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel_Time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel_jobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel_FCFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel_RR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel_Moniter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel_Terminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel_IOQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /*--------------------------------------Panel_Button----------------------------------------------------*/
    private void jButton_AddProcessActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO addPrpcess
        controller.addProcess(clock, timeQuantum);
        //  showJob(controller.showJobQueue());
//        if (controller.getCountPercent() == 1) {
//            showJobFcfs(controller.showFirstComeFirstServedQueue());
//        } else {
//            showJobRr(controller.showRoundRobinQueue());
//        }

    }

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO:resetActionPerformed
        System.exit(0);
    }

    private void jButton_EndTaskActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO :EndTaskActionPerformed
        controller.removeQueue();
    }

    private void jButton_StartActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO StartActionPerformed

        //  timeQuantum = Integer.parseInt(jTextField_TimeQuantum.getText());
        jButton_Start.setEnabled(false);
        jButton_AddProcess.setEnabled(true);
        jButton_EndTask.setEnabled(true);
        jButton_Add_IOM.setEnabled(true);
        jButton_Add_IOU.setEnabled(true);
        jButton_End_IOM.setEnabled(true);
        jButton_End_IOU.setEnabled(true);
        ClockTime();


    }

    private void jTextField_TimeQuantumActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO TimeQuantumActionPerformed
    }

    private void jTextField_TimeQuantumKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    /*---------------------ADD_IO---------------------------*/
    private void jButton_Add_IOMActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Add_IOMActionPerformed
        controller.addMonitorQueue();

    }

    private void jButton_End_IOMActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO End_IOMActionPerformed
        controller.endMonitorQueue();
    }

    private void jButton_Add_IOUActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Add_IOUActionPerformed
        controller.addUsbQueue();
    }

    private void jButton_End_IOUActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO End_IOUActionPerformed
        controller.endUsbQueue();
    }

    /*----------------------------------------------------------------------*/
    public void ClockTime() {
        TimerTask task = new TimerTask() {
            public void run() {
                //TODO run
                //ตัวแปร count ในส่วนนี้ คือส่วนที่จะไปแสดง บนหน้า View ที่เราเห็นกันคือ นับเวลา Clock หรือ CPU Time
                clock++;
                jLabel_Time.setText(Integer.toString(clock));
                //   setEnableButton();
                //    setStart();
                showJob(controller.showJobQueue());
                showJobFcfs(controller.showFirstComeFirstServedQueue());
                showJobRr(controller.showRoundRobinQueue());
                showJobTerminateQueue(controller.showTerminateQueue());
                showJobCPU(controller.showCPU());
                showJobMonitor(controller.showMonitor());
                showJobMonitorQueue(controller.showMonitorQueue());
                showJobUSB(controller.showUsb());
                showJobUsbQueue(controller.showUsbQueue());

                controller.tqt(timeQuantum);
                controller.randomRunning(clock);
                controller.waitingTime();
                controller.monitorQueue();
                controller.usbQueue();


            }
        };
        mytime.scheduleAtFixedRate(task, 1000, 1000);
    }

//    public void setEnableButton() {
//        if (jTable_job_queue.getRowCount() == 0) {
//            jButton_EndTask.setEnabled(false);
//            jButton_Add_IOM.setEnabled(false);
//            jButton_Add_IOU.setEnabled(false);
//            jButton_End_IOM.setEnabled(false);
//            jButton_End_IOU.setEnabled(false);
//
//        } else {
//            jButton_EndTask.setEnabled(true);
//            jButton_Add_IOM.setEnabled(true);
//            jButton_Add_IOU.setEnabled(true);
//            jButton_End_IOM.setEnabled(true);
//            jButton_End_IOU.setEnabled(true);
//
//        }
//    }
//
//    //ควบคุมการเปิดปิดของปุ่ม Start
//    public void setStart() {
//        try {
//            if (!jTextField_TimeQuantum.equals(" ")) {
//                jButton_Start.setEnabled(false);
//                jButton_AddProcess.setEnabled(true);
//            } else if (jTextField_TimeQuantum.equals(" ")) {
//                jButton_Start.setEnabled(true);
//                jTextField_TimeQuantum.setEnabled(true);
//            }
//        } catch (NumberFormatException e) {
//
//        }
//
//    }

    public void showJob(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_job_queue.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2], textTable1[3], textTable1[4], textTable1[5]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void showJobFcfs(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_FCFS.getModel();
            int index1 = controller.setIndexFcfs();
            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = index1; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2], textTable1[3], textTable1[4]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    public void showJobRr(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_RR.getModel();
            int index1 = controller.setIndexRr();
            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = index1; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2], textTable1[3], textTable1[4]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void showJobTerminateQueue(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_Terminate.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void showJobCPU(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_CPU.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void showJobMonitor(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_IO_Monitor.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < 1; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }
    public void showJobMonitorQueue(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_Q_Monitor.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 1; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }


    public void showJobUSB(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_IO_USB.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < 1; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }
    public void showJobUsbQueue(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTable_Q_USB.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 1; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }
}