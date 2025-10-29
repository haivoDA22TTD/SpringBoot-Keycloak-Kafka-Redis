package haivo.apimanager.controller;

import haivo.apimanager.model.ApiLoai;
import haivo.apimanager.service.ApiLoaiService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/loai")
@CrossOrigin
public class ApiLoaiController {

    private final ApiLoaiService service;

    public ApiLoaiController(ApiLoaiService service) {
        this.service = service;
    }

    @GetMapping
    public List<ApiLoai> getAll() {
        return service.getAll();
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
