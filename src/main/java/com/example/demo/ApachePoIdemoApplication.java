package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.function.CreateExcelDemo;
import com.example.demo.function.ReadExcelDemo;
import com.example.demo.function.ReadExcelXLSXDemo;
import com.example.demo.function.UpdateExcelDemo;

@SpringBootApplication
public class ApachePoIdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApachePoIdemoApplication.class, args);
		
		try {
			CreateExcelDemo.createExcelFile();
			ReadExcelDemo.readExcel("D:\\apachepoi\\demo\\tiep\\employee.xls");
			ReadExcelXLSXDemo.readExcel("D:\\apachepoi\\demo\\tiep\\readDemo.xlsx");
			UpdateExcelDemo.updateExcel("D:\\apachepoi\\demo\\tiep\\employee.xls");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
