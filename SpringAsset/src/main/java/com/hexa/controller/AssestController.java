package com.hexa.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.hexa.model.Assets;  
import com.hexa.service.AssetsService;  
//mark class as Controller  
@CrossOrigin(origins = "http://localhost:4200")
@RestController  
public class AssestController   
{  
//autowire the Asset class  
@Autowired  
AssetsService assetsService;  

//creating a get mapping that retrieves all the assets detail from the database   
@GetMapping("/asset")  
private List<Assets> getAllAssets()   
{  
return assetsService.getAllAssets();  
}  

//creating a get mapping that retrieves the detail of a specific asset  
@GetMapping("/asset/{assetid}")  
private Assets getAssets(@PathVariable("assetid") int assetid)   
{  
return assetsService.getAssetsById(assetid);  
}  

//creating a delete mapping that deletes a specified asset  
@DeleteMapping("/asset/{assetid}")  
private void deleteAssets(@PathVariable("assetid") int assetid)   
{  
assetsService.delete(assetid);  
} 

//creating post mapping that post the asset detail in the database  
@PostMapping("/assets")  
private int saveAssets(@RequestBody Assets assets)   
{  
assetsService.saveOrUpdate(assets);  
return assets.getAssetid();  
} 

//creating put mapping that updates the book detail   
@PutMapping("/assets")  
private Assets update(@RequestBody Assets assets)   
{  
assetsService.saveOrUpdate(assets);  
return assets;  
}  

}  