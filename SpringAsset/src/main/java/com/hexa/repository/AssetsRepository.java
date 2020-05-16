package com.hexa.repository;

import org.springframework.data.repository.CrudRepository;  
import com.hexa.model.Assets;  
//repository that extends CrudRepository  

public interface AssetsRepository extends CrudRepository<Assets, Integer>
{

}
