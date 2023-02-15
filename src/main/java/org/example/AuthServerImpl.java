package org.example;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AuthServerImpl extends UnicastRemoteObject implements AuthServer {
    private static final long serialVersionUID = 1L;

    protected AuthServerImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean authenticate(String username, String password) throws RemoteException {
        // Aquí se puede implementar la lógica de autenticación, por ejemplo, consultando una base de datos.
        return username.equals("usuario") && password.equals("contraseña");
    }
}
