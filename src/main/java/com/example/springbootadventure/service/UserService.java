package com.example.springbootadventure.service;

import com.example.springbootadventure.entity.User;
import java.util.List;

public interface UserService {
  public void addUser(User user);
  public List<User> list();
}
