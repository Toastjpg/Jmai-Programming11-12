public class Main {
    public static void main(String[] args) {
        int randomId = (int)(Math.random() * 10);

        //Create school object
        School windermere = new School("Windermere Secondary", true, 1960);

        //Add 3 teacher to teacher list
        windermere.teachers.add(new Teacher("Jason", "Derulo", "Science"));
        windermere.teachers.add(new Teacher("Bob", "Smith", "Science"));
        windermere.teachers.add(new Teacher("Sam", "Appleseed", "Science"));

        //Add 10 students to student list
        windermere.students.add(new Student("Johnny", "Mai", 12, randomId));
        windermere.students.add(new Student("Jason", "Bourne", 12, randomId));
        windermere.students.add(new Student("Mike", "Griffiths", 12, randomId));
        windermere.students.add(new Student("Bob", "'s Burgers'", 12, randomId));
        windermere.students.add(new Student("Aaron", "aaaaaaaaaa", 12, randomId));
        windermere.students.add(new Student("Bruh", "Moment", 12, randomId));
        windermere.students.add(new Student("What", "Yes", 12, randomId));
        windermere.students.add(new Student("Verb", "Corpuz", 12, randomId));
        windermere.students.add(new Student("Noun", "Hello", 12, randomId));
        windermere.students.add(new Student("Pizza", "Pie", 12, randomId));

        //Print teachers and students list
        System.out.println(windermere.allTeachers());
        System.out.println(windermere.allStudents());

        //Remove 2 students
        windermere.students.remove(4);
        windermere.students.remove(8);

        //Remove 1 teacher
        windermere.teachers.remove(2);

        //Display both lists
        System.out.println(windermere.allTeachers());
        System.out.println(windermere.allStudents());
    }
}
