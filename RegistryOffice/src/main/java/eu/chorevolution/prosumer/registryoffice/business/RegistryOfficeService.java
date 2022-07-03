package eu.chorevolution.prosumer.registryoffice.business;

import eu.chorevolution.prosumer.registryoffice.FarmOpeningNotification;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationRequest;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationNotification;
import eu.chorevolution.prosumer.registryoffice.FarmBusinessCodeStartupNotification;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationResponse;

import eu.chorevolution.prosumer.registryoffice.model.ChoreographyLoopIndexes;

public interface RegistryOfficeService {

	void farmOpening(FarmOpeningNotification parameter, String choreographyTaskName, String senderParticipantName);
	      
	FarmRegistrationRequest createFarmRegistrationRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
	FarmRegistrationNotification createFarmRegistrationNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
	FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
    void receiveFarmRegistrationResponse(FarmRegistrationResponse parameter, String choreographyTaskName, String senderParticipantName);
    
}
