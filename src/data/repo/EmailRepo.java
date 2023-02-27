package data.repo;

import data.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmailRepo implements Email{

    private final List<User>users =new ArrayList<>();
    private int count;
    @Override
    public User save(User user) {
        boolean whileUserIsNotSave = user.getId() == 0;
       if (whileUserIsNotSave){
        users.add(user);
        count++;
       return user;
       }

        return null;
    }

    @Override
    public void deleteById(int id) {
        for (User user: users) {
            if (user.getId() == id)
                users.remove(id);
            count--;
            break;
        }


    }

    @Override
    public User findEmailByName(String name) {
        for (User user:users) {
            if (Objects.equals(user.getName(), name)){
                return user;
            }

        }
        return null;
    }

    @Override
    public void deleteByName(String name) {
        for (User user: users) {
            if (Objects.equals(user.getName(), name))
                users.remove(user);
            count--;
            break;
        }


    }

    @Override
    public long count() {
        return count;
    }

    public int findById(int id) {
        for (User user: users) {
            if (user.getId() == id){
                users.remove(user);
                return id;
            }
        }

        return id;
    }

    @Override
    public User findUserByName(String name) {

        return null;
    }
}
