package ifba.exemplo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Usuario")
	public class Usuario {
		
		@Id
		@Column (name="id_usuario")
		 private int id_usuario;
		
		@Column (name="nm_usuario")
		 private String nm_usuario; 
		
		@Column (name="dt_cadastro")
		 private Date dt_cadastro; 
		
		@Column (name="sexo")
		 private char sexo;    
		
		@Column (name="email")
		 private String email;    
		
		@Column (name=" senha")
		 private String senha;
		
		@Column (name="cpf")
		 private String cpf;     
		
		@Column (name="nacionalidade")
		 private String nacionalidade; 
		
		@Column (name="escolaridade")
		 private String escolaridade; 
		
		@Column (name="cargo")
		 private String cargo;
		 
		public Usuario() {}
		

		public Usuario(int id_usuario, String nm_usuario, Date dt_cadastro, char sexo, String email, String senha,
				String cpf, String nacionalidade, String escolaridade, String cargo) {
			super();
			this.id_usuario = id_usuario;
			this.nm_usuario = nm_usuario;
			this.dt_cadastro = dt_cadastro;
			this.sexo = sexo;
			this.email = email;
			this.senha = senha;
			this.cpf = cpf;
			this.nacionalidade = nacionalidade;
			this.escolaridade = escolaridade;
			this.cargo = cargo;
		}
		public int getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}
		public String getNm_usuario() {
			return nm_usuario;
		}
		public void setNm_usuario(String nm_usuario) {
			this.nm_usuario = nm_usuario;
		}
		public Date getDt_cadastro() {
			return dt_cadastro;
		}
		public void setDt_cadastro(Date dt_cadastro) {
			this.dt_cadastro = dt_cadastro;
		}
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public String getEscolaridade() {
			return escolaridade;
		}
		public void setEscolaridade(String escolaridade) {
			this.escolaridade = escolaridade;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		 
		
}
