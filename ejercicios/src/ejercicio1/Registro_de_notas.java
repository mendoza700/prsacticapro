package ejercicio1;

import java.io.OptionalDataException;
import java.util.HashMap;
import java.util.Map;

public class Registro_de_notas {

        private Map<persona, Map<Materia, Double>> registro;

        public Registro_de_notas() {
            registro = new HashMap<>();
        }

        public void registrarNota(persona persona, Materia materia, double nota) {
            Map<Materia, Double> notasMateria = registro.getOrDefault(persona, new HashMap<>());
            notasMateria.put(materia, nota);
            registro.put(persona, notasMateria);
        }

        public void mostrarPersonas() {
            for (persona persona : registro.keySet()) {
                System.out.println(persona);
            }
        }

        public void mostrarNotasPorPersona(persona persona) {
            Map<Materia, Double> notasMateria = registro.get(persona);
            if (notasMateria != null) {
                for (Materia materia : notasMateria.keySet()) {
                    System.out.println(persona + " - " + materia + ": " + notasMateria.get(materia));
                }
            }
        }
    }


