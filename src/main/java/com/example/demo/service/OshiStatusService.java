package com.example.demo.service;

import com.example.demo.dto.OshiStatusDto;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystem.OSVersionInfo;
import oshi.software.os.NetworkParams;

public class OshiStatusService {
	public OshiStatusDto getStatus() {
	SystemInfo si=new SystemInfo();
	String osFamily=si.getOperatingSystem().getFamily();
	OSVersionInfo osVersion=si.getOperatingSystem().getVersionInfo();
	int osBitness=si.getOperatingSystem().getBitness();
	
	long systemUptime=si.getOperatingSystem().getSystemUptime();
	
	int systemPhysicalCores=si.getHardware().getProcessor().getPhysicalProcessorCount();
	int systemLogicalCores=si.getHardware().getProcessor().getLogicalProcessorCount();
	
	String systemHostname=si.getOperatingSystem().getNetworkParams().getHostName();
	
	return new OshiStatusDto(
			osFamily,
			osVersion,
			osBitness,
			systemUptime,
			systemPhysicalCores,
			systemLogicalCores,
			systemHostname
			);
	}
}
