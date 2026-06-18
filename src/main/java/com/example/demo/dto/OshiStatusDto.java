package com.example.demo.dto;

import oshi.software.os.OperatingSystem.OSVersionInfo;

public record OshiStatusDto(
		String osFamily,
		OSVersionInfo osVersion,
		int osBitness,
		long systemUptime,
		int systemPhysicalCores,
		int systemLogicalCores,
		String systemHostname
		) {
	
}
