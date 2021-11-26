package Dominio;

import java.time.LocalDate;

//TODO IMPLEMENTAR REGRA DE NEGOCIO
public class Administrador extends Pessoa{

    public Administrador(Long id, String nome, String login, String senha, LocalDate dataNascimento) {
        super(id, nome, login, senha, dataNascimento);
    }


}
