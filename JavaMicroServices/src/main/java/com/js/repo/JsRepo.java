package com.js.repo;

//import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.js.entity.JEntity;

@Repository(value="jsRepo")
@Scope(value="singleton")
public interface JsRepo extends JpaRepository<JEntity,Integer> {   
    
    //List<JEntity> findByName(String pname);
    //List<JEntity> findByPPrice(double pprice);
}
