/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Enterprise;
import business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author virajshah
 */
public class PharmaceuticalEnterprise extends Enterprise {
    
    public PharmaceuticalEnterprise(String name){
        super(name,EnterpriseType.Rehabilitation);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
