package academy.devdojo.springboot2_essentials.Requests;

import lombok.Data;

@Data
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
