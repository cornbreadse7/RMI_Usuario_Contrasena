package org.example;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AuthServerMain {
    public static void main(String[] args) {
        try {
            AuthServer authServer = new AuthServerImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("AuthServer", authServer);
            System.out.println("Servidor Listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}