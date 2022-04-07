/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;


import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.PsychiatricOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.Psychiatrist.PsychiatristJPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhishekbagdare
 */
public class PsychiatristRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PsychiatristJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
    
}
