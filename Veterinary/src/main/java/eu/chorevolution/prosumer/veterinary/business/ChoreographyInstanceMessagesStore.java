package eu.chorevolution.prosumer.veterinary.business;

public interface ChoreographyInstanceMessagesStore<T> extends ChoreographyInstanceMessages<T> {

	public void storeMessage(String senderParticipantName, String receivingParticipantName, String messageName, String taskName, T message) ;
	
}
