package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws CustomException {
        Student o;

        try {
            o = Student.getValueOf(studentID);
            if (o == null) throw new IllegalArgumentException();
        } catch (IllegalArgumentException ex) {
            throw new CustomException("Could not find student with ID " + studentID, ex);
        }
        return o;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            try {
                Student student = manager.find(IDs[i]);
                System.out.println("Student name " + student.getName());
            } catch (CustomException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}