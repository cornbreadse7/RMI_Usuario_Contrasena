package org.example;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class AuthClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            AuthServer authServer = (AuthServer) Naming.lookup("rmi://localhost/AuthServer");
            System.out.println("Bienvenido al sistema de autenticación de la Farmacia");
            System.out.print("Ingrese el Usuario: ");
            String username = scan.nextLine();
            System.out.print("Ingrese la Contraseña: ");
            String password = scan.nextLine();
            if (authServer.authenticate(username, password)) {
                System.out.println("Autenticación exitosa.");
            } else {
                System.out.println("Autenticación fallida.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();
    }
}

