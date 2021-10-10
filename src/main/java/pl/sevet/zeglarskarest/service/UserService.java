package pl.sevet.zeglarskarest.service;

import org.springframework.http.ResponseEntity;
import pl.sevet.zeglarskarest.dto.UserDto;
import pl.sevet.zeglarskarest.dto.UserListDto;

import java.util.Optional;
import java.util.stream.DoubleStream;

public interface UserService {

    Optional<UserListDto> getAllList(Optional<Boolean> isUser, Optional<Boolean> isAdmin, Optional<Boolean> isActive);

    Optional<Integer> createUser(UserDto userDto);

    Boolean updateUser(UserDto userDto);

    Boolean modifyRole(Integer userId, Optional<Boolean> isUser, Optional<Boolean> isAdmin, Optional<Boolean> isActive);

    Boolean deleteUser(Optional<Integer> userId, Optional<String> email);
}
