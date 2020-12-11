package check;

import constants.Constants;

public class Check {

    private static String firstName = "遼伊";
    private static String lastName = "郭";

    public static void main(String[] args) {
        printName();
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,
                Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,
                Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
    }

    private static void printName() {
        System.out.println("printNameメソッド　→　" + lastName + firstName);
    }

    // インスタンスを用いた場合
    // private String firstName = "Ryoi";
    // private String lastName = "Kaku";
    //
    // public static void main(String[] args) {
    // Check check = new Check();
    // check.printName();
    // Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,
    // Constants.CHECK_CLASS_HOGE);
    // pet.introduce();
    // RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,
    // Constants.CHECK_CLASS_LUKE);
    // robotPet.introduce();
    // }
    //
    // private void printName() {
    // System.out.println("printNameメソッド → " + lastName + firstName);
    // }

}
