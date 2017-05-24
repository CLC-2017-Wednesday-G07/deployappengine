package tiendat.service;

import java.util.List;

import tiendat.model.WebInfo;

public interface WebInfoServiceIF {
	WebInfo findById(int id);
	void saveWebpage(WebInfo webInfo);
	void updateWebpage(WebInfo webInfo);
	void deleteUserById(int id);
	List<WebInfo> findAllWebPages();
}
