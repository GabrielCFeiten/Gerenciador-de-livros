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
    private Integer anoPublicacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anopublicacao) {
        this.anoPublicacao = anopublicacao;
    }
}
