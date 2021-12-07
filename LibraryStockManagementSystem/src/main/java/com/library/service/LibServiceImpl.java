package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Books;
import com.library.model.Librarians;

import com.library.repository.LibRepository;
@Service
public class LibServiceImpl implements LibService{
	@Autowired
	LibRepository libRepository;
	
	@Override
	public void addLib(Librarians librarians) {
		// TODO Auto-generated method stub
		libRepository.save(librarians);
	}
	@Override
	public Librarians validateLib(Librarians librarians) {
		// TODO Auto-generated method stub
		
		Librarians librarians1=libRepository.findByLoginData(librarians.getLibName(), librarians.getPassword());
		return librarians1;
	}
}
