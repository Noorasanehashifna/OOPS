import java.util.*;

interface Sports {
    void sports_getData(Scanner sc);
    void sports_dispData();
}

class Student {
    String name;
    int roll_no;
    int score;

    Student(String name, int roll, int score) {
        this.name = name;
        this.roll_no = roll;
        this.score = score;
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name of Student : " + name);
        System.out.println("Roll No         : " + roll_no);
        System.out.println("Academic score  : " + score);
    }
}

class Result extends Student implements Sports {
    int sportsScore;

    Result(String name, int roll, int score) {
        super(name, roll, score);
    }

    public void sports_getData(Scanner sc) {
        System.out.print("Enter the score obtained in sports: ");
        sportsScore = sc.nextInt();
    }

    public void sports_dispData() {
        System.out.println("Sports score    : " + sportsScore);
        System.out.println("Total score     : " + (score + sportsScore));
    }
}

class Co3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the roll no: ");
        int roll = sc.nextInt();

        System.out.print("Enter the academic score: ");
        int mark = sc.nextInt();

        Result re = new Result(name, roll, mark);

        re.sports_getData(sc);
        re.display();
        re.sports_dispData();

        sc.close();
    }
}
