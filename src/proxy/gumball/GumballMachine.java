package proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    private String location;
    private int count;

    public int getCount() {
        return count;
    }


    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return this.location;
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }
}