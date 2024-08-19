package com.example.springbootadventure.dao;

import com.example.springbootadventure.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  private List<User> userDemoList = new ArrayList<>();

  public void save(User user) {
    userDemoList.add(user);
  }

  public List<User> findAll() {
    return userDemoList;
  }
}
