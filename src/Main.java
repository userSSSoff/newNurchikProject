import company.model.Gender;
import company.model.User;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Nurmukhammed",16, Gender.MALE);
        User userOne = new User(2,"Aibiyke",10,Gender.FEMAlE);
        User userTwo = new User(3,"Manas",55,Gender.MALE);

        UserServiceImpl userService = new UserServiceImpl();
        try {
            userService.userAdd(user);
        }catch (RuntimeException e ){
            System.out.println(e.getMessage());
        }
        userService.userAdd(userOne);
        userService.userAdd(userTwo);
        userService.idByDelete(2);
        userService.printAllUsers();
    }
}