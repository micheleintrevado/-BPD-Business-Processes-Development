package eu.chorevolution.prosumer.registryoffice.business.impl.service;

import org.springframework.stereotype.Service;

import eu.chorevolution.prosumer.registryoffice.FarmBusinessCodeStartupNotification;
import eu.chorevolution.prosumer.registryoffice.FarmOpeningNotification;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationNotification;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationRequest;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationResponse;
import eu.chorevolution.prosumer.registryoffice.business.ChoreographyInstanceMessages;
import eu.chorevolution.prosumer.registryoffice.business.RegistryOfficeService;

@Service
public class RegistryOfficeServiceImpl implements RegistryOfficeService {

	@Override
	public void farmOpening(FarmOpeningNotification parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmOpeningNotification message from senderParticipantName
		*/
	}     

    @Override
    public FarmRegistrationRequest createFarmRegistrationRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	
    	FarmRegistrationRequest result = new FarmRegistrationRequest();
        FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company","Farm Opening"); 	
        result.setFarm(farmOpeningNotification.getFarmOpeningRequestForm().getFarm());
    	result.setOwner(farmOpeningNotification.getFarmOpeningRequestForm().getOwner());
    	result.setSiteInspectionDetails(farmOpeningNotification.getSiteInspectionDetails());
    	return result;
    }
    
    @Override
    public FarmRegistrationNotification createFarmRegistrationNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {

    	FarmRegistrationNotification result = new FarmRegistrationNotification();
        FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmRegistrationResponse", "Registry Office", "Farm Registration");       
    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmOpeningNotification", "Registry Office", "Farm Opening");    	    	
    	result.setBreedingMethodologyType(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getBreedingMethodologyType());
    	result.setFarmCode(farmRegistrationResponse.getFarmCode());
    	result.setFarmName(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getFarmName());
    	result.setFarmSurface(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getFarmSurface());
    	result.setProductionType(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getProductionType());
    	result.setSiteAddress(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getCompanyHeadquarter());
    	return result;
    }
    
    @Override
    public FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {

    	FarmBusinessCodeStartupNotification result = new FarmBusinessCodeStartupNotification();
    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmRegistrationResponse", "Registry Office", "Farm Registration");      	
    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmOpeningNotification", "Registry Office", "Farm Opening");    	    	
    	result.setFarm(farmOpeningNotification.getFarmOpeningRequestForm().getFarm());
    	result.setFarmCode(farmRegistrationResponse.getFarmCode());
    	return result;
    }
    
	@Override    
    public void receiveFarmRegistrationResponse(FarmRegistrationResponse parameter, String choreographyTaskName, String senderParticipantName) {
    	/**
		*	TODO Add your business logic upon the reception of (FarmRegistrationResponse message from senderParticipantName 
		*		 within the interaction belonging to choreographyTaskName
		*/
    }
    
    

}
