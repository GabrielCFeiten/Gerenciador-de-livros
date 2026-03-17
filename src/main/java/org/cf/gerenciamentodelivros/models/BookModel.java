package org.cf.gerenciamentodelivros.models;

import jakarta.persistence.*;

@Entity(name = "Livro")
@Table(name = "tb_livro")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Titulo", nullable = false)
    private String tituloLivro;
    private  String autor;
    @Column(name = "Data_de_lancamento")
    private Integer anopublicacao;

}
