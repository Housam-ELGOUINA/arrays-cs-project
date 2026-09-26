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

    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for ( int i =0 ; i < students.length ; i++) {
            for ( int j = 0 ; j < students.length - i - 1) {
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




        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}

