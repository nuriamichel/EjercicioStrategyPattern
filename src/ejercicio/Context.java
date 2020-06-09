package ejercicio;

public class Context {

    private IStrategy strategy;

    private Estudiante [] estudiantes;

    private int cantidadDeEstudiantes;

    public Context(){}

    public void execute(){
        if (cantidadDeEstudiantes <= 4) {
            this.strategy = new StrategyBubbleSort();
            System.out.println("*********************************");
            System.out.println("Ejecutando BubbleSort");
            this.strategy.execute(estudiantes);
        } else if (cantidadDeEstudiantes >4&&cantidadDeEstudiantes<=6) {
            this.strategy = new StrategyInsertionSort();
            System.out.println("*********************************");
            System.out.println("Ejecutando InsertionSort");
            this.strategy.execute(estudiantes);
        } else {
            this.strategy = new StrategySelectionSort();
            System.out.println("*********************************");
            System.out.println("Ejecutando SelectionSort");
            this.strategy.execute(estudiantes);
        }
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getCantidadDeEstudiantes() {
        return cantidadDeEstudiantes;
    }

    public void setCantidadDeEstudiantes(int cantidadDeEstudiantes) {
        this.cantidadDeEstudiantes = cantidadDeEstudiantes;
    }
}
