package com.aksigorta.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.aksigorta.service.IhbarService;

public class IhbarServiceImpl implements IhbarService{

//	@Autowired
//	EvrakConnector evrakConnector;

	@Override
	public List<String> ihbarAl() {
		return null;
//		return evrakConnector.evrakIsimleriniGetir("tunca");
	}
	

}
