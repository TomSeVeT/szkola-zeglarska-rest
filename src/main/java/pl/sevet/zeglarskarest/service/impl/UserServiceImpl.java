package pl.sevet.zeglarskarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sevet.zeglarskarest.dto.UserDto;
import pl.sevet.zeglarskarest.dto.UserListDto;
import pl.sevet.zeglarskarest.repository.UserRepository;
import pl.sevet.zeglarskarest.repository.UserRoleRepository;
import pl.sevet.zeglarskarest.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserListDto> getAllList(Optional<Boolean> isUser, Optional<Boolean> isAdmin, Optional<Boolean> isActive) {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> createUser(UserDto userDto) {
        return Optional.empty();
    }

    @Override
    public Boolean updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public Boolean modifyRole(Integer userId, Optional<Boolean> isUser, Optional<Boolean> isAdmin, Optional<Boolean> isActive) {
        return null;
    }

    @Override
    public Boolean deleteUser(Optional<Integer> userId, Optional<String> email) {
        return null;
    }
}

