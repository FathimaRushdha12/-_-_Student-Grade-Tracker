import java.util.ArrayList;
public class Student {
        private String name;
        private ArrayList<Integer> grades;

        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }

        public void addGrade(int grade) {
            grades.add(grade);
        }
        public String getName() {
            return name;
        }
        public double getAverageGrade() {
            if (grades.isEmpty()) return 0;
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }

        public int getHighestGrade() {
            if (grades.isEmpty()) return 0;
            int max = grades.get(0);
            for (int grade : grades) {
                if (grade > max) {
                    max = grade;
                }
            }
            return max;
        }
   public int getLowestGrade(){
       if(grades.isEmpty()) return 0;
       int min=grades.get(0);
       for(int grade:grades){
           if (grade<min){
               min=grade;
           }
       }
       return min;
   }

        }

