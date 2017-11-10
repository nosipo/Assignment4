/*
	SRP - Single responsibility principle adherence

	Create two interfaces namely:
	Communicator
	Transmitter
*/

public interface SRPCommunicator {

    public void dial(String telephoneNumber);
    public void hangup();
}
