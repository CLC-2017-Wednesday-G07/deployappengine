package tiendat.dao;
import java.util.List;

import tiendat.model.WebInfo;
public interface WebInfoDAOIF {
	WebInfo findByid(int id);
	List<WebInfo> findAllWebpages();
	void save(WebInfo webInfo);
	void deleteById(int id);
}
