package org.javarx.jersey.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.javarx.jersey.messenger.model.Message;

public class DatabaseClass {
	
	/**
	 * Usually implementing JDBC or similar database
	 * but for simplicity and practice with Jax RS
	 * Just using HashMap to act as a 'Database'
	 */

	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<Long, Message> profiles = new HashMap<Long, Message>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Message> getProfiles() {
		return profiles;
	}
}
