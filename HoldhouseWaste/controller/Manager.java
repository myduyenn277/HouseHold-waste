package HoldhouseWaste.controller;

import java.util.ArrayList;
import java.util.List;

import HoldhouseWaste.repo.IManagerRepository;
import HoldhouseWaste.repo.ManagerRepository;
import HoldhouseWaste.view.Menu;

public class Manager extends Menu<String>{
    static String[] mc = {"Garbage collection bidding fee collection program.","Exit."};
    IManagerRepository managerRepository;
    List<Integer> kl;
    public Manager(){
        super("===== System calculation =====",mc);
        managerRepository = new ManagerRepository();
        kl = new ArrayList<Integer>();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                managerRepository.display(kl);
                break;
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
}
