
package loginandsignup;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;



public class OpeatingSystems extends javax.swing.JFrame {
    
     
     DefaultTableModel model;
     int  rowCount =0;
     
     
  
    public OpeatingSystems() {
       
        initComponents();
        NumberProcess.setText("1");
        
                
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        QuantamTimeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        stateofProcess = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        OrderProcess = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RunAlgorithm = new javax.swing.JButton();
        AddProcessInTable = new javax.swing.JButton();
        AlgorithmsList = new javax.swing.JComboBox<>();
        NumberProcess = new javax.swing.JTextField();
        CPUTime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operating System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 0, 0));
        Right.setMinimumSize(new java.awt.Dimension(400, 600));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("CPU Scheduling System");

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.Process", "CPU.T", "Wait.T", "Turn.T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setOpaque(false);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        QuantamTimeField.setBackground(new java.awt.Color(255, 255, 255));
        QuantamTimeField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuantamTimeField.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("   ");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Quantam Time");

        stateofProcess.setBackground(new java.awt.Color(255, 255, 255));
        stateofProcess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stateofProcess.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("State of Processes");

        OrderProcess.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        OrderProcess.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Ready Queue");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel8))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantamTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RightLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(34, 34, 34)
                                .addComponent(stateofProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OrderProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(stateofProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantamTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(OrderProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(78, 94, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(102, 102, 102));
        Left.setMinimumSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Choose desired Algorithm");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("No.Process");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CPU Time");

        RunAlgorithm.setBackground(new java.awt.Color(255, 0, 0));
        RunAlgorithm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RunAlgorithm.setForeground(new java.awt.Color(255, 255, 255));
        RunAlgorithm.setText("Run Algorithm");
        RunAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunAlgorithmActionPerformed(evt);
            }
        });

        AddProcessInTable.setBackground(new java.awt.Color(255, 0, 0));
        AddProcessInTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddProcessInTable.setForeground(new java.awt.Color(255, 255, 255));
        AddProcessInTable.setText("Add Process");
        AddProcessInTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProcessInTableActionPerformed(evt);
            }
        });

        AlgorithmsList.setBackground(new java.awt.Color(255, 255, 255));
        AlgorithmsList.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        AlgorithmsList.setForeground(new java.awt.Color(255, 0, 51));
        AlgorithmsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Priority", "Round Robin", " " }));
        AlgorithmsList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 150, 136)));
        AlgorithmsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithmsListActionPerformed(evt);
            }
        });

        NumberProcess.setBackground(new java.awt.Color(255, 255, 255));
        NumberProcess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumberProcess.setForeground(new java.awt.Color(102, 102, 102));

        CPUTime.setBackground(new java.awt.Color(255, 255, 255));
        CPUTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPUTime.setForeground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(AlgorithmsList, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumberProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CPUTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(AddProcessInTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AlgorithmsList, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RunAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 462, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RunAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunAlgorithmActionPerformed
        rowCount = model.getRowCount();
       ChangeState("Running");
       
       
        int Cputime [] = new int[rowCount];
        
        int WaitingTime[]= new int[rowCount];
        int TrunaroundTime []= new int[rowCount];
                   OrderProcess.setText("");

        
        
      if(AlgorithmsList.getSelectedItem().equals("FCFS")){
                 for(int i=0; i< rowCount; i++ ){
              Cputime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());//Cpu time
              
        }
                 List<Object[]> tableDate = new ArrayList<>();
                            for (int i = 0; i < rowCount; i++) {
                          Object[] row = new Object[4];
                          row[0] = model.getValueAt(i, 0); // ID
                          row[1] = Integer.parseInt(model.getValueAt(i, 1).toString()); // Burst Time
                          row[2] = 0; // Waiting Time (تعيين مبدئيًا بـ 0)
                          row[3] = 0; // Turnaround Time (تعيين مبدئيًا بـ 0)
                    tableDate.add(row);
                   }
        WaitingTime[0]=0;
        for(int i=1;i<rowCount;i++){
            WaitingTime[i]= WaitingTime[i-1]+Cputime[i-1];
            
        }
        for(int i=0;i<rowCount; i++){
           TrunaroundTime[i]= WaitingTime[i]+Cputime[i];
           
        }
        SetWaitingAndTrunAroud(WaitingTime,TrunaroundTime);
        ShowMessageAverageWT("FCFS");
        OrderProcessInFiled(tableDate);
      }
      else if (AlgorithmsList.getSelectedItem().equals("SJF")){
           List<Object[]> TableData = new ArrayList<>();
         
         for(int i=0; i<rowCount; i++){
             Object[] row = new Object[4];
             row[0] = model.getValueAt(i, 0);
             row[1] = Integer.parseInt(model.getValueAt(i, 1).toString());
             row[2] = 0;//waiting Time 
             row[3] = 0; //turnAround Time ;
             TableData.add(row);
             
             
             
         }
//         Sort Based on Cpu Time
     TableData.sort((a,b) -> Integer.compare((int) a[1], (int)b[1]));
             OrderProcessInFiled(TableData);

//     Operation 
   int CurrentTime = 0;
    for(int i=0; i<rowCount; i++){
        Object[] row = TableData.get(i);
       int CpuTime = (int) row[1];
       row[2] = CurrentTime ;
       row[3] = (int)row[2] + CpuTime;
       CurrentTime += CpuTime;
       
       
    }
    SeaderTableData(TableData);
        ShowMessageAverageWT("SJF");
      }
      else if (AlgorithmsList.getSelectedItem().equals("Priority")){
//          Add Column "Proriy Process "
    model.addColumn("Priority.P");
    
         for(int i=0 ;i < rowCount; i++){
            String InputPriority = JOptionPane.showInputDialog(this, "Enter Number of Priority process"+i+1+":","Input Priority Process",JOptionPane.QUESTION_MESSAGE);
            model.setValueAt(InputPriority, i, 4);
         }
         List<Object[]> TableData = new ArrayList<>();
         for (int i=0; i<rowCount; i++){
             Object[] Process = new Object[5];
             Process[0] = model.getValueAt(i, 0);
             Process[1] = Integer.parseInt(model.getValueAt(i, 1).toString());//CPU time
             Process[2] = 0;
             Process[3] = 0;
             Process[4] = Integer.parseInt(model.getValueAt(i, 4).toString()) ;//Priority Process 
             TableData.add(Process);
         }
//         Sorting 
         TableData.sort((a,b) -> Integer.compare((int) a[4], (int )b[4]));
                OrderProcessInFiled(TableData);

//         opertionS
         int currentTime = 0;
         for (int i=0 ;i <rowCount; i++){
             
             Object[] Process =TableData.get(i);
             int CPUTime = (int ) Process[1];
             Process[2] = currentTime;// Waiting Time 
             Process[3] = (int)Process[2] + CPUTime;//TrunAround Time 
             
             currentTime += CPUTime;
         }
          SeaderTableData(TableData);
          ShowMessageAverageWT("Priority Algorithm");
      }
      else if (AlgorithmsList.getSelectedItem().equals("Round Robin")){
//          Quyantam Time 
               String inputQuantam =  JOptionPane.showInputDialog(this,
                        "Enter Quantam time for all process ",
                        "Quantam Time ", 
                        JOptionPane.QUESTION_MESSAGE);
                QuantamTimeField.setText(inputQuantam);
                int QuantamTime = Integer.parseInt(inputQuantam);
                
                 List<Object[]> tableData = new ArrayList<>();
                 int [] backupCpuTime = new int[rowCount];
                 
                 for (int i=0; i< rowCount; i++){
                    Object[] process = new Object[4];
                    
                    process[0] = model.getValueAt(i, 0);
                    process[1]= Integer.parseInt(model.getValueAt(i, 1).toString());
                    backupCpuTime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());//Cpu time of process 
                    process[2] = 0;
                    process[3] = 0;
                    
                    tableData.add(process);
                 }
//                 Operations 
                     boolean allProcessesIscomplete;
                     int currentTime = 0;
                     do{
                         allProcessesIscomplete = true;
                         for(Object[] process : tableData){
                             int CPUTime= (int) process[1];
                             
                             if(CPUTime > 0 ){
                                 allProcessesIscomplete = false;
                                 if(CPUTime > QuantamTime){
//                                     process is n`t finshed 
                                    process[1] = (int) process[1] - QuantamTime;

                                    DelaybyDelay("T="+currentTime+process[0].toString()+"(+"+process[1].toString()+")|-");// Delay Order Processes

                                        currentTime += QuantamTime;
                                        
                                 }
                                 else {
//                                     process is finshed 
                                        process[1] = 0;//cpu Time Finshed

                                   DelaybyDelay(process[0].toString()+"F|");

                                          currentTime += CPUTime;
                                          process[3] = currentTime;//trun Around time 
                                          process[2] = (int) process[3]- CPUTime;  
                                 }
                             }
                         }
//                         opertion 
                     }while (!allProcessesIscomplete);
                     for(int i=0 ;i< rowCount;i++){
                          Object[] process = tableData.get(i);
                          model.setValueAt(process[0], i, 0);
                          model.setValueAt(backupCpuTime[i], i, 1);
                          model.setValueAt(process[2], i, 2);
                          model.setValueAt(process[3], i, 3);
                     }
                     
                     ShowMessageAverageWT("Round Robin");
                 
                
                
      }             
        
    }//GEN-LAST:event_RunAlgorithmActionPerformed

    
    
    
    
    
    private void AddProcessInTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProcessInTableActionPerformed
                model = (DefaultTableModel) Table.getModel();
                if(CPUTime.getText().isEmpty()   ){
                    JOptionPane.showMessageDialog(this, "CPU Time UnVailed","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(Integer.parseInt(CPUTime.getText()) <= 0 ){
                    JOptionPane.showMessageDialog(this, "CPU is less than Zero","Error",JOptionPane.ERROR_MESSAGE);

                }
                
                else{
//                         1-  Add to Table   
                        Add_To_Table();

//                  2-  Clear Cpu Time 
                            ClearCPUTime();
//                  3-  Increament Number of Process 
                        IncreamentNumberProcess();
                        ChangeState("Ready");
                        
                }
           




 

    }//GEN-LAST:event_AddProcessInTableActionPerformed

    private void AlgorithmsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithmsListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgorithmsListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DeleteRow();
    }//GEN-LAST:event_jButton1ActionPerformed
             
    
            private void ChangeState(String Status){
                
                stateofProcess.setText(Status);
                if(Status == "Ready"){
                              stateofProcess.setBackground(Color.red);

                 }
                else if(Status == "Running") {
                             stateofProcess.setBackground(Color.blue);

                }
            }
            private void SeaderTableData(List<Object[]> TableDate ){
                for (int i=0 ; i< TableDate.size(); i++){
                    Object[] row = TableDate.get(i);
                    model.setValueAt(row[0], i, 0);
                    model.setValueAt(row[1], i, 1);
                    model.setValueAt(row[2], i, 2);
                    model.setValueAt(row[3], i, 3);
                    if(model.getColumnCount() == 5){
                        model.setValueAt(row[4],i, 4);
                    }
      
                }
            }
            private void Add_To_Table(){
                model.addRow(new Object[]{"p"+NumberProcess.getText(),CPUTime.getText(),0,0});
            }
                private void DelaybyDelay(String process){
            int delay = 1000; // تأخير مبدئي (1 ثانية)


        // إنشاء مؤقت جديد بوقت التأخير المناسب
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delayOrderProcess(process);
                ((Timer) e.getSource()).stop(); // إيقاف المؤقت بعد التنفيذ
            }
        });

        timer.start();
        delay += 1000;
    }
    private void OrderProcessInFiled(List<Object[]> tableData) {
    int delay = 1000; // تأخير مبدئي (1 ثانية)
    for (int i = 0; i < rowCount; i++) {
        Object[] row = tableData.get(i);
        String process = row[0].toString() + "\t";

        // إنشاء مؤقت جديد بوقت التأخير المناسب
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delayOrderProcess(process);
                ((Timer) e.getSource()).stop(); // إيقاف المؤقت بعد التنفيذ
            }
        });

        timer.start();
        delay += 1000; // زيادة التأخير بمقدار ثانية واحدة لكل عملية
    }
}
    private void delayOrderProcess(String Process) {
    Timer timer;
    timer = new Timer(2000, new ActionListener() { // المؤقت بمدة 1000 مللي ثانية = 1 ثانية
        @Override
        public void actionPerformed(ActionEvent e) {
            // قراءة النص الحالي من OrderProcess
            String CurrentOrderProcess = OrderProcess.getText();
            // تحديث النص بإضافة القيمة الجديدة
            OrderProcess.setText(CurrentOrderProcess + Process);
            // إيقاف المؤقت بعد التنفيذ مرة واحدة
            ((Timer) e.getSource()).stop();
        }
    });
    timer.start(); // بدء المؤقت
    
}
            private void ClearCPUTime(){
                CPUTime.setText("");
            }
            private void IncreamentNumberProcess(){
              int Number = Integer.parseInt(NumberProcess.getText())  ;
              Number++;
              NumberProcess.setText(Number+"");
              
            }
            private void SetWaitingAndTrunAroud(int waitingTime[],int trunAround[]){
                for(int i=0;i<model.getRowCount();i++){
                    model.setValueAt(waitingTime[i], i, 2);
                    model.setValueAt(trunAround[i], i, 3);

                }
            }
            private void ShowMessageAverageWT(String Algorithm){
                double tatalwaiting=0;
                double tatalTrunaround = 0;
                for(int i=0;i<model.getRowCount();i++){
                    tatalwaiting += Integer.parseInt(model.getValueAt(i, 2).toString());
                    tatalTrunaround += Integer.parseInt(model.getValueAt(i, 3).toString());
                }
              tatalwaiting /= model.getRowCount();
              tatalTrunaround /=model.getRowCount();
              JOptionPane.showMessageDialog(this,Algorithm+" \n Average Waiting Time :"+tatalwaiting+"\n average trunAround Time :"+tatalTrunaround,"Result",JOptionPane.INFORMATION_MESSAGE);
            }
            private void DeleteRow(){
     int row = Table.getSelectedRow();
         model.removeRow(row);
}
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProcessInTable;
    private javax.swing.JComboBox<String> AlgorithmsList;
    private javax.swing.JTextField CPUTime;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField NumberProcess;
    private javax.swing.JTextField OrderProcess;
    private javax.swing.JTextField QuantamTimeField;
    private javax.swing.JPanel Right;
    private javax.swing.JButton RunAlgorithm;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stateofProcess;
    // End of variables declaration//GEN-END:variables
}
