package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.model1;
import com.example.demo.Repository.Repository1;



@org.springframework.stereotype.Service
public class Service1 {
	
		@Autowired
		Repository1 Erepo1;
		public String adDetails(model1 ee) {
			Erepo1.save(ee);
			return "Data added";
		}
		public String upDetails(model1 ee) {
			Erepo1.saveAndFlush(ee);
			return "Data updated";
		}
		
		public String delDetails(int id) {
			Erepo1.deleteById(id);
			return "data Deleted";
		}
		public List<model1> shDetails() {
				return Erepo1.findAll();
		}

}