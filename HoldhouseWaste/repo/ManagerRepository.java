package HoldhouseWaste.repo;

import java.util.List;

import HoldhouseWaste.dataAccess.ManagerDao;

public class ManagerRepository implements IManagerRepository{

    @Override
    public void display(List<Integer> kl) {
        ManagerDao.Instance().display(kl);
    }
    
}