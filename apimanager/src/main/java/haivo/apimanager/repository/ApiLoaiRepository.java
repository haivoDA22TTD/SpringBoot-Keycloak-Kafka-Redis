package haivo.apimanager.repository;

import haivo.apimanager.model.ApiLoai;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApiLoaiRepository extends MongoRepository<ApiLoai,String> {

}
