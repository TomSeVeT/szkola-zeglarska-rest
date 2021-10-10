package pl.sevet.zeglarskarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import pl.sevet.zeglarskarest.dto.UserDto;
import pl.sevet.zeglarskarest.dto.UserListDto;
import pl.sevet.zeglarskarest.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/getAllList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserListDto> getAllList(@RequestParam Optional<Boolean> isUser,
                                                  @RequestParam Optional<Boolean> isAdmin,
                                                  @RequestParam Optional<Boolean> isActive){
        return userService.getAllList(isUser,isAdmin,isActive)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }


    @PostMapping(path = "/create")
    public ResponseEntity<Integer> createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build());
    }

    @PatchMapping(path = "update")
    public ResponseEntity<Boolean> updateUser(@RequestBody UserDto userDto) {
        if( userService.updateUser(userDto) )
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    @PatchMapping(path = "/modifyRole")
    public ResponseEntity<Boolean> modifyUserRole(@RequestParam Integer userId,
                                              @RequestParam Optional<Boolean> isUser,
                                              @RequestParam Optional<Boolean> isAdmin,
                                              @RequestParam Optional<Boolean> isActive) {
        if( userService.modifyRole(userId, isUser, isAdmin, isActive) )
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Boolean> deleteUser(@RequestParam Optional<Integer> userId,
                                              @RequestParam Optional<String> email) {

        if( userService.deleteUser(userId, email) )
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

}
