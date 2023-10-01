package com.nag.SpringProject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ServiceRepo  extends CrudRepository<Data, Integer>{

}
