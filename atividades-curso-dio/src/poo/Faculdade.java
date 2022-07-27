package poo;

import java.util.List;
// faculdade está associada a Disciplina
class Faculdade {
    String instituteName;
    private List<Disciplina> departments;

    Faculdade(String instituteName, List<Disciplina> departments)
    {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    // count total students of all departments
    // in a given institute

}
