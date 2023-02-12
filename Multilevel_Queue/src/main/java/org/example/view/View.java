package org.example.view;

import org.example.controller.Controller;
import org.example.model.Model;

import javax.swing.table.DefaultTableModel;
import java.util.Timer;
import java.util.TimerTask;

public class View extends javax.swing.JFrame {
    public View() {
        initComponents();
        jButtonAddProcess.setEnabled(false);
        jButtonEndTask.setEnabled(false);
        jButtonAddIoMonitor.setEnabled(false);
        jButtonEndIoMonitor.setEnabled(false);
        jButtonAddIoUsb.setEnabled(false);
        jButtonEndIoUsb.setEnabled(false);
        jButtonReset.setEnabled(false);
    }
    Model model;
    Timer mytime = new Timer();
    Controller controller = new Controller();
    private int clock;
    private int timeQuantum = 5;
    private javax.swing.JButton jButtonAddProcess;
    private javax.swing.JButton jButtonEndTask;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonAddIoMonitor;
    private javax.swing.JButton jButtonAddIoUsb;
    private javax.swing.JButton jButtonEndIoMonitor;
    private javax.swing.JButton jButtonEndIoUsb;
    private javax.swing.JLabel jLabelCpu;
    private javax.swing.JLabel jLabelClock;
    private javax.swing.JLabel jLabelClockTime;
    private javax.swing.JLabel jLabelClockMs;
    private javax.swing.JLabel jLabelFcfs;
    private javax.swing.JLabel jLabelIoQUsb;
    private javax.swing.JLabel jLabelIoQueue;
    private javax.swing.JLabel jLabelIoMonitor;
    private javax.swing.JLabel jLabelJobQueue;
    private javax.swing.JLabel jLabelRr;
    private javax.swing.JLabel jLabelTqTime;
    private javax.swing.JLabel jLabelTimeQuantum;
    private javax.swing.JLabel jLabelTimeTurnaround;
    private javax.swing.JLabel jLabelTotalProcess;
    private javax.swing.JLabel jLabelAvgWaitingTime;
    private javax.swing.JLabel jLabelAvgTime;
    private javax.swing.JLabel jLabelAvgMs;
    private javax.swing.JLabel jLabelMultilevelQueue;
    private javax.swing.JLabel jLabelProcessTotal;
    private javax.swing.JLabel jLabelTerminate;
    private javax.swing.JLabel jLabelTurnaroundMs;
    private javax.swing.JLabel jLabelTurnaround;
    private javax.swing.JPanel jPanelAddEndIo;
    private javax.swing.JPanel jPanelAllButton;
    private javax.swing.JPanel jPanelAllTime;
    private javax.swing.JPanel jPanelIoQUsb;
    private javax.swing.JPanel jPanelIoMonitor;
    private javax.swing.JPanel jPanelIoQueue;
    private javax.swing.JPanel jPanelJobQueue;
    private javax.swing.JPanel jPanelRrFcfs;
    private javax.swing.JPanel jPanelShowSys;
    private javax.swing.JPanel jPanelTerminate;
    private javax.swing.JScrollPane jScrollPane_CPU;
    private javax.swing.JScrollPane jScrollPaneFcfs;
    private javax.swing.JScrollPane jScrollPaneIoQUsb;
    private javax.swing.JScrollPane jScrollPaneIoMonitor;
    private javax.swing.JScrollPane jScrollPaneJobQueue;
    private javax.swing.JScrollPane jScrollPanePCpu;
    private javax.swing.JScrollPane jScrollPaneRr;
    private javax.swing.JScrollPane jScrollPaneMonitor;
    private javax.swing.JScrollPane jScrollPaneTerminate;
    private javax.swing.JTable jTableCpu;
    private javax.swing.JTable jTableFcfs;
    private javax.swing.JTable jTableIoQUsb;
    private javax.swing.JTable jTableIoMonitor;
    private javax.swing.JTable jTableJobQueue;
    private javax.swing.JTable jTableRr;
    private javax.swing.JTable jTableUsb;
    private javax.swing.JTable jTableMonitor;
    private javax.swing.JTable jTableTerminate;
    // End of variables declaration
    private void initComponents() {

        jPanelAllTime = new javax.swing.JPanel();
        jLabelClock = new javax.swing.JLabel();
        jLabelClockTime = new javax.swing.JLabel();
        jLabelClockMs = new javax.swing.JLabel();
        jLabelAvgWaitingTime = new javax.swing.JLabel();
        jLabelTimeTurnaround = new javax.swing.JLabel();
        jLabelTurnaroundMs = new javax.swing.JLabel();
        jLabelTurnaround = new javax.swing.JLabel();
        jLabelAvgTime = new javax.swing.JLabel();
        jLabelAvgMs = new javax.swing.JLabel();
        jPanelJobQueue = new javax.swing.JPanel();
        jScrollPaneJobQueue = new javax.swing.JScrollPane();
        jTableJobQueue = new javax.swing.JTable();
        jLabelJobQueue = new javax.swing.JLabel();
        jPanelRrFcfs = new javax.swing.JPanel();
        jLabelRr = new javax.swing.JLabel();
        jScrollPaneRr = new javax.swing.JScrollPane();
        jTableRr = new javax.swing.JTable();
        jScrollPaneFcfs = new javax.swing.JScrollPane();
        jTableFcfs = new javax.swing.JTable();
        jLabelFcfs = new javax.swing.JLabel();
        jPanelAllButton = new javax.swing.JPanel();
        jButtonAddProcess = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonEndTask = new javax.swing.JButton();
        jButtonStart = new javax.swing.JButton();
        jLabelTimeQuantum = new javax.swing.JLabel();
        jLabelTqTime = new javax.swing.JLabel();
        jPanelIoQueue = new javax.swing.JPanel();
        jLabelIoQueue = new javax.swing.JLabel();
        jPanelIoMonitor = new javax.swing.JPanel();
        jScrollPaneIoMonitor = new javax.swing.JScrollPane();
        jTableIoMonitor = new javax.swing.JTable();
        jLabelIoMonitor = new javax.swing.JLabel();
        jPanelIoQUsb = new javax.swing.JPanel();
        jScrollPaneIoQUsb = new javax.swing.JScrollPane();
        jTableIoQUsb = new javax.swing.JTable();
        jLabelIoQUsb = new javax.swing.JLabel();
        jScrollPanePCpu = new javax.swing.JScrollPane();
        jTableCpu = new javax.swing.JTable();
        jLabelCpu = new javax.swing.JLabel();
        jPanelAddEndIo = new javax.swing.JPanel();
        jScrollPaneMonitor = new javax.swing.JScrollPane();
        jTableMonitor = new javax.swing.JTable();
        jButtonAddIoMonitor = new javax.swing.JButton();
        jButtonEndIoMonitor = new javax.swing.JButton();
        jButtonAddIoUsb = new javax.swing.JButton();
        jButtonEndIoUsb = new javax.swing.JButton();
        jScrollPane_CPU = new javax.swing.JScrollPane();
        jTableUsb = new javax.swing.JTable();
        jLabelMultilevelQueue = new javax.swing.JLabel();
        jPanelTerminate = new javax.swing.JPanel();
        jScrollPaneTerminate = new javax.swing.JScrollPane();
        jTableTerminate = new javax.swing.JTable();
        jLabelTerminate = new javax.swing.JLabel();
        jPanelShowSys = new javax.swing.JPanel();
        jLabelProcessTotal = new javax.swing.JLabel();
        jLabelTotalProcess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelClock.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClock.setText("Clock");

        jLabelClockTime.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelClockTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClockTime.setText("-");

        jLabelClockMs.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelClockMs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClockMs.setText("ms");

        jLabelAvgWaitingTime.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelAvgWaitingTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvgWaitingTime.setText("AVG Waiting Time");

        jLabelTimeTurnaround.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelTimeTurnaround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimeTurnaround.setText("-");

        jLabelTurnaroundMs.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelTurnaroundMs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurnaroundMs.setText("ms");

        jLabelTurnaround.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelTurnaround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurnaround.setText("AVG Turnaround Time");

        jLabelAvgTime.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelAvgTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvgTime.setText("-");

        jLabelAvgMs.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelAvgMs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvgMs.setText("ms");

        javax.swing.GroupLayout jPanel_AllTimeLayout = new javax.swing.GroupLayout(jPanelAllTime);
        jPanelAllTime.setLayout(jPanel_AllTimeLayout);
        jPanel_AllTimeLayout.setHorizontalGroup(
                jPanel_AllTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_AllTimeLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(jLabelClock, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelClockTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelClockMs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelAvgWaitingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                //TODO a
                                .addComponent(jLabelAvgTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelAvgMs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelTurnaround)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTimeTurnaround, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTurnaroundMs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_AllTimeLayout.setVerticalGroup(
                jPanel_AllTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AllTimeLayout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addGroup(jPanel_AllTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelClock)
                                        .addComponent(jLabelClockTime)
                                        .addComponent(jLabelClockMs)
                                        .addComponent(jLabelAvgWaitingTime)
                                        .addComponent(jLabelTimeTurnaround)
                                        .addComponent(jLabelTurnaroundMs)
                                        .addComponent(jLabelTurnaround)
                                        .addComponent(jLabelAvgTime)
                                        .addComponent(jLabelAvgMs))
                                .addContainerGap())
        );

        jPanelJobQueue.setBackground(new java.awt.Color(255, 0, 94));
        jPanelJobQueue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableJobQueue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableJobQueue.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jTableJobQueue.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "Arrival Time", "Burst Time", "Waiting Time", "I/O Time"
                }
        ));
        jScrollPaneJobQueue.setViewportView(jTableJobQueue);

        jLabelJobQueue.setFont(new java.awt.Font("ROG Fonts", 0, 20)); // NOI18N
        jLabelJobQueue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJobQueue.setText("JOBQUEUE");

        javax.swing.GroupLayout jPanel_JobQueueLayout = new javax.swing.GroupLayout(jPanelJobQueue);
        jPanelJobQueue.setLayout(jPanel_JobQueueLayout);
        jPanel_JobQueueLayout.setHorizontalGroup(
                jPanel_JobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_JobQueueLayout.createSequentialGroup()
                                .addGroup(jPanel_JobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_JobQueueLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPaneJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_JobQueueLayout.createSequentialGroup()
                                                .addGap(317, 317, 317)
                                                .addComponent(jLabelJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel_JobQueueLayout.setVerticalGroup(
                jPanel_JobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_JobQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelJobQueue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRrFcfs.setBackground(new java.awt.Color(0, 148, 255));
        jPanelRrFcfs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelRr.setFont(new java.awt.Font("ROG Fonts", 0, 20)); // NOI18N
        jLabelRr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRr.setText("RoundRobin ( Queue 1 )");

        jTableRr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableRr.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "Arrival Time", "Burst Time", "Waiting Time"
                }
        ));
        jScrollPaneRr.setViewportView(jTableRr);

        jTableFcfs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableFcfs.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "Arrival Time", "Burst Time", "Waiting Time"
                }
        ));
        jScrollPaneFcfs.setViewportView(jTableFcfs);

        jLabelFcfs.setFont(new java.awt.Font("ROG Fonts", 0, 20)); // NOI18N
        jLabelFcfs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFcfs.setText("FCFS ( QUEUE 2 )");

        javax.swing.GroupLayout jPanel_RR_FCFSLayout = new javax.swing.GroupLayout(jPanelRrFcfs);
        jPanelRrFcfs.setLayout(jPanel_RR_FCFSLayout);
        jPanel_RR_FCFSLayout.setHorizontalGroup(
                jPanel_RR_FCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_RR_FCFSLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_RR_FCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RR_FCFSLayout.createSequentialGroup()
                                                .addComponent(jLabelRr, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RR_FCFSLayout.createSequentialGroup()
                                                .addComponent(jScrollPaneRr, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RR_FCFSLayout.createSequentialGroup()
                                                .addComponent(jLabelFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RR_FCFSLayout.createSequentialGroup()
                                                .addComponent(jScrollPaneFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        jPanel_RR_FCFSLayout.setVerticalGroup(
                jPanel_RR_FCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RR_FCFSLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelRr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneRr, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelFcfs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAllButton.setBackground(new java.awt.Color(153, 153, 153));
        jPanelAllButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButtonAddProcess.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jButtonAddProcess.setText("Add Process");
        jButtonAddProcess.setBorder(null);
        jButtonAddProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProcessActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(255, 14, 131));
        jButtonReset.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jButtonReset.setText("RESET");
        jButtonReset.setBorder(null);
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonEndTask.setBackground(new java.awt.Color(255, 3, 81));
        jButtonEndTask.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jButtonEndTask.setText("End Task");
        jButtonEndTask.setBorder(null);
        jButtonEndTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndTaskActionPerformed(evt);
            }
        });

        jButtonStart.setBackground(new java.awt.Color(51, 255, 0));
        jButtonStart.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.setToolTipText("");
        jButtonStart.setBorder(null);
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });


        jLabelTimeQuantum.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelTimeQuantum.setText("TimeQuantum");

        jLabelTqTime.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabelTqTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTqTime.setText("-");

        javax.swing.GroupLayout jPanel_AllButtonLayout = new javax.swing.GroupLayout(jPanelAllButton);
        jPanelAllButton.setLayout(jPanel_AllButtonLayout);
        jPanel_AllButtonLayout.setHorizontalGroup(
                jPanel_AllButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AllButtonLayout.createSequentialGroup()
                                .addGroup(jPanel_AllButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_AllButtonLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButtonAddProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_AllButtonLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabelTimeQuantum)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabelTqTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_AllButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonEndTask, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel_AllButtonLayout.setVerticalGroup(
                jPanel_AllButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_AllButtonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_AllButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonAddProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEndTask, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_AllButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelTimeQuantum)
                                        .addComponent(jLabelTqTime))
                                .addContainerGap())
        );

        jPanelIoQueue.setBackground(new java.awt.Color(153, 153, 153));
        jPanelIoQueue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelIoQueue.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelIoQueue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIoQueue.setText("I/O QUEUE");

        jPanelIoMonitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableIoMonitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableIoMonitor.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "Waiting Time"
                }
        ));
        jScrollPaneIoMonitor.setViewportView(jTableIoMonitor);

        jLabelIoMonitor.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelIoMonitor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIoMonitor.setText("MONITOR");

        javax.swing.GroupLayout jPanel_IO_MonitorLayout = new javax.swing.GroupLayout(jPanelIoMonitor);
        jPanelIoMonitor.setLayout(jPanel_IO_MonitorLayout);
        jPanel_IO_MonitorLayout.setHorizontalGroup(
                jPanel_IO_MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_IO_MonitorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneIoMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel_IO_MonitorLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabelIoMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_IO_MonitorLayout.setVerticalGroup(
                jPanel_IO_MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IO_MonitorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelIoMonitor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneIoMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelIoQUsb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTableIoQUsb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableIoQUsb.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "Waiting Time"
                }
        ));
        jScrollPaneIoQUsb.setViewportView(jTableIoQUsb);

        jLabelIoQUsb.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelIoQUsb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIoQUsb.setText("USB");

        javax.swing.GroupLayout jPanel_IOQ_usbLayout = new javax.swing.GroupLayout(jPanelIoQUsb);
        jPanelIoQUsb.setLayout(jPanel_IOQ_usbLayout);
        jPanel_IOQ_usbLayout.setHorizontalGroup(
                jPanel_IOQ_usbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_IOQ_usbLayout.createSequentialGroup()
                                .addGroup(jPanel_IOQ_usbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_IOQ_usbLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPaneIoQUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_IOQ_usbLayout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(jLabelIoQUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_IOQ_usbLayout.setVerticalGroup(
                jPanel_IOQ_usbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IOQ_usbLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelIoQUsb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneIoQUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableCpu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableCpu.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status" ,"Queue"
                }
        ));
        jScrollPanePCpu.setViewportView(jTableCpu);

        jLabelCpu.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelCpu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCpu.setText("CPU");

        javax.swing.GroupLayout jPanel_IO_QUEUELayout = new javax.swing.GroupLayout(jPanelIoQueue);
        jPanelIoQueue.setLayout(jPanel_IO_QUEUELayout);
        jPanel_IO_QUEUELayout.setHorizontalGroup(
                jPanel_IO_QUEUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IO_QUEUELayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelIoQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                        .addGroup(jPanel_IO_QUEUELayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_IO_QUEUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelIoMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelIoQUsb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPanePCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel_IO_QUEUELayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabelCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_IO_QUEUELayout.setVerticalGroup(
                jPanel_IO_QUEUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_IO_QUEUELayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelIoQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelIoMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelIoQUsb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCpu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPanePCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanelAddEndIo.setBackground(new java.awt.Color(153, 153, 153));
        jPanelAddEndIo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableMonitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableMonitor.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jTableMonitor.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "I/O Time"
                }
        ));
        jScrollPaneMonitor.setViewportView(jTableMonitor);

        jButtonAddIoMonitor.setBackground(new java.awt.Color(0, 255, 6));
        jButtonAddIoMonitor.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButtonAddIoMonitor.setText("ADD MONITOR");
        jButtonAddIoMonitor.setToolTipText("");
        jButtonAddIoMonitor.setBorder(null);
        jButtonAddIoMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddIoMinitorActionPerformed(evt);
            }
        });

        jButtonEndIoMonitor.setBackground(new java.awt.Color(255, 3, 59));
        jButtonEndIoMonitor.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButtonEndIoMonitor.setText("End I/O");
        jButtonEndIoMonitor.setBorder(null);
        jButtonEndIoMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndIoMinitorActionPerformed(evt);
            }
        });

        jButtonAddIoUsb.setBackground(new java.awt.Color(0, 255, 0));
        jButtonAddIoUsb.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButtonAddIoUsb.setText("ADD USB");
        jButtonAddIoUsb.setToolTipText("");
        jButtonAddIoUsb.setBorder(null);
        jButtonAddIoUsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddIoUsbActionPerformed(evt);
            }
        });

        jButtonEndIoUsb.setBackground(new java.awt.Color(255, 3, 59));
        jButtonEndIoUsb.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jButtonEndIoUsb.setText("End I/O");
        jButtonEndIoUsb.setBorder(null);
        jButtonEndIoUsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndIoUsbActionPerformed(evt);
            }
        });

        jTableUsb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableUsb.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status", "I/O Time"
                }
        ));
        jScrollPane_CPU.setViewportView(jTableUsb);

        javax.swing.GroupLayout jPanel_Add_End_IOLayout = new javax.swing.GroupLayout(jPanelAddEndIo);
        jPanelAddEndIo.setLayout(jPanel_Add_End_IOLayout);
        jPanel_Add_End_IOLayout.setHorizontalGroup(
                jPanel_Add_End_IOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_Add_End_IOLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_Add_End_IOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_Add_End_IOLayout.createSequentialGroup()
                                                .addComponent(jButtonAddIoUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonEndIoUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane_CPU, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPaneMonitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel_Add_End_IOLayout.createSequentialGroup()
                                                .addComponent(jButtonAddIoMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonEndIoMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel_Add_End_IOLayout.setVerticalGroup(
                jPanel_Add_End_IOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_Add_End_IOLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_Add_End_IOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonAddIoMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonEndIoMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane_CPU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_Add_End_IOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEndIoUsb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAddIoUsb, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        jLabelMultilevelQueue.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMultilevelQueue.setFont(new java.awt.Font("ROG Fonts", 1, 25)); // NOI18N
        jLabelMultilevelQueue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMultilevelQueue.setText("multilevel  Queue");

        jPanelTerminate.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTerminate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableTerminate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTerminate.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PID", "Status" ,"Waiting Time" ,"Turnaround Time"
                }
        ));
        jScrollPaneTerminate.setViewportView(jTableTerminate);

        jLabelTerminate.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        jLabelTerminate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTerminate.setText("TERMINATE");

        javax.swing.GroupLayout jPanel_terminateLayout = new javax.swing.GroupLayout(jPanelTerminate);
        jPanelTerminate.setLayout(jPanel_terminateLayout);
        jPanel_terminateLayout.setHorizontalGroup(
                jPanel_terminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_terminateLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_terminateLayout.createSequentialGroup()
                                .addContainerGap(147, Short.MAX_VALUE)
                                .addComponent(jLabelTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
        );
        jPanel_terminateLayout.setVerticalGroup(
                jPanel_terminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_terminateLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTerminate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanelShowSys.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelProcessTotal.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelProcessTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProcessTotal.setText("Process Total");

        jLabelTotalProcess.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTotalProcess.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelTotalProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalProcess.setText("-");

        javax.swing.GroupLayout jPanel_showSysLayout = new javax.swing.GroupLayout(jPanelShowSys);
        jPanelShowSys.setLayout(jPanel_showSysLayout);
        jPanel_showSysLayout.setHorizontalGroup(
                jPanel_showSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_showSysLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelProcessTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotalProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_showSysLayout.setVerticalGroup(
                jPanel_showSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_showSysLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_showSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProcessTotal)
                                        .addComponent(jLabelTotalProcess))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelMultilevelQueue)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelAllTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelShowSys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jPanelAddEndIo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jPanelTerminate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanelRrFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanelJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanelIoQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanelAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelMultilevelQueue)
                                        .addComponent(jPanelAllTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelShowSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanelJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanelAddEndIo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanelTerminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jPanelRrFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanelAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelIoQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButtonAddProcessActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO addPrpcess
        controller.addProcess(clock, timeQuantum);
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO:resetActionPerformed
        controller.reset();
    }

    private void jButtonEndTaskActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO :EndTaskActionPerformed
        controller.removeQueue(clock);
    }

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO StartActionPerformed

        //  timeQuantum = Integer.parseInt(jTextField_TimeQuantum.getText());
        jButtonAddProcess.setEnabled(true);
        jButtonEndTask.setEnabled(true);
        jButtonAddIoMonitor.setEnabled(true);
        jButtonEndIoMonitor.setEnabled(true);
        jButtonAddIoUsb.setEnabled(true);
        jButtonEndIoUsb.setEnabled(true);
        jButtonStart.setEnabled(false);
        jButtonReset.setEnabled(true);
        clockTime();
    }
    private void jButtonAddIoMinitorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Add_IOMActionPerformed
        controller.addMonitorQueue();
    }

    private void jButtonEndIoMinitorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO End_IOMActionPerformed
        controller.endMonitorQueue();
    }

    private void jButtonAddIoUsbActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO Add_IOUActionPerformed
        controller.addUsbQueue();
    }
    private void jButtonEndIoUsbActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO End_IOUActionPerformed
        controller.endUsbQueue();
    }

    public void clockTime(){
        TimerTask task = new TimerTask() {
            public void run() {
                //TODO run
                //ตัวแปร count ในส่วนนี้ คือส่วนที่จะไปแสดง บนหน้า View ที่เราเห็นกันคือ นับเวลา Clock หรือ CPU Time
                clock++;
                jLabelClockTime.setText(Integer.toString(clock));
                jLabelTqTime.setText(Integer.toString(timeQuantum));
                jLabelTotalProcess.setText(Integer.toString(controller.getCountProcess()));
                jLabelAvgTime.setText(controller.getAvgWaitingTime());
                jLabelTimeTurnaround.setText(controller.getAvgTurnaroundTime());
                System.out.println(controller.getAvgWaitingTime());

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
                controller.waitingTimeMonitorQueue();
                controller.waitingTimeUsbQueue();
                controller.monitorQueue();
                controller.usbQueue();
            }
        };
        mytime.scheduleAtFixedRate(task, 1000, 1000);
    }
    public void showJob(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTableJobQueue.getModel();

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
            DefaultTableModel model1 = (DefaultTableModel) jTableFcfs.getModel();
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
            DefaultTableModel model1 = (DefaultTableModel) jTableRr.getModel();
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
            DefaultTableModel model1 = (DefaultTableModel) jTableTerminate.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1], textTable1[2], textTable1[3]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void showJobCPU(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTableCpu.getModel();

            int rowCount = model1.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0], textTable1[1],textTable1[2]});
                System.out.println(textTable1[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void showJobMonitor(String text) {
        try {
            DefaultTableModel model1 = (DefaultTableModel) jTableMonitor.getModel();

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
            DefaultTableModel model1 = (DefaultTableModel) jTableIoMonitor.getModel();

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
            DefaultTableModel model1 = (DefaultTableModel) jTableUsb.getModel();
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
            DefaultTableModel model1 = (DefaultTableModel) jTableIoQUsb.getModel();

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
}