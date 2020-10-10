package org.example.design_mode.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;

/**
 * @author: leiteng
 * @date: 2020/10/10 8:56
 */
public class StudentServiceImpl extends UnicastRemoteObject implements IStudentService {

    protected StudentServiceImpl() throws RemoteException {
    }

    public List<Student> list() throws RemoteException {
        return Arrays.asList(new Student("light", 21));
    }
}
