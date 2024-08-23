import java.util.HashSet;
import java.util.Iterator;

public class StudentRegister {
    private HashSet<String> students;

    public StudentRegister() {
        students = new HashSet<>();
    }

    public void addStudent(String name) {
        // Implementar
        students.add(name);
    }

    public void removeStudent(String name) {
        // Implementar
        students.remove(name);
    }

    public boolean isStudentRegistered(String name) {
        // Implementar
        return students.contains(name);
    }

    public void printStudents() {
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }
    }
    

    public void clearRegister() {
        // Implementar
        students.clear();
    }

    public static void main(String[] args) {
        StudentRegister register = new StudentRegister();

        // Pruebas
        register.addStudent("Ana");
        register.addStudent("Luis");
        register.addStudent("Carlos");
        register.addStudent("Ana"); // Duplicado

        System.out.println("Estudiantes registrados:");
        register.printStudents();

        System.out.println("\n¿Está registrado Luis?");
        System.out.println(register.isStudentRegistered("Luis"));

        System.out.println("\nEliminar a Carlos del registro.");
        register.removeStudent("Carlos");

        System.out.println("\nEstudiantes registrados después de eliminar:");
        register.printStudents();

        System.out.println("\nVaciar el registro.");
        register.clearRegister();

        System.out.println("\nEstudiantes registrados después de vaciar:");
        register.printStudents();
    }
}
