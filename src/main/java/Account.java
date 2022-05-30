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
       return name.length() >= 3 && name.length() <= 19 && !name.startsWith(" ") && !name.endsWith(" ") && countSpaces() == 1;
    }
}