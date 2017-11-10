/*
	SRP - Single responsibility principle violation

	Class Modem has two responsibilities namely:
	Communication Control - i.e. dial and hangup
	Data Transmission - i.e. send and receive
*/
public interface VSRPModem {

    public void dial(String telephoneNumber);
    public void hangup();
    public void send(char c);
    public char receive();
}
