package eu.chorevolution.prosumer.veterinary.business;

import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequest;
import eu.chorevolution.prosumer.veterinary.FarmRegistrationNotification;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionResponse;

import eu.chorevolution.prosumer.veterinary.model.ChoreographyLoopIndexes;

public interface VeterinaryService {

	void farmOpeningSiteInspectionRequest(FarmSiteInspectionRequest parameter, String choreographyTaskName, String senderParticipantName);
	      
	void farmHealthcareRegistration(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName);
	      
	FarmSiteInspectionResponse createFarmSiteInspectionResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
}
