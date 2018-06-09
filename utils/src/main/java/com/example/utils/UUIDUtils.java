package com.example.utils;

import java.util.UUID;

/**
 *
 * @author DELL
 *
 */
public class UUIDUtils {

	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
