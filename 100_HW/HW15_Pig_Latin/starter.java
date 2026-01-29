import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a phrase to translate into Pig Latin");
        String a = sc.nextLine();
        String finals = "";
        int e = a.length();
        int si = 0;
        while(e > 0) {
            si = a.lastIndexOf(" ", e - 1);
            String w = "";
            if(si == -1) {
                w = a.substring(0, e);
            } else {
                w = a.substring(si + 1, e);
            }
            String f = "";
            String s = "";
            String r = "";
            if(w.length() >= 1) {
                f = w.substring(0, 1);
            }
            if(w.length() >= 2) {
                s = w.substring(1, 2);
            }

            String vs = "aeiouAEIOU";
            int fv = 0;
            int sv = 0;

            if(vs.indexOf(f) != -1) {
                fv = 1;
            }
            if(vs.indexOf(s) != -1) {
                sv = 1;
            }

            String t = "";

            if(fv == 1) {
                t = w + "way";
            }
            else if(fv == 0 && sv == 1) {
                r = w.substring(1);
                t = r + f + "ay";
            }
            else {
                if(w.length() >= 2) {
                    r = w.substring(2);
                    t = r + f + s + "ay";
                } else {
                    t = f + "ay";
                }
            }

            finals = t + " " + finals;

            e = si;
        }

        System.out.println("Pig Latin: " + finals);
    }
}
