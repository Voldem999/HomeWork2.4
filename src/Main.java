public class Main {
    public static void main(String[] args) {
        boolean result = Input.check("VS_1993", "123_Kat", "123_Kat");
        if (result) {
            System.out.println("Логин и пароль верны");
        } else {
            System.out.println("Данные введенны не верно");
        }

    }
}