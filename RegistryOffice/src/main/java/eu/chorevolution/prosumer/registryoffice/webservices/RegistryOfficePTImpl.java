package eu.chorevolution.prosumer.registryoffice.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.chorevolution.prosumer.registryoffice.RegistryOfficePT;
import eu.chorevolution.prosumer.registryoffice.FarmOpeningNotificationType;
import eu.chorevolution.prosumer.registryoffice.FarmOpeningNotificationReturnType;
import eu.chorevolution.prosumer.registryoffice.SendRequestType;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationRequestReturnType;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationRequest;
import eu.chorevolution.prosumer.registryoffice.SendRequestType;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationNotificationReturnType;
import eu.chorevolution.prosumer.registryoffice.FarmRegistrationNotification;
import eu.chorevolution.prosumer.registryoffice.SendRequestType;
import eu.chorevolution.prosumer.registryoffice.FarmBusinessCodeStartupNotificationReturnType;
import eu.chorevolution.prosumer.registryoffice.FarmBusinessCodeStartupNotification;
import eu.chorevolution.prosumer.registryoffice.ReceiveFarmRegistrationResponseType;
import eu.chorevolution.prosumer.registryoffice.ReceiveFarmRegistrationResponseReturnType;

import eu.chorevolution.prosumer.registryoffice.business.ChoreographyDataService;
import eu.chorevolution.prosumer.registryoffice.business.ChoreographyInstanceMessagesStore;
import eu.chorevolution.prosumer.registryoffice.business.RegistryOfficeService;

import eu.chorevolution.prosumer.registryoffice.model.ChoreographyLoopIndexes;

@Component(value="RegistryOfficePTImpl")
public class RegistryOfficePTImpl implements RegistryOfficePT {
	
	private static Logger logger = LoggerFactory.getLogger(RegistryOfficePTImpl.class);

	@Autowired
	private RegistryOfficeService service;
	
	@Autowired
	private ChoreographyDataService choreographyDataService;
	
    @Override
    public FarmOpeningNotificationReturnType farmOpening(FarmOpeningNotificationType parameters) {
    	logger.info("CALLED farmOpening ON RegistryOffice");	
    	FarmOpeningNotificationReturnType result = new FarmOpeningNotificationReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmOpening(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		System.out.println("Register riceve messaggio f");
		return result;
    }
     
    @Override
    public FarmRegistrationRequestReturnType sendFarmRegistrationRequest(SendRequestType parameters) {
    	logger.info("CALLED sendFarmRegistrationRequest ON RegistryOffice");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmRegistrationRequest businessResult = service.createFarmRegistrationRequest(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmRegistrationRequestReturnType result = new FarmRegistrationRequestReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmRegistrationNotificationReturnType sendFarmRegistrationNotification(SendRequestType parameters) {
    	logger.info("CALLED sendFarmRegistrationNotification ON RegistryOffice");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmRegistrationNotification businessResult = service.createFarmRegistrationNotification(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmRegistrationNotificationReturnType result = new FarmRegistrationNotificationReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmBusinessCodeStartupNotificationReturnType sendFarmBusinessCodeStartupNotification(SendRequestType parameters) {
    	logger.info("CALLED sendFarmBusinessCodeStartupNotification ON RegistryOffice");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmBusinessCodeStartupNotification businessResult = service.createFarmBusinessCodeStartupNotification(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmBusinessCodeStartupNotificationReturnType result = new FarmBusinessCodeStartupNotificationReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
	@Override
	public ReceiveFarmRegistrationResponseReturnType receiveFarmRegistrationResponse(ReceiveFarmRegistrationResponseType parameters) {
		logger.info("CALLED receiveFarmRegistrationResponse ON RegistryOffice");
		ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getOutputMessageName(), parameters.getChoreographyTaskName(), parameters.getOutputMessageData());
		service.receiveFarmRegistrationResponse(parameters.getOutputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		return new ReceiveFarmRegistrationResponseReturnType();
	}
     

	
}
