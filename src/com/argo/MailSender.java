/*
package com.argo;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MailSender {
	public static void main(String[] args) {
	String inputJSON = "{\"objectId\" : \"1234\",\"nikeMaterialComments\" : \"Cooment added for @muktsingh\"}";
			Object obj = null;
    try {
         obj= new JSONParser().parse(inputJSON); // throws ParseException()
    } catch (Exception e){
        try {
			throw new Exception("{\n \"error\" : \" Error while parsing the input JSON for Delete attachment. Provide correct input with Attachment Order Number.\"\n}");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    JSONObject jsonObj = (JSONObject) obj;
    String comment = (String)jsonObj.get("nikeMaterialComments");
    System.out.println("comment:::::"+comment.substring(comment.indexOf("@")+1,comment.length()));
	}
}*/
