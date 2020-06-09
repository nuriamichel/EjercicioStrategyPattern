package ejercicio;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        Estudiante[] estudiantes1 = new Estudiante[3];
        estudiantes1[0] = new Estudiante("pedro1",34);
        estudiantes1[1] = new Estudiante("pedro2",23);
        estudiantes1[2] = new Estudiante("pedro3",100);

        Estudiante[] estudiantes2 = new Estudiante[6];
        estudiantes2[0] = new Estudiante("pedro1",51);
        estudiantes2[1] = new Estudiante("pedro2",21);
        estudiantes2[2] = new Estudiante("pedro3",78);
        estudiantes2[3] = new Estudiante("pedro4",1);
        estudiantes2[4] = new Estudiante("pedro5",88);
        estudiantes2[5] = new Estudiante("pedro6",87);


        Estudiante[] estudiantes3 = new Estudiante[7];
        estudiantes3[0] = new Estudiante("juan1",12);
        estudiantes3[1] = new Estudiante("juan2",76);
        estudiantes3[2] = new Estudiante("juan3",99);
        estudiantes3[3] = new Estudiante("juan4",98);
        estudiantes3[4] = new Estudiante("juan5",100);
        estudiantes3[5] = new Estudiante("juan6",66);
        estudiantes3[6] = new Estudiante("juan7",92);


        context.setCantidadDeEstudiantes(estudiantes1.length);
        context.setEstudiantes(estudiantes1);
        context.execute();

        context.setCantidadDeEstudiantes(estudiantes2.length);
        context.setEstudiantes(estudiantes2);
        context.execute();

        context.setCantidadDeEstudiantes(estudiantes3.length);
        context.setEstudiantes(estudiantes3);
        context.execute();
    }

}
