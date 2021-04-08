package com.org.water.repository;

import com.org.water.model.WaterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface WaterRepo extends MongoRepository<WaterModel,String>
{
}
