package com.primeraPrueba.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Se declaran los métodos, no se implementan
 * Actúa como un contrato. Hay que cumplir la norma, pero se implementa(realiza) en otra clase
 */
public interface EmpleadoCRUD {

      void save(Empleado empleado);

      List<Empleado> findAll();

      void delete(Empleado empleado);

}
