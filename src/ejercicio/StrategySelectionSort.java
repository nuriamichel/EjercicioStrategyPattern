package ejercicio;

public class StrategySelectionSort implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] estudiantes) {

        int n = estudiantes.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (estudiantes[j].getPromedio() < estudiantes[min_idx].getPromedio())
                    min_idx = j;

            Estudiante temp = estudiantes[min_idx];
            estudiantes[min_idx] = estudiantes[i];
            estudiantes[i] = temp;
        }

        for (int v = 0; v < estudiantes.length; v++) {
            System.out.println("Estudiante: ");
            System.out.println(estudiantes[v].getNombre());
            System.out.println(estudiantes[v].getPromedio());
        }
        return estudiantes;
    }


}
