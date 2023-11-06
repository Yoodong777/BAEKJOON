import java.util.*;

public class Bak_2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        int count = 0;

        for (int i = 0; i < st.length(); i++) {
            char word = st.charAt(i);

            if (word == 'c') {
                if (i < st.length() - 1) {
                    if (st.charAt(i + 1) == '=') {
                        i++;
                    } else if (st.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (word == 'd') {
                if (i < st.length() - 1) {
                    if (st.charAt(i + 1) == 'z') {
                        if (i < st.length() - 2) {
                            if (st.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (st.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (word == 'l') {
                if (i < st.length() - 1) {
                    if (st.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (word == 'n') {
                if (i < st.length() - 1) {
                    if (st.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (word == 's') {
                if (i < st.length() - 1) {
                    if (st.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (word == 'z') {
                if (i < st.length() - 1) {
                    if (st.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
