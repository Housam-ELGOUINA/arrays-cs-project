package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int[] updatedCourses =  {} ;

        for ( int i = 0  ; i <= registeredCourses.length; i++ ) {
            updatedCourses[i] = registeredCourses[i];

        }

        updatedCourses[7] = 3100 ;


        for ( int x  : updatedCourses) {
            System.out.println(x + " ");
        }

        for ( int x  : updatedCourses) {
            if (x  == 1010) {
                System.out.println("course 1010 does exist in updatedCourse");
                break ;
            }
        }



    }
}
