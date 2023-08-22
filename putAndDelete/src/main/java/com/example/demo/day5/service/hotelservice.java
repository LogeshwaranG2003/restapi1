package com.example.demo.day5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day5.model.hotelmodel;
import com.example.demo.day5.repository.hotelrepo;

@Service
public class hotelservice {
	@Autowired
	public hotelrepo hp;
	//post the data
	public hotelmodel saveDetails(hotelmodel hm)
	{
		return hp.save(hm);
	}
	//get the data
	public List<hotelmodel>getDetails()
	{
		return hp.findAll();
	}
	//update the data
	public hotelmodel updateDetails(hotelmodel hc)
	{
		return hp.saveAndFlush(hc);
	}
	//delete the data
	public void deleteDetails(int hotelid)
	{
		System.out.println("Deleted");
		hp.deleteById(hotelid);
	}

}