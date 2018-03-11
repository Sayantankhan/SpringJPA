package com.SpringBootELK.application.Elastic_Spring.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.SpringBootELK.application.Elastic_Spring.bean.DBSchema;

//This will be AUTO IMPLEMENTED by Spring into a Bean called URLRepository
//CRUD refers Create, Read, Update, Delete

@Repository
public interface URLRepository extends CrudRepository<DBSchema, Long>{
}
