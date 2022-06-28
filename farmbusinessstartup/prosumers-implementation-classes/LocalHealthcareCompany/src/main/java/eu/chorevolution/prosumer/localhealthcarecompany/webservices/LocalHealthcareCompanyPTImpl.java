package eu.chorevolution.prosumer.localhealthcarecompany.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.chorevolution.prosumer.localhealthcarecompany.LocalHealthcareCompanyPT;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupRequestType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupRequestReturnType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionResponseType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionResponseReturnType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmRegistrationNotificationType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmRegistrationNotificationReturnType;
import eu.chorevolution.prosumer.localhealthcarecompany.SendRequestType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionRequestReturnType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionRequest;
import eu.chorevolution.prosumer.localhealthcarecompany.SendRequestType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmOpeningNotificationReturnType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmOpeningNotification;
import eu.chorevolution.prosumer.localhealthcarecompany.SendRequestType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupResponseReturnType;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupResponse;

import eu.chorevolution.prosumer.localhealthcarecompany.business.ChoreographyDataService;
import eu.chorevolution.prosumer.localhealthcarecompany.business.ChoreographyInstanceMessagesStore;
import eu.chorevolution.prosumer.localhealthcarecompany.business.LocalHealthcareCompanyService;

import eu.chorevolution.prosumer.localhealthcarecompany.model.ChoreographyLoopIndexes;

@Component(value="LocalHealthcareCompanyPTImpl")
public class LocalHealthcareCompanyPTImpl implements LocalHealthcareCompanyPT {
	
	private static Logger logger = LoggerFactory.getLogger(LocalHealthcareCompanyPTImpl.class);

	@Autowired
	private LocalHealthcareCompanyService service;
	
	@Autowired
	private ChoreographyDataService choreographyDataService;
	
    @Override
    public FarmBusinessStartupRequestReturnType farmBusinessCodeRequest(FarmBusinessStartupRequestType parameters) {
    	logger.info("CALLED farmBusinessCodeRequest ON LocalHealthcareCompany");	
    	FarmBusinessStartupRequestReturnType result = new FarmBusinessStartupRequestReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmBusinessCodeRequest(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmSiteInspectionResponseReturnType farmSiteInspectionVerbal(FarmSiteInspectionResponseType parameters) {
    	logger.info("CALLED farmSiteInspectionVerbal ON LocalHealthcareCompany");	
    	FarmSiteInspectionResponseReturnType result = new FarmSiteInspectionResponseReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmSiteInspectionVerbal(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmRegistrationNotificationReturnType farmBusinessStartupNotification(FarmRegistrationNotificationType parameters) {
    	logger.info("CALLED farmBusinessStartupNotification ON LocalHealthcareCompany");	
    	FarmRegistrationNotificationReturnType result = new FarmRegistrationNotificationReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmBusinessStartupNotification(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmSiteInspectionRequestReturnType sendFarmSiteInspectionRequest(SendRequestType parameters) {
    	logger.info("CALLED sendFarmSiteInspectionRequest ON LocalHealthcareCompany");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmSiteInspectionRequest businessResult = service.createFarmSiteInspectionRequest(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmSiteInspectionRequestReturnType result = new FarmSiteInspectionRequestReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmOpeningNotificationReturnType sendFarmOpeningNotification(SendRequestType parameters) {
    	logger.info("CALLED sendFarmOpeningNotification ON LocalHealthcareCompany");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmOpeningNotification businessResult = service.createFarmOpeningNotification(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmOpeningNotificationReturnType result = new FarmOpeningNotificationReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmBusinessStartupResponseReturnType sendFarmBusinessStartupResponse(SendRequestType parameters) {
    	logger.info("CALLED sendFarmBusinessStartupResponse ON LocalHealthcareCompany");	
	    ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmBusinessStartupResponse businessResult = service.createFarmBusinessStartupResponse(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
    	store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmBusinessStartupResponseReturnType result = new FarmBusinessStartupResponseReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     

	
}
