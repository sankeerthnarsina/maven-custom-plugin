package com.personal;

public class EMailService {
	public EMail sendEmail(String fromAddress, String toAddress, String subject, String message){

        EMail emailObject = new EMail();
        emailObject.setFromAddress(fromAddress);
        emailObject.setToAddress(toAddress);
        emailObject.setSubject(subject);
        emailObject.setMessage(message);
        emailObject.setStatus("SUCCESS");

        System.out.println("Sending email from " + fromAddress + " to " + toAddress + "with subject "
		    + subject + " having the message contents " + message);
        return emailObject;
    }
}
