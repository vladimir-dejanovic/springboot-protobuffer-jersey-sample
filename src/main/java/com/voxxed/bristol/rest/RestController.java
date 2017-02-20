package com.voxxed.bristol.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.ComponentScan;

import com.voxxed.bristol.pojo.AttendeeJson;
import com.voxxed.bristol.pojo.AttendeeXml;

import com.voxxed.bristol.pojo.AttendeeProto.Attendee;
import com.voxxed.bristol.pojo.AttendeeProto.Attendee.Address;

@ComponentScan
@Path("/")
public class RestController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String text() {
		return "John Text Doe";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json")
	public AttendeeJson json() {
		return new AttendeeJson();
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/xml")
	public AttendeeXml xml() {
		return new AttendeeXml();
	}
	
	@GET
	@Path("/proto")
	public void proto(@Context HttpServletRequest req,@Context  HttpServletResponse resp) throws IOException {
		
		Address.Builder address = Address.newBuilder();
		Attendee.Builder attendee = Attendee.newBuilder();
				
		address.setCity("Bristol");
		address.setStreet("Canon's Road");
		address.setNumber(1);
		
		attendee.setFirstName("John Proto");
		attendee.setLastName("Doe");
		attendee.setAddress(address.build());
		
		Attendee data = attendee.build();
		
		resp.setContentType("application/protobuf");
		resp.setContentLength(data.getSerializedSize());
		data.writeTo(resp.getOutputStream());		
	}	
}
