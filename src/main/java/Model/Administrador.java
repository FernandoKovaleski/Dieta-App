package Model;

import java.time.LocalDate;

public class Administrador extends Pessoa{
    public Administrador(Long id, String nome, String login, LocalDate dataNascimento) {
        super(id, nome, login, dataNascimento);
    }
}
