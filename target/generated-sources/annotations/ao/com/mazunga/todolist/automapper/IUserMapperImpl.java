package ao.com.mazunga.todolist.automapper;

import ao.com.mazunga.todolist.user.UserDTO;
import ao.com.mazunga.todolist.user.UserModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-14T12:40:10+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class IUserMapperImpl implements IUserMapper {

    @Override
    public UserModel toModel(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setName( userDTO.getName() );
        userModel.setUserName( userDTO.getUserName() );
        userModel.setPassWord( userDTO.getPassWord() );

        return userModel;
    }

    @Override
    public UserDTO toDTO(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( userModel.getName() );
        userDTO.setUserName( userModel.getUserName() );
        userDTO.setPassWord( userModel.getPassWord() );

        return userDTO;
    }
}
