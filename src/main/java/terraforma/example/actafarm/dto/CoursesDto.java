package terraforma.example.actafarm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesDto {
    private Long id;
    private String name;
    private String teacher_name;
    private String description;
}
