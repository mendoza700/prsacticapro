package ejercicio1;

public class Materia {

        private String nombre;
        private double nota1;
        private double nota2;
        private double nota3;

        public Materia(String nombre) {
            this.nombre = nombre;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }

        public double getNota1() {
            return nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public double getNota3() {
            return nota3;
        }

        public String getNombre() {
            return nombre;
        }

        public double calcularPromedio() {
            return (nota1 + nota2 + nota3) / 3;
        }

        @Override
        public String toString() {
            return nombre + " - Promedio: " + calcularPromedio();
        }
    }


