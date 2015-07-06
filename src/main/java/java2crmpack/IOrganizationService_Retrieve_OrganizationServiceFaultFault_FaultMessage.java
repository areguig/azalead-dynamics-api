/**
 * IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package java2crmpack;

public class IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage
    extends Exception {
    private static final long serialVersionUID = 1436216073745L;
    private java2crmpack.OrganizationServiceStub.OrganizationServiceFaultE faultMessage;

    public IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage() {
        super(
            "IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage");
    }

    public IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage(
        String s) {
        super(s);
    }

    public IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage(
        String s, Throwable ex) {
        super(s, ex);
    }

    public IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage(
        Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        java2crmpack.OrganizationServiceStub.OrganizationServiceFaultE msg) {
        faultMessage = msg;
    }

    public java2crmpack.OrganizationServiceStub.OrganizationServiceFaultE getFaultMessage() {
        return faultMessage;
    }
}
