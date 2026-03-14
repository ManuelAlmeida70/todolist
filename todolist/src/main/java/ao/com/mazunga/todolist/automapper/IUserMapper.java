package ao.com.mazunga.todolist.automapper;

import ao.com.mazunga.todolist.user.UserDTO;
import ao.com.mazunga.todolist.user.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    UserModel toModel(UserDTO userDTO);

    UserDTO toDTO(UserModel userModel);

}
