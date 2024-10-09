package th.co.prior.priortraintestsonar.controller;

import org.springframework.web.bind.annotation.*;
import th.co.prior.priortraintestsonar.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAllUsers() {
        return users;  // Return a list of users
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        System.out.println(user);
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.removeIf(user -> user.getId().equals(id));
        return "User deleted";
    }@DeleteMapping("D/{id}")
    public String deleteUserD(@PathVariable Long id) {
        users.removeIf(user -> user.getId().equals(id));
        return "User deleted";
    }
}