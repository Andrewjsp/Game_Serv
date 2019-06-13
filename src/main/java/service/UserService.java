package service;

import dao.UserDao;
import entity.User;
import exception.UserNotFoundException;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class UserService {

   @Inject
    UserDao userDao;

   public void findUser(User user) throws UserNotFoundException {
       if (userDao.findUser(user)==null){
           throw new UserNotFoundException();
       }
   }
}
