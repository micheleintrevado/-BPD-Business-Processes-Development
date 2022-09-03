package eu.chorevolution.prosumer.veterinary.business.impl.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import eu.chorevolution.prosumer.veterinary.FarmRegistrationNotification;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequest;
import eu.chorevolution.prosumer.veterinary.FarmSiteInspectionResponse;
import eu.chorevolution.prosumer.veterinary.VeterinarySiteInspectionDetails;
import eu.chorevolution.prosumer.veterinary.business.ChoreographyInstanceMessages;
import eu.chorevolution.prosumer.veterinary.business.VeterinaryService;

@Service
public class VeterinaryServiceImpl implements VeterinaryService {

	@Override
	public void farmOpeningSiteInspectionRequest(FarmSiteInspectionRequest parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmSiteInspectionRequest message from senderParticipantName
		*/
	}     

	@Override
	public void farmHealthcareRegistration(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmRegistrationNotification message from senderParticipantName
		*/
	}     

    @Override
    public FarmSiteInspectionResponse createFarmSiteInspectionResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
 
    	FarmSiteInspectionResponse result = new FarmSiteInspectionResponse();
    	FarmSiteInspectionRequest farmSiteInspectionRequest = (FarmSiteInspectionRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmSiteInspectionRequest", "Veterinary", "Farm Opening Site Inspection Request");    		
    	VeterinarySiteInspectionDetails veterinarySiteInspectionDetails = new VeterinarySiteInspectionDetails();
    	veterinarySiteInspectionDetails.setBreedingMethodologyType(farmSiteInspectionRequest.getBreedingMethodologyType());
    	veterinarySiteInspectionDetails.setFarmSurface(farmSiteInspectionRequest.getFarmSurface());
    	veterinarySiteInspectionDetails.setProductionType(farmSiteInspectionRequest.getProductionType());
    	veterinarySiteInspectionDetails.setReferenceLegislation("D.L.vo 146/01");
    	veterinarySiteInspectionDetails.setSiteAddress(farmSiteInspectionRequest.getSiteAddress());
    	veterinarySiteInspectionDetails.setSiteInspectionDate(new Date());
    	veterinarySiteInspectionDetails.setVeterinarySurname("Doe");
    	veterinarySiteInspectionDetails.setVeterinaryName("John");
    	result.setSiteInspectionVerbal(veterinarySiteInspectionDetails);
    	return result;
    }
    

}
