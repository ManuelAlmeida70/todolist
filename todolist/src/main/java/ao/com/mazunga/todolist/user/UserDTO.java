package ao.com.mazunga.todolist.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO
{
    @NotBlank(message = "O nome é obrigatório")
    private String name;

    @NotBlank(message = "O username é obrigatório")
    @Size(min = 3, max = 20, message = "O username deve ter entre 3 e 20 caracteres")
    private String userName;

    @NotBlank(message = "A password é obrigatória")
    @Size(min = 8, message = "A password deve ter no mínimo 8 caracteres")
    private String passWord;
}
