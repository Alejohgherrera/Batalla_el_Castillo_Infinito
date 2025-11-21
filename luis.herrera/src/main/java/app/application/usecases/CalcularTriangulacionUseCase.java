/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.usecases;

import app.domain.Pilar;
import app.domain.ports.PilarPort;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ad
 */
@Service
public class CalcularTriangulacionUseCase {

    private final PilarPort pilarPort;

    public CalcularTriangulacionUseCase(PilarPort pilarPort) {
        this.pilarPort = pilarPort;
    }

    public TriangulacionResultado ejecutar() {

        List<Pilar> pilares = pilarPort.obtenerTodos();

        if (pilares.isEmpty()) {
            throw new RuntimeException("No hay datos suficientes para triangulación.");
        }

        double promX = pilares.stream().mapToDouble(Pilar::getPosX).average().orElse(0);
        double promY = pilares.stream().mapToDouble(Pilar::getPosY).average().orElse(0);

        TriangulacionResultado resultado = new TriangulacionResultado();
        resultado.setX(promX);
        resultado.setY(promY);
        resultado.setNivelConfianza(0.78);
        resultado.setDescripcion("Probabilidad alta de presencia demoníaca en el área estimada.");

        return resultado;
    }

   
    public static class TriangulacionResultado {
        private double x;
        private double y;
        private double nivelConfianza;
        private String descripcion;

       
        public double getX() { return x; }
        public double getY() { return y; }
        public double getNivelConfianza() { return nivelConfianza; }
        public String getDescripcion() { return descripcion; }

        public void setX(double x) { this.x = x; }
        public void setY(double y) { this.y = y; }
        public void setNivelConfianza(double nivelConfianza) { this.nivelConfianza = nivelConfianza; }
        public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    }
}
