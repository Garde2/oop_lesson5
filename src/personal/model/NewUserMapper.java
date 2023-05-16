package personal.model;

public class NewUserMapper extends UserMapper{

    public String map(User user, String split) {

        String text = String.join(split, user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        return text;
    }


    public User map(String line, String split) {

        String[] lines = line.split(split);
        
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}