public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }
    char space = ' ';
    int count = 0;

    public int countSpaces() {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == space) {
                count++;
            }
        }
        return count;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19 && name.contains(" ") && name.indexOf(" ") != 0 && name.indexOf(" ") != name.length() - 1 && countSpaces() <= 1) {
            return true;
        } else {
            return false;
        }
    }
}