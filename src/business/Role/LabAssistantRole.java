/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;
 
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.Lab.LabAssistantJPanel;
import javax.swing.JPanel;

/**
 *
 * @author virajshah
 */
public class LabAssistantRole extends Role {

   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new LabAssistantJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
 

}
