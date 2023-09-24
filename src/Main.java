import DataBase.Database;
import Model.User;
import MyGender.Gender;
import Service.UserInterface;
import ServiceImpl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        User user=new User("jennieRuByJane", 123, 22, Gender.FEMALE, "😇");
        User user1=new User("LalaLisa", 456, 23, Gender.FEMALE, "😇");
        User user2=new User("Roses are Rosie", 789, 22, Gender.MALE, "😇");
        List<User> users=List.of(user, user1);

        Database database=new Database(users);
        UserServiceImpl userService=new UserServiceImpl(database);


        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1. Add new user");
            System.out.println("2. Get all user");
            System.out.println("3. Update user by id");
            System.out.println("4. Filter user by age");
            System.out.println("5. Search by name");
            System.out.println("6. Sort by age");
            System.out.println("7. Exit");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(userService.addNewUser(user2));
                    break;
                case 2:
                    userService.getAllUser();
                    break;
                case 3:
                    System.out.println(userService.userUpdateById(1, "NewName", 90,"😇" ));
                    break;
                case 4:
                    userService.filter();
                    break;
                case 5:
                    System.out.println(userService.searchByName("NewName"));
                    break;
                case 6:
                    while (true){
                        System.out.println("Put 1 to ascending or 2 to descending");
                        int num=scanner.nextInt();
                        System.out.println(userService.sortByAge(num));
                        if(num==2){
                            break;
                        }
                    }
                case 7:
                    System.exit(0);
            }
        }
    }
}