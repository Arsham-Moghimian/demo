package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class XrayService {
	public String getStatus() {
		try {
			ProcessBuilder pb=new ProcessBuilder(
						"systemctl","status","xray"
					);
			Process process=pb.start();
		
			BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			StringBuilder output =
	                   new StringBuilder();

            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line)
                        .append("\n");
            }

            return output.toString();
		} catch (Exception e) {
            return e.getMessage();
        }
	}
}
