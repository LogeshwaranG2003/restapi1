package com.example.demo.day7.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.day7.model.*;
import com.example.demo.day7.repository.*;

@Service
public class service {
	@Autowired
	 repo urepo;
	
	public usermodel saveDetails(usermodel u)
	{
		return urepo.save(u);
	}
	public usermodel updateDetails(usermodel um) {
		return urepo.saveAndFlush(um);
	}
	public boolean deleteGift(int Id) {
		if(urepo.existsById(Id)) {
			urepo.deleteById(Id);
			return true;
		}
		return false;
	}
	public Optional<usermodel> getUserId(int userId)
	   {
		   Optional<usermodel>gift=urepo.findById(userId);
		   if(gift.isPresent())
		   {
			   return gift;
		   }
		   return null;
	   }
	public List<usermodel> sortByDesc(String userFirstName){
		return urepo.findAll(Sort.by(userFirstName).descending());
	}
	public List<usermodel> sortByAesc(String userFirstName){
		return urepo.findAll(Sort.by(userFirstName).ascending());
	}
	public List<usermodel>pagination(int pageNu,int pageSize)
	{
		Page<usermodel>cont=urepo.findAll(PageRequest.of(pageNu, pageSize));
		return cont.getContent();
	}
	public List<usermodel>paginationAndSorting(int pageNu,int pageSize,String userFirstName)
	{
		Page<usermodel>cont1=urepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(userFirstName).descending()));
		return cont1.getContent();
	}
	
	public List<usermodel> getDetails()
	{
		return urepo.findAll();
	}
}