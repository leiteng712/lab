package org.example.design_mode.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author: leiteng
 * @date: 2020/10/10 8:52
 */
public class Start {

    public static void main(String[] args) {
        try {
            IStudentService studentService = new StudentServiceImpl();
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://127.0.0.1:5000/studentService", studentService);
            System.out.println("服务已经启动");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
