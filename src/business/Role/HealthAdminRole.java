/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.EnterpriseAdmin.EnterpriseAdminJPanel;
import javax.swing.JPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhishekbagdare
 */
public class HealthAdminRole extends Role {
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new EnterpriseAdminJPanel(userProcessContainer, enterprise, business);
    }

}
