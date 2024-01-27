package br.org.com.recode.model;

import java.time.LocalDate;  

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Inscreva")
public class Inscreva {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
    private String nome;
	

	@Column(nullable = false, length = 50)
    private String sobrenome;
	
	@Column(nullable = false, length = 20, unique = true)
    private String cpf;
	
	
	@Column(nullable = true, length = 9 )
    private String cep;
	
	@Column(nullable = false, length = 50, unique = true)
    private String email;
	
	@Column(nullable = true, length = 20, unique = true)
    private String telefone;
	
	@Column(nullable = true, name = "dataContato")
    @DateTimeFormat(iso = ISO.DATE)
    private String dataContato;
	
	@Column(nullable = true, name = "dataResposta")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataResposta;
	
	public Inscreva() {}

	public Inscreva(Long id, String nome, String sobrenome, String email, String cpf,String cep, String dataContato,
			LocalDate dataResposta, String telefone) {

		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.cep = cep;
		this.telefone = telefone;
		this.dataContato = dataContato;
		this.dataResposta = dataResposta;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

    public String getCep() {
        return cep;
    }
    

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getTelefone() {
        return telefone;
    }
    

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	
	public String getDataContato() {
		return dataContato;
	}

	public void setDataContato(String dataContato) {
		this.dataContato = dataContato;
	}

	public LocalDate getDataResposta() {
		return dataResposta;
	}

	public void setDataResposta(LocalDate dataResposta) {
		this.dataResposta = dataResposta;
	}
	
	
	
	
}