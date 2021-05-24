/*
package com.nc;

public class Commentcode {

	*/
/*
	 * 
	 * 
	 * 
	 * public static void main(String [] args) { // Recipient's email ID needs to be
	 * mentioned. String to = <Recipient email id>>;
	 * 
	 * // Sender's email ID needs to be mentioned String from =
	 * <sender email id>>;
	 * 
	 * // Assuming you are sending email from localhost String host =
	 * "email sent from";
	 * 
	 * // Get system properties Properties properties = new Properties();
	 * 
	 * // Setup mail server properties.put("mail.smtp.host", host);
	 * //properties.put("mail.smtp.port", "465");
	 * //properties.put("mail.smtp.ssl.enable", "true");
	 * properties.put("mail.smtp.auth", "true");
	 * properties.put("mail.smtp.starttls.enable", "true");
	 * //properties.put("mail.smtp.port", "587");
	 * 
	 * // Get the default Session object. Session session =
	 * Session.getInstance(properties, new javax.mail.Authenticator() {
	 * 
	 * protected PasswordAuthentication getPasswordAuthentication() {
	 * 
	 * return new PasswordAuthentication(emaid id , password);
	 * 
	 * }
	 * 
	 * });
	 * 
	 * try { // Create a default MimeMessage object. MimeMessage message = new
	 * MimeMessage(session);
	 * 
	 * // Set From: header field of the header. message.setFrom(new
	 * InternetAddress(from));
	 * 
	 * // Set To: header field of the header.
	 * message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	 * 
	 * // Set Subject: header field message.setSubject("This is the Subject Line!");
	 * 
	 * // Now set the actual message message.setText("This is actual message");
	 * 
	 * // Send message Transport.send(message);
	 * System.out.println("Sent message successfully...."); } catch
	 * (MessagingException mex) { mex.printStackTrace(); } }
	 * 
	 * 
	 *//*
*/
/**
		 * Utility method to send simple HTML email
		 * 
		 * @param session
		 * @param toEmail
		 * @param subject
		 * @param body
		 *//*

	*/
/*
	 * public static void main(String[] args) {
	 * 
	 * try { String to = email id; String from =
	 * email id; Properties props = new Properties();
	 * props.put("mail.smtp.host", "smtp-mail.outlook.com");
	 * props.put("mail.smtp.port", "587"); props.put("mail.smtp.starttls.enable",
	 * "true"); props.put("mail.smtp.auth", "true");
	 * 
	 * Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	 * 
	 * protected PasswordAuthentication getPasswordAuthentication() {
	 * 
	 * return new PasswordAuthentication(emailid, password);
	 * 
	 * }
	 * 
	 * }); String msgBody = "Sending email using JavaMail API..."; Message msg = new
	 * MimeMessage(session); msg.setFrom(new InternetAddress(from, "NoReply"));
	 * msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to,
	 * "Mr. Recipient")); msg.setSubject("Welcome To Java Mail API");
	 * msg.setText(msgBody); Transport.send(msg);
	 * System.out.println("Email sent successfully..."); //
	 * logger.error("Email sent successfully..."); } catch (AddressException e) {
	 * e.printStackTrace(); } catch (MessagingException e) { e.printStackTrace(); }
	 * catch (UnsupportedEncodingException e) { e.printStackTrace(); }
	 * 
	 * }
	 *//*

	


}
*/
