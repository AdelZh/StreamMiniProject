package Model;

import MyGender.Gender;

public class User {

    public static int id;
    private int instanceId;

    private String nickName;
    private int password;
    private int age;
    private Gender gender;
    private String photo;

    public User(String nickName, int password, int age, Gender gender, String photo) {
        this.instanceId=id++;
        this.nickName = nickName;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.photo = photo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }




    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getInstanceId() {
        return instanceId;
    }


    @Override
    public String toString() {
        return "User{" +
                "instanceId=" + instanceId +
                ", nickName='" + nickName + '\'' +
                ", password=" + password +
                ", age=" + age +
                ", gender=" + gender +
                ", photo='" + "😇" + '\'' +
                '}';
    }
}
