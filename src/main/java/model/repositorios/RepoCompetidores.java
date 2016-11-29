package model.repositorios;

import model.entitidades.Competidor;

import java.util.ArrayList;


public class RepoCompetidores implements Repositorio<Competidor, Integer> {

    @Override
    public Competidor getById(Integer id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Competidor> getAll() throws Exception {
        return null;
    }

    @Override
    public Competidor insert(Competidor competidor) throws Exception {
        return null;
    }

    @Override
    public Competidor update(Competidor competidor) throws Exception {
        return null;
    }

    @Override
    public void delete(Integer id) throws Exception {

    }

    @Override
    public boolean idExiste(Integer id) throws Exception {
        return false;
    }

}
