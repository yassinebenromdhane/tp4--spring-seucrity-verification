package com.yassine.users.restControllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yassine.users.entities.User;
import com.yassine.users.repos.UserRepository;
@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {
@Autowired
UserRepository userRep;
@RequestMapping(path = "all",method = RequestMethod.GET)
public List<User> getAllUsers() {
return userRep.findAll();
}
}