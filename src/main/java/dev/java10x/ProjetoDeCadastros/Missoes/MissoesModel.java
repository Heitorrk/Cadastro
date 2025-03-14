package dev.java10x.ProjetoDeCadastros.Missoes;
import java.util.List;

import dev.java10x.ProjetoDeCadastros.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "td_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany - uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
