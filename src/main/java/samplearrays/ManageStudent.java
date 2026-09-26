package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (int i =0  ; i < students.length  ; i++) {
            if (students[i].getAge() > oldest.getAge()) {
                oldest =  students[i] ;
            }

        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0 ;
        for( int i = 0 ; i < students.length  ; i++) {
            if ( students[i].isAdult()) {
                count ++;
            }
        }
        return count ;

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int count =  0 ;
        for ( int i =0 ; i < students.length ; i++){
            count +=  students[i].getGrade() ;
        }

        double avg  = (double)  count / students.length ;
        return avg ;

    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for ( int i = 0 ; i < students.length ; i++) {
            if(students[i].getName() == name) {
                return students[i] ;
            }
        }

        return null ;

    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for ( int i =0 ; i < students.length ; i++) {
            for ( int j = 0 ; j < students.length - i - 1 ; j++) {
                if ( students[j].getGrade() < students[j+1].getGrade() ) {
                    Student temp  =  students[j] ;
                    students[j] =  students[j+1] ;
                    students[j+1] =  temp ;
                }
            }
        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        System.out.println("High Achievers: ");
        for ( int i =0 ; i < students.length ; i ++) {
            if (students[i].getGrade()>= 15) {
                System.out.println(students[i].getName());
            }
        }

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for ( int i = 0 ; i < students.length ; i++) {
            if ( students[i].getId() == id ) {
                students[i].setGrade(newGrade);
                return true ;
            }
        }

        return false ;

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for ( int i =0 ; i < students.length ; i++ ) {
            for ( int j =0 ; j < students.length - i -1  ; j++ ) {
                if ( students[j].getName() == students[j+1].getName() ) {
                    return true;
                }
            }

        }

        return false ;

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents =  new Student[students.length +1] ;
        for ( int i =0 ; i < students.length ; i++ ) {
            newStudents[i] = students[i] ;
        }
        newStudents[newStudents.length - 1]  = newStudent ;

        return newStudents ;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students

        Student[] arr  =  new Student[5] ;

        arr[0] = new Student(1, "Housam", 19 , 18);
        arr[1] = new Student(2, "Ilyas", 18 , 15);
        arr[2] = new Student(3, "Imane", 20 , 17);
        arr[3] = new Student(4, "Adam", 21 , 16);
        arr[4] = new Student(5, "Hayat", 17 , 14);




        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest

        Student oldest = findOldest(arr) ;
        System.out.println("The oldest student is  : "  +oldest.getName()) ;


        // 3) Count adults

        int count  = countAdults(arr ) ;

        System.out.println("the number of adult students is  : " + count ) ;




        // 4) Average grade

        double average  = averageGrade(arr) ;

        System.out.println("The average of students graddes is   :" + average) ;


        // 5) Find by name

        Student found = findStudentByName(arr , "Housam") ;
        System.out.println("the student  : "+ found.getName() + " is found in the array") ;






        // 6) Sort by grade desc
        sortByGradeDesc(arr);
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15

        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        boolean updated = updateGrade(arr , 4 , 17) ;
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        if(hasDuplicateNames(arr)) {
            System.out.println("Duplicates found!!") ;
        } else {
            System.out.println("Duplicates not found!!!");
        }



        // 10) Append new student
        Student newStudent  =  new Student(6, "Omar", 21 , 17);

        appendStudent(arr , newStudent) ;

        System.out.println("Student : "+ newStudent.getName() + " is appended to the students array!");

    }
}

