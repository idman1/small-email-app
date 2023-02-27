package data.repo;

import data.models.User;

public interface Email {

    User save(User user);
    void deleteById( int id);
    User findEmailByName(String name);
    void deleteByName(String name);
    long count();
    int findById(int id);
    User findUserByName(String name);

}
