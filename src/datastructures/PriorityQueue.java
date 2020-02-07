package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int compareVal = Double.compare(o.getCGPA(), this.cgpa);
        if (compareVal != 0)
            return compareVal;

        compareVal = this.name.compareTo(o.getName());
        if (compareVal != 0)
            return compareVal;

        compareVal = Integer.compare(o.getID(), this.id);
        return compareVal;
    }
}

class Priorities {

    private java.util.PriorityQueue<Student> priorityQueue = new java.util.PriorityQueue<>();

    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] data = event.split(" ");
            if (data[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2]));
                priorityQueue.add(student);
            } else {
                priorityQueue.poll();
            }
        }

        List<Student> remain = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            remain.add(priorityQueue.poll());
        }

        return remain;
    }
}

public class PriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        java.util.List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
