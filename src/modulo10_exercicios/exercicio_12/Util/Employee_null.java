package modulo10_exercicios.exercicio_12.Util;

import modulo10_exercicios.exercicio_12.entities.Employee;

import java.util.List;

public class Employee_null {

    public static Integer hasId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
