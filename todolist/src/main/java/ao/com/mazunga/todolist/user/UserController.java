package ao.com.mazunga.todolist.user;

import ao.com.mazunga.todolist.automapper.IUserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("users")
class UserController {

    private final IUserRepository _userRepository;
    private final IUserMapper _userMapper;

    public UserController(IUserRepository userRepository, IUserMapper userMapper)
    {
        _userRepository = userRepository;
        _userMapper = userMapper;
    }

    @PostMapping("/")
    public  void index(@RequestBody UserDTO userDTO)
    {
        System.out.println(userDTO.getName());
    }

    @PostMapping("create")
    public ResponseEntity<UserModel> create(@RequestBody UserDTO userDTO)
    {
        UserModel userModel = _userMapper.toModel(userDTO);

        var userCreated = _userRepository.save(userModel);

        return (ResponseEntity.status(HttpStatus.CREATED).body(userCreated));
    }
}
