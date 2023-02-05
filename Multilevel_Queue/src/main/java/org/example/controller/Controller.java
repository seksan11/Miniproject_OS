package org.example.controller;

import org.example.model.Model;

import java.util.ArrayList;

public class Controller {
    Model model = new Model();
    ArrayList<Model> jobQueue = new ArrayList<Model>();
    ArrayList<Model> terminateQueue = new ArrayList<Model>();
    ArrayList<Model> roundRobinQueue = new ArrayList<Model>();
    ArrayList<Model> firstComeFirstServedQueue = new ArrayList<Model>();
    ArrayList<Model> moniterQueue = new ArrayList<Model>();
    ArrayList<Model> usbQueue = new ArrayList<Model>();
    int pId = 1;  //ProcessID กําหนดให้เริ่มต้นที่ ProcessID = 1
    int timeQuantum = 0; //ตัวแปลไว้เก็บค่า TimeQuatum จากฝั่ง View
    int burstTime = 0; //ค่า burstTime
    int timeQueam = 0;// ตัวแปลที่ใช่ดึงค่า TimeQueam เพื่อโยนค่าให้กับตัว Process แต่ละตัวให้ทํางานตาม TimeQueam
    // int tqt = 0;
    int waitingTime = 0; // ใช้เก็บค่า Watingtime
    int memory;

    int jQ = 0;  // ใช้ แทน burstTime ใน  firstComeFirstServedQueue
    int addCount = 0; // ใช้ นับจำนวน procees ทั้งหมด
    int timeRunning = 0; // ใช้ กำหนดช่วงเวลาทำงานของ process

    public Controller() {
    }

    ////////////////////////////////////////addProcess////////////////////////////////////////////////////////////////////////////
    //method ปุ่ม addProcess คือมี paramiter อยู่ 2 ตัว รับมาจากฝั่ง View คือตัวแปล clock timeQuantum Method นี้จะถูกนําไปเรียกใช้ในฝั่ง View
    public void addProcess(int clock, int timeQuantum) {
        memory = (int) (Math.random() * (284) + 2);
        model = new Model(pId, 0, clock, 0, 0, timeQuantum, 0, memory);
        pId++;
        addCount++;
        jobQueue.add(model);
        select();

    }

    //เลือกว่าจะให้ Process เข้าไป รอเข้าทำงานที่ FCFS or RR ด้วยการสุ่ม
    public void select() {
        //TODO select

        for (int i = addCount - 1; i < jobQueue.size(); i++) {
            if (jobQueue.get(i).getCountPercent() == 1) {
                firstComeFirstServedQueue.add(model);
            } else {
                roundRobinQueue.add(model);
            }
        }
    }

    ////////////////////////////////////////process////////////////////////////////////////////////////////////////////////////
    // Method firstComeFirstServedQueue จะทำการกำหนดค่าต่างๆ การทํางานต่างๆ ในกรณีที่เข้าไปใช้งาน CPU
    public void firstComeFirstServedQueue(int clock) {
        //TODO firstComeFirstServed
        try {
            for (int i = 0; i < jobQueue.size(); i++) { //Loop ถ้า i = 0 เช็คว่า i < jobQueue.size ก็จะเพื่มค่า i ครั้งละ 1
                if (firstComeFirstServedQueue.get(0) == jobQueue.get(i)) { // ถ้า firstComeFirstServedQueue ตําแหน่งที่ 0 เท่ากับ jobQueue ตําแหน่งที่ i
                    jobQueue.get(i).setStatus(2); // ก็จะเซ็ตค่าเป็น Running
                    jQ = firstComeFirstServedQueue.get(0).getBurstTime();   //โดย get ค่า jQ Process นั้นมา ให้มีค่าเท่ากับ burstTime
                    jQ++;  //และเพิ่มค่า jQ ขึ้นที่ละ 1
                    jobQueue.get(i).setBurstTime(jQ); //โดยนําค่า jQ มาเก็บยัง setBurstTime ของ Process นั้น
                } else if (jobQueue.get(i).getStatus() != "Waiting") {
                    jobQueue.get(i).setStatus(1);
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {

        }

    }

    // Method roundRobinQueue จะทำการกำหนดค่าต่างๆ การทํางานต่างๆ ในกรณีที่เข้าไปใช้งาน CPU
    public void roundRobinQueue(int clock) {
        try {
            for (int i = 0; i < jobQueue.size(); i++) { //Loop ถ้า i = 0 เช็คว่า i < jobQueue.size ก็จะเพื่มค่า i ครั้งละ 1
                if (roundRobinQueue.get(0) == jobQueue.get(i)) {  // ถ้า roundRobinQueue ตําแหน่งที่ 0 เท่ากับ jobQueue ตําแหน่งที่ i
                    timeQuantum = jobQueue.get(i).getTimeQuantum(); //โดย get ค่า TimeQuantum มาใช้งาน
                    timeQuantum--;  //โดยให้ค่า  timeQuantum ลดค่าลงครั้งละ 1 จนถึง 0 จึงจะสามารถเข้าไปใช้งาน if ถัดไป
                    jobQueue.get(i).setTimeQuantum(timeQuantum); //โดยนําค่า timeQuantum มาเซ็ตค่าให้กับ setQuantumTime ของ Process นั้น
                    System.out.println("TQT Running" + timeQuantum);

                    burstTime = jobQueue.get(i).getBurstTime();  //โดย get ค่า burstTime Process นั้นมา ให้มีค่าเท่ากับ burstTime
                    burstTime++;  //และเพิ่มค่า burstTime ขึ้นที่ละ 1
                    jobQueue.get(i).setBurstTime(burstTime);//โดยนําค่า burstTime มาเก็บยัง setBurstTime ของ Process นั้น
                    jobQueue.get(i).setStatus(2);  // ก็จะเซ็ตค่าเป็น Running

                    if (jobQueue.get(i).getTimeQuantum() == 0) {  // นําค่า getQuantumTime() ของ Process นั้น มาเทียบค่าว่า มีค่า เท่ากับ 0 หรือไม่ ถ้าเท่ากันก็จะเข้าเงื่อนไขเป็นจริง
                        jobQueue.get(i).setStatus(1);  //โดยถ้าเป็น 0 ก็จะเซ็ตให้ Process นั้น มีค่าสถานะเป็น Ready
                        roundRobinQueue.add(jobQueue.get(i)); //และทําการ Add Process นั้นเข้าไปรอใน ReadyQueue เพื่อรอเข้าใช้งาน Cpu ต่อไป
                        roundRobinQueue.remove(0); //และ Remove ReadyQueue ตําแหน่งที่ 0 ออกมาเพื่อเอา Process นั้นไปใช้งาน Cpu ต่อโดยจะไปเช็คเงื่อนไข if ด้านบนสุด
                        jobQueue.get(i).setTimeQuantum(timeQueam); //และนําค่า timeQueam ที่เรานํามาจากฝั่ง View เช็ตค่าให้กับ QuantumTime นั้นไปใช้งาน
                    }
                } else if (jobQueue.get(i).getStatus() != "Waiting") {
                    jobQueue.get(i).setStatus(1);
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {

        }

    }

    public void tqt(int qT) {
        int q;
        for (q = 0; q < qT; q++) {

        }
        timeQueam = q;
    }

    // Method สำหรับกำหนดให้ process ไหนจะได้้เข้าไปทำงานใน CPU
    public void randomRunning(int clock) {
        //TODO randomRunning
        try {
            if (!jobQueue.isEmpty()) {
                if (timeRunning < 81) {
                    roundRobinQueue(clock);
                    timeRunning++;
                    System.out.println("timeRunning = " + timeRunning);
                }
                if (timeRunning > 80 && timeRunning < 101) {
                    firstComeFirstServedQueue(clock);
                    timeRunning++;
                    System.out.println("timeRunning = " + timeRunning);
                }
                if (timeRunning > 100) {
                    timeRunning = 0;
                    System.out.println("timeRunning = " + timeRunning);
                }
                System.out.println("timeRunning total = " + timeRunning);
            }
            System.out.println("timeRunning = " + timeRunning);

        } catch (java.lang.IndexOutOfBoundsException e) {

        }
    }

    // Method removeQueue จะทำการลบ Process เมื่อมีการกดปุุม End Task
    public void removeQueue() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) { //Loop ถ้า i = 0 เช็คว่า i < jobQueue.size ก็จะเพื่มค่า i ครั้งละ 1
                if (roundRobinQueue.get(0).getStatus() == "Running") {
                    if (roundRobinQueue.get(0) == jobQueue.get(i)) { // ถ้า roundRobinQueue ตําแหน่งที่ 0 เท่ากับ jobQueue ตําแหน่งที่ i
                        jobQueue.get(i).setStatus(4);  // ก็จะเซ็ตค่าเป็น Terminate
                        terminateQueue.add(jobQueue.get(i)); //เซ็ตค่า terminateQueue ตาม  jobQueue ตําแหน่งที่ i
                        jobQueue.remove(i);// ลบ  jobQueue ตําแหน่งที่ i
                        roundRobinQueue.remove(0); // ลบ  roundRobinQueue ตําแหน่งที่ 0
                        addCount--; //ลดค่า addCount ลงทีละ 1
                        break;
                    }
                } else if (firstComeFirstServedQueue.get(0).getStatus() == "Running") {
                    if (firstComeFirstServedQueue.get(0) == jobQueue.get(i)) {
                        jobQueue.get(i).setStatus(4);
                        terminateQueue.add(jobQueue.get(i));
                        jobQueue.remove(i);
                        firstComeFirstServedQueue.remove(0);
                        addCount--;
                        break;
                    }
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) { //

        }
    }

    public void waitingTime() {
        for (int i = 0; i < jobQueue.size(); i++) { //Loop ถ้า i = 0 เช็คว่า i < jobQueue.size ก็จะเพื่มค่า i ครั้งละ 1
            if (jobQueue.get(i).getStatus() == "Ready") {  // ถ้า jobQueue ตําแหน่งที่ i เท่ากับ "Ready"
                waitingTime = jobQueue.get(i).getWaitingTime();  //โดย get ค่า waitingTime มาใช้งาน
                waitingTime++; //เพิ่มค่า waitingTime ขึ้นทีละ 1
                jobQueue.get(i).setWaitingTime(waitingTime);//โดยนําค่า waitingTime มาเก็บยัง setBurstTime ของ Process นั้น

            }
        }
    }

    public void addMoniterQueue() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                if (roundRobinQueue.get(0).getStatus() == "Running") {
                    if (jobQueue.get(i).getStatus() == "Running") {
                        jobQueue.get(i).setStatus(3);
                        moniterQueue.add(jobQueue.get(i));
                        roundRobinQueue.remove(0);
                        break;
                    }
                } else if (firstComeFirstServedQueue.get(0).getStatus() == "Running") {

                    if (jobQueue.get(i).getStatus() == "Running") {
                        jobQueue.get(i).setStatus(3);
                        moniterQueue.add(jobQueue.get(i));
                        firstComeFirstServedQueue.remove(0);
                        break;
                    }
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {

        }

    }

    ////////////////////////////////////////Show////////////////////////////////////////////////////////////////////////////
    //Method สำหรับ set ค่าเริ่มต้นให้กับ index ฝั่ง view
    public int setIndexRr() {
        int index = 0;
        for (int i = 0; i < roundRobinQueue.size(); i++) {
            if (roundRobinQueue.get(0).getStatus() == "Running") {
                index = 1;
            } else {
                index = 0;
            }
        }
        return index;
    }

    public int setIndexFcfs() {
        int index = 0;
        for (int i = 0; i < firstComeFirstServedQueue.size(); i++) {
            if (firstComeFirstServedQueue.get(0).getStatus() == "Running") {
                index = 1;
            } else {
                index = 0;
            }
        }
        return index;
    }

    //Method showJobQueue  จะทำการเอาค่าตัวแปรมาเก็บไว้ในตัวแปรที่ชื่อว่า text แล้วจะนำไปเรียกใช้ที่ฝั่ง View
    //Method ที่ชื่อว่า Show โดยทั้งหมดแล้วจะถูกเรียกใช้ที่ฝั่ง View เหมือนกัน
    public String showJobQueue() {
        String text = "";
        for (int index = 0; index < jobQueue.size(); index++) {
            text = text + jobQueue.get(index).getProcessID() + " ";
            text = text + jobQueue.get(index).getStatus() + " ";
            text = text + jobQueue.get(index).getArrivalTime() + " ";
            text = text + jobQueue.get(index).getBurstTime() + " ";
            text = text + jobQueue.get(index).getWaitingTime() + " ";
            text = text + jobQueue.get(index).getIoTime() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showFirstComeFirstServedQueue() {
        String text = "";
        for (int index = 0; index < firstComeFirstServedQueue.size(); index++) {
            text = text + firstComeFirstServedQueue.get(index).getProcessID() + " ";
            text = text + firstComeFirstServedQueue.get(index).getStatus() + " ";
            text = text + firstComeFirstServedQueue.get(index).getArrivalTime() + " ";
            text = text + firstComeFirstServedQueue.get(index).getBurstTime() + " ";
            text = text + firstComeFirstServedQueue.get(index).getWaitingTime() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showRoundRobinQueue() {
        String text = "";
        for (int index = 0; index < roundRobinQueue.size(); index++) {
            text = text + roundRobinQueue.get(index).getProcessID() + " ";
            text = text + roundRobinQueue.get(index).getStatus() + " ";
            text = text + roundRobinQueue.get(index).getArrivalTime() + " ";
            text = text + roundRobinQueue.get(index).getBurstTime() + " ";
            text = text + roundRobinQueue.get(index).getWaitingTime() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showTerminateQueue() {
        String text = "";
        for (int index = 0; index < terminateQueue.size(); index++) {
            text = text + terminateQueue.get(index).getProcessID() + " ";
            text = text + terminateQueue.get(index).getStatus() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showCPU() {
        String text = "";
        for (int index = 0; index < jobQueue.size(); index++) {
            if (jobQueue.get(index).getStatus() == "Running") {
                text = text + jobQueue.get(index).getProcessID() + " ";
                text = text + jobQueue.get(index).getStatus() + " ";
                text = text + ",";
            }

        }
        return text;
    }

    public String showMoniter() {
        String text = "";
        for (int index = 0; index < moniterQueue.size(); index++) {
                text = text + moniterQueue.get(index).getProcessID() + " ";
                text = text + moniterQueue.get(index).getStatus() + " ";
                text = text + moniterQueue.get(index).getIoTime() + " ";
                text = text + ",";
        }
        return text;
    }

}