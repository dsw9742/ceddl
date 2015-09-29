package com.contentualize.model.ceddl;

import org.springframework.mobile.device.Device;

public class DeviceToString {

	public static String deviceToString(Device device) {
		if (device.isTablet()) {
			return "tablet";
		} else if (device.isMobile()) {
			return "mobile";
		} else {
			return "desktop";
		}
	}
	
}
