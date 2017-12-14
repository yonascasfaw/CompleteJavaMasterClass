import com.yonas.Branch;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public boolean addbranch(String location){
        if(findBranch(location)<0){
            Branch newBranch = new Branch(location);
            branches.add(newBranch);
            return true;
        }else
        return false;
    }

    public boolean addCustomer(String location, String customerName, Double transaction){
        if(findBranch(location)>=0){
            branches.get(findBranch(location)).addCustomer(customerName,transaction);
            return true;
        }else
            return false;
    }

    public boolean addTransaction(String location, String customerName, Double transaction){
        Branch thisBranch = new Branch(location);
        if(findBranch(location)>=0){
            if(thisBranch.findCustomer(customerName)>=0){
                branches.get(findBranch(location)).addTransaction(customerName,transaction);
                return true;
            }
        }
            return false;
    }


    public int findBranch(String location){
        for(int i=0; i<=branches.size(); i++){
            if(branches.get(i).getBranchLocation() == location){
                return i;
            }
        }
        return -1;
    }

}
