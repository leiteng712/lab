package org.example.design_mode.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author: leiteng
 * @date: 2020/10/10 9:01
 */
public class Client {
    public static void main(String[] args) {
        try {
            IStudentService studentService = (IStudentService) Naming.lookup("rmi://127.0.0.1:5000/studentService");
            List<Student> list = studentService.list();
            list.forEach(System.out::println);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
