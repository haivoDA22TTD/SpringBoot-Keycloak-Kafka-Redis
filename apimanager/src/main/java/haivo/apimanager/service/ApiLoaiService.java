package haivo.apimanager.service;

import haivo.apimanager.model.ApiLoai;
import haivo.apimanager.repository.ApiLoaiRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import java.util.List;

@Service
public class ApiLoaiService {
    private final ApiLoaiRepository repo;
    private final KafkaTemplate<String, String> kafka;
    private final RedisTemplate<String, Object> redis;

    public ApiLoaiService(ApiLoaiRepository repo, KafkaTemplate<String, String> kafka, RedisTemplate<String, Object> redis) {
        this.repo = repo;
        this.kafka = kafka;
        this.redis = redis;
    }

    public List<ApiLoai> getAll() {
        List<ApiLoai> cached = (List<ApiLoai>) redis.opsForValue().get("api_loai_all");
        if (cached != null) return cached;
        List<ApiLoai> list = repo.findAll();
        redis.opsForValue().set("api_loai_all", list);
        return list;
    }

    public ApiLoai create(ApiLoai api) {
        ApiLoai saved = repo.save(api);
        kafka.send("api-events", "Tạo mới API: " + api.getTenLoaiApi());
        redis.delete("api_loai_all");
        return saved;
    }

    public void delete(String id) {
        repo.deleteById(id);
        kafka.send("api-events", "Xóa API có id: " + id);
        redis.delete("api_loai_all");
    }
}
