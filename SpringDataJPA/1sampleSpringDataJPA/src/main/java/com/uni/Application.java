package com.uni;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.uni.bo.CaronaVaccine;
import com.uni.service.ICaronaService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext factory= SpringApplication.run(Application.class, args);
		ICaronaService service=factory.getBean(ICaronaService.class);
		
		
//		List<CaronaVaccine> list=new ArrayList<CaronaVaccine>();
//		list.add(new CaronaVaccine(null, "sputinic", 800, "russia", 0));
//		list.add(new CaronaVaccine(null, "pfzier", 1000, "usa", 0));
//		list.add(new CaronaVaccine(null, "coviedhield", 500, "speed", 3));
//		System.out.println(service.registerGroup(list));
		//System.out.println(service.findingById(1L));
		//System.out.println(service.checkAvailability(1L));
	//service.findAll().forEach(System.out::println);
		//service.deleteByID(2L);
		service.deleteByObject(new CaronaVaccine(3L,"sputinic", 800,"russia",0));
	}

}
