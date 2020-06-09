package ejercicio;

public class StrategyInsertionSort implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] estudiantes) {


        int n = estudiantes.length;
        for (int i = 1; i < n; i++) {

            int j = i;

            while (j > 0 && estudiantes[j].getPromedio() < estudiantes[j - 1].getPromedio()) {
                Estudiante temp = estudiantes[j];
                estudiantes[j] = estudiantes[j - 1];
                estudiantes[j - 1] = temp;
                j--;

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
