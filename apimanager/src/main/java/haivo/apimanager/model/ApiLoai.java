package haivo.apimanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "api_loai")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiLoai {
    @Id
    private String id;
    private String tenLoaiApi;
    private String chucNang;
    private String viDuTichHop;
}
