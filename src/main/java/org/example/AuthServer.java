package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthServer extends Remote {
    public boolean authenticate(String username, String password) throws RemoteException;
}
