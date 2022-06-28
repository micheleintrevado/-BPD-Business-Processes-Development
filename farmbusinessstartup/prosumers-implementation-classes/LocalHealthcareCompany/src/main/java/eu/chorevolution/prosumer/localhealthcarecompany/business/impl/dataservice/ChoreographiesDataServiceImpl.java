package eu.chorevolution.prosumer.localhealthcarecompany.business.impl.dataservice;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import eu.chorevolution.prosumer.localhealthcarecompany.business.ChoreographyDataService;
import eu.chorevolution.prosumer.localhealthcarecompany.business.ChoreographyInstanceMessagesStore;
import eu.chorevolution.prosumer.localhealthcarecompany.model.MessagesData;

@Service
public class ChoreographiesDataServiceImpl<T> implements ChoreographyDataService {
	// choregraphyID, ChoreographyInstanceMessages
	private HashMap<String, ChoreographyInstanceMessagesStore<T>> choreographyInstancesMessages = new HashMap<>();

	public ChoreographyInstanceMessagesStore<T> getChoreographyInstanceMessages(String choreographyID) {
		
		if(!choreographyInstancesMessages.containsKey(choreographyID)){
			HashMap<String, List<MessagesData<T>>> map = new HashMap<String, List<MessagesData<T>>>();
			ChoreographyInstanceMessagesStore<T> choreographyInstanceMessages = new ChoreographyInstanceMessagesStoreImpl<T>(map);
			choreographyInstancesMessages.put(choreographyID, choreographyInstanceMessages);
		}			
		return choreographyInstancesMessages.get(choreographyID);
	}
	
}
