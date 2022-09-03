package eu.chorevolution.prosumer.veterinary.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.chorevolution.prosumer.veterinary.VeterinaryPT;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequestType;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequestReturnType;
import eu.chorevolution.prosumer.veterinary.FarmRegistrationNotificationType;
import eu.chorevolution.prosumer.veterinary.FarmRegistrationNotificationReturnType;
import eu.chorevolution.prosumer.veterinary.SendRequestType;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionResponseReturnType;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionResponse;

import eu.chorevolution.prosumer.veterinary.business.ChoreographyDataService;
import eu.chorevolution.prosumer.veterinary.business.ChoreographyInstanceMessagesStore;
import eu.chorevolution.prosumer.veterinary.business.VeterinaryService;

import eu.chorevolution.prosumer.veterinary.model.ChoreographyLoopIndexes;

@Component(value="VeterinaryPTImpl")
public class VeterinaryPTImpl implements VeterinaryPT {
	
	private static Logger logger = LoggerFactory.getLogger(VeterinaryPTImpl.class);

	@Autowired
	private VeterinaryService service;
	
	@Autowired
	private ChoreographyDataService choreographyDataService;
	
    @Override
    public FarmSiteInspectionRequestReturnType farmOpeningSiteInspectionRequest(FarmSiteInspectionRequestType parameters) {
    	logger.info("CALLED farmOpeningSiteInspectionRequest ON Veterinary");	
    	FarmSiteInspectionRequestReturnType result = new FarmSiteInspectionRequestReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmOpeningSiteInspectionRequest(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmRegistrationNotificationReturnType farmHealthcareRegistration(FarmRegistrationNotificationType parameters) {
    	logger.info("CALLED farmHealthcareRegistration ON Veterinary");	
    	FarmRegistrationNotificationReturnType result = new FarmRegistrationNotificationReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmHealthcareRegistration(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmSiteInspectionResponseReturnType sendFarmSiteInspectionResponse(SendRequestType parameters) {
    	logger.info("CALLED sendFarmSiteInspectionResponse ON Veterinary");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmSiteInspectionResponse businessResult = service.createFarmSiteInspectionResponse(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmSiteInspectionResponseReturnType result = new FarmSiteInspectionResponseReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     

	
}
