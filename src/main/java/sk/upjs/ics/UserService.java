package sk.upjs.ics;

import java.util.List;

public class UserService {
    List<User> users;

    public UserService(List<User> users){
        this.users = users;
    }

    GenderRatio calculateGenderRatio(){
        int noOfUsers = users.size();
        if (users == null || noOfUsers == 0){
            return new GenderRatio(0, 0, 0, 0);
        }
        int boys = 0, girls = 0, other = 0, unknown = 0;
        for(User u : users){
            switch (u.gender()){
                case MALE -> boys++;
                case FEMALE -> girls ++;
                case OTHER -> other ++;
                default -> unknown ++;
            }
        }
        return new GenderRatio((double)boys/noOfUsers, (double) girls/noOfUsers, (double) other/noOfUsers, unknown/noOfUsers );
    }
}
