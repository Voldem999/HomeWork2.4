public class Main {
    public static void main(String[] args) {
        boolean result = Input.check("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Логин и пароль верны");
        } else {
            System.out.println("Данные введенны не верно");
        }

    }
}