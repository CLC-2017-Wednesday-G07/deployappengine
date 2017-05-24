package tiendat.service;

import java.util.List;

import tiendat.model.WebDocument;

public interface WebDocumentServiceIF {
	  WebDocument findById(int id);
	  
	    List<WebDocument> findAll();
	     
	    List<WebDocument> findAllByUserId(int id);
	     
	    void saveDocument(WebDocument document);
	     
	    void deleteById(int id);
}
