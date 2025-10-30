package haivo.apimanager.controller;

import haivo.apimanager.model.ApiLoai;
import haivo.apimanager.repository.ApiLoaiRepository;
import haivo.apimanager.service.ApiLoaiService;
import haivo.apimanager.service.KafkaProducer;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/loai")
@CrossOrigin
public class ApiLoaiController {

    private final ApiLoaiService service;
    private final ApiLoaiRepository repository;
    private final KafkaProducer producer;

    public ApiLoaiController(ApiLoaiService service, ApiLoaiRepository repository,  KafkaProducer producer) {
        this.service = service;
        this.repository = repository;
        this.producer = producer;
    }

    @GetMapping
    public List<ApiLoai> getAll() {
        return repository.findAll();
    }

    @GetMapping("/send")
    public String send(@RequestParam String message) {
        producer.sendMessage(message);
        return "Message sent: " + message;
    }

    @PostMapping
    public ApiLoai create(@RequestBody ApiLoai apiLoai) {
        return service.create(apiLoai);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
