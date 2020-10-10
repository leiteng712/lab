package org.example.design_mode.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author: leiteng
 * @date: 2020/10/10 8:55
 */
public interface IStudentService extends Remote {

    List<Student> list() throws RemoteException;
}
