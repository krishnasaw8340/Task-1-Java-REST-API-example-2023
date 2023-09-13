package com.krishna.app.kaiburr.Repo;
import com.krishna.app.kaiburr.Model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface dataRepo extends MongoRepository<Data, Long> {
    List<Data> findAllByNameContaining(String name);
}
