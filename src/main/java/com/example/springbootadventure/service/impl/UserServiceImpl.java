package com.example.springbootadventure.service.impl;

import com.example.springbootadventure.dao.UserRepository;
import com.example.springbootadventure.entity.User;
import com.example.springbootadventure.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userDao;

  @Override
  public void addUser(User user) {
    userDao.save(user);
  }

  @Override
  public List<User> list() {
    return userDao.findAll();
  }

}
