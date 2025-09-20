package PrototypeAndRegistry;
import  java.util.*;
public class UserRegistry implements  UserPrototypeRegistery{
    HashMap<UserType,User> userRegistry;
    public UserRegistry(){
        userRegistry = new HashMap<>();
    }

    public void addPrototype(User user){
        userRegistry.put(user.getType(),user);
    }

    public User getPrototype(UserType type){
        return userRegistry.get(type);
    }

    public User clone(UserType type){
        return userRegistry.get(type).cloneObject();
    }
}
