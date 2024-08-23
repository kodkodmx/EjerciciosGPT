import java.util.ArrayList;
import java.util.Iterator;

public class TaskManager {
    private ArrayList<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        // Implementar
        tasks.add(task);
    }

    public String getTask(int index) {
        // Implementar
        return tasks.get(index);
    }

    public void removeTask(int index) {
        // Implementar
        tasks.remove(index);
    }

    public void printTasks() {
        // Implementar
        Iterator<String> iterator = tasks.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

    }

    public int findTask(String task) {
        // Implementar
        return tasks.indexOf(task);
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Pruebas
        taskManager.addTask("Aprender Java");
        taskManager.addTask("Hacer ejercicio");
        taskManager.addTask("Leer un libro");

        System.out.println("Todas las tareas:");
        taskManager.printTasks();

        System.out.println("\nBuscar tarea 'Hacer ejercicio':");
        System.out.println("Índice: " + taskManager.findTask("Hacer ejercicio"));

        System.out.println("\nObtener tarea en índice 1:");
        System.out.println(taskManager.getTask(1));

        System.out.println("\nEliminar tarea en índice 0:");
        taskManager.removeTask(0);

        System.out.println("\nTodas las tareas después de eliminar:");
        taskManager.printTasks();
    }
}
