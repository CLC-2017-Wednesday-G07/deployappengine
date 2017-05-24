package tiendat.dao;

import java.util.List;

import tiendat.model.WebDocument;

public interface WebDocumentDaoIF {
	 
    List<WebDocument> findAll();
     
    WebDocument findById(int id);
     
    void save(WebDocument document);
     
    List<WebDocument> findAllByUserId(int userId);
     
    void deleteById(int id);
}