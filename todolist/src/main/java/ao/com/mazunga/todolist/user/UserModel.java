package ao.com.mazunga.todolist.user;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Table(name = "users")
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String userName;
    private String passWord;
}
