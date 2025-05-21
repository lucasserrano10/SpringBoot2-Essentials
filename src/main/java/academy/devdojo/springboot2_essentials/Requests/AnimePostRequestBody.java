package academy.devdojo.springboot2_essentials.Requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The name cannot be empty")
    @NotNull(message = "The name cannot be null")
    private String name;
}
