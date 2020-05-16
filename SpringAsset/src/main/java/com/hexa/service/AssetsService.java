package com.hexa.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.hexa.model.Assets;  
import com.hexa.repository.AssetsRepository;  
//defining the business logic  
@Service  
public class AssetsService   
{  
@Autowired  
AssetsRepository assetsRepository;  


//getting all books record by using the method findaAll() of CrudRepository  
public List<Assets> getAllAssets()   
{  
List<Assets> assets = new ArrayList<Assets>();  
assetsRepository.findAll().forEach(assets1 -> assets.add(assets1));  
return assets;  
}  


//getting a specific record by using the method findById() of CrudRepository  
public Assets getAssetsById(int id)   
{  
return assetsRepository.findById(id).get();  
}  


//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Assets assets)   
{  
	assetsRepository.save(assets);  
}  


//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	assetsRepository.deleteById(id);  
}  


//updating a record  
public void update(Assets assets, int assetid)   
{  
	assetsRepository.save(assets);  
} 

}  
