public class Input {

    private static final String VALID_CHARACTERS = "0123456789_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public static boolean check(String login, String password, String confirmPassword) {
        try {
            validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


    private static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше или равна 20 символам");
        }
        if (password == null || password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов");
        }
        if (confirmPassword == null || confirmPassword.length() >= 20) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
        validateCharacters(true, login);
        validateCharacters(false, password);

    }

    private static void validateCharacters(boolean isLogin, String s) throws WrongLoginException, WrongPasswordException {
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                if (isLogin) {
                    throw new WrongLoginException("В логине не верные данные " +s.charAt(i));
                }else {
                    throw new WrongPasswordException("В пароле не верные данные " + s.charAt(i));}

            }
            
        }
    }
}
