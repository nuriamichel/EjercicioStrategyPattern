package ejercicio;

public class StrategyBubbleSort implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] estudiantes) {
        int n = estudiantes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (estudiantes[j].getPromedio() > estudiantes[j + 1].getPromedio()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
        for (int v = 0; v < estudiantes.length; v++) {
            System.out.println("Estudiante: ");
            System.out.println(estudiantes[v].getNombre());
            System.out.println(estudiantes[v].getPromedio());
        }
        return estudiantes;
    }


}
